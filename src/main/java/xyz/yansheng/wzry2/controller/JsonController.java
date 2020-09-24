package xyz.yansheng.wzry2.controller;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import xyz.yansheng.wzry2.bean.ErrorInfo;
import xyz.yansheng.wzry2.bean.WzryWallpaper;

/**
 * Json数据前端控制器 详见：https://github.com/yansheng836/hero-skin-images
 * 
 * @author yansheng
 * @date 2020/04/29
 */
@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/json")
@Api(value = "Json数据接口", tags = "Json数据接口")
@Slf4j
public class JsonController {

    private static Map<String, String> wzryMaps = new HashMap<String, String>(400);
    private static Map<String, String> wzryPhoneBigskinMap = new HashMap<String, String>(400);
    private static Map<String, String> wzryWallpaperBigskinMap = new HashMap<String, String>(400);

    /**
     * map的容量，应该是367
     */
    private static int mapSize = 0;

    /**
     * 字符串today
     */
    private static String TODAY = "today";

    /**
     * 字符串now
     */
    private static String NOW = "now";

    static {
        // 打包后，识别不了file
        // File file = null;
        // file = ResourceUtils.getFile("classpath:static/wzry_wallpaper367.json");
        String pathname = "static/wzry_wallpaper367.json";
        ClassPathResource resource = new ClassPathResource(pathname);
        InputStream inputStream = null;
        try {
            inputStream = resource.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String text = null;
        try {
            // text = FileUtils.readFileToString(file, "utf8");
            text = IOUtils.toString(inputStream, "utf-8");
            // logger.info("text:" + text);
        } catch (IOException e) {
            log.error("读取json文件出错！");
            e.printStackTrace();
        }

        wzryMaps = JSON.parseObject(text, Map.class);
        wzryPhoneBigskinMap = JSON.parseObject(wzryMaps.get("phone-bigskin"), Map.class);
        wzryWallpaperBigskinMap = JSON.parseObject(wzryMaps.get("wallpaper-bigskin"), Map.class);
        // wzryMap.forEach((k, v) -> {
        // logger.info(k + " --> " + v);
        // });
        mapSize = wzryPhoneBigskinMap.size();
    }

    private static String errorString = "资源不存在，可能是id范围不正常，请输入1-" + mapSize + "之间的数!!";

    /**
     * 访问路径为：/json/wallpaper-bigskin.html 或者 /json/wallpaper-bigskin.html?id={id}
     * 
     * @param id
     */
    @GetMapping("/wallpaper-bigskin.html")
    @ApiOperation(value = "获取大屏壁纸图片的json数据", notes = "获取大屏壁纸图片的json数据的说明")
    @ApiImplicitParam(name = "id", value = "壁纸id，可选值：today,now,数字", defaultValue = "today", required = false,
        paramType = "query", dataType = "String")
    public Object getWallpaperBigskin(@RequestParam(value = "id", required = false, defaultValue = "today") String id) {
        log.debug("传入参数id:{}", id);

        // 如果为空或者值为"today",表示求当天的
        if ((id == null) || ("".equals(id)) || (TODAY.equalsIgnoreCase(id))) {
            int key = LocalDateTime.now().getDayOfYear();
            return new WzryWallpaper(key, wzryWallpaperBigskinMap.get(new Integer(key).toString()));
        } else {
            // 如果值为"now"，每次刷新都随机生成一个新的
            if (NOW.equalsIgnoreCase(id)) {
                int key = new Random().nextInt(mapSize);
                return new WzryWallpaper(key, wzryWallpaperBigskinMap.get(new Integer(key).toString()));
            } else {
                // 根据id返回对应天数的数据，注意需要判断id范围和类型是否正确！
                try {
                    int key = new Integer(id);
                    if ((key > 0) && (key < mapSize)) {
                        return new WzryWallpaper(key, wzryWallpaperBigskinMap.get(id));
                    } else {
                        return new ErrorInfo(404, errorString);
                    }
                } catch (NumberFormatException e) {
                    return new ErrorInfo(404, errorString);
                }
            }
        }
    }

    /**
     * 访问路径为：/json/phone-bigskin.html 或者 /json/phone-bigskin.html?id={id}
     * 
     * @param id
     * @return
     */
    @GetMapping("/phone-bigskin.html")
    @ApiOperation(value = "获取较小屏壁纸图片的json数据", notes = "获取较小屏壁纸图片的json数据的说明")
    @ApiImplicitParam(name = "id", value = "壁纸id，可选值：today,now,数字", defaultValue = "today", required = false,
        paramType = "query", dataType = "String")
    public Object getPhoneBigskin(@RequestParam(value = "id", required = false, defaultValue = "today") String id) {
        log.debug("传入参数id:{}", id);

        // 如果为空或者值为"today",表示求当天的
        if ((id == null) || ("".equals(id)) || (TODAY.equalsIgnoreCase(id))) {
            int key = LocalDateTime.now().getDayOfYear();
            return new WzryWallpaper(key, wzryPhoneBigskinMap.get(new Integer(key).toString()));
        } else {
            // 如果值为"now"，每次刷新都随机生成一个新的
            if (NOW.equalsIgnoreCase(id)) {
                int key = new Random().nextInt(mapSize);
                return new WzryWallpaper(key, wzryPhoneBigskinMap.get(new Integer(key).toString()));
            } else {
                // 根据id返回对应天数的数据，注意需要判断id范围和类型是否正确！
                try {
                    int key = new Integer(id);
                    if ((key > 0) && (key < mapSize)) {
                        return new WzryWallpaper(key, wzryPhoneBigskinMap.get(id));
                    } else {
                        return new ErrorInfo(404, errorString);
                    }
                } catch (NumberFormatException e) {
                    return new ErrorInfo(404, errorString);
                }
            }
        }
    }

}
