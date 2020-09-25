package xyz.yansheng.wzry2.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.alibaba.fastjson.JSON;

import lombok.extern.slf4j.Slf4j;
import xyz.yansheng.wzry2.bean.Hero;

/**
 * 爬虫工具类
 *
 * @author yansheng
 * @date 2020/9/24
 */
@Slf4j
public class SpiderUtil {

    public static void main(String[] args) {
        List<Hero> heroList = getHeroList();
        for (Hero hero : heroList) {
            log.debug(hero.toString());
        }
    }

    /**
     * 获得（原始）英雄列表信息：https://pvp.qq.com/web201605/js/herolist.json
     *
     * @param
     * @return
     */
    public static List<Hero> getHeroList() {

        // String jsonUrl = "https://pvp.qq.com/web201605/js/herolist.json";
        String path = "H:\\Workspaces\\MyEclipse2017\\wzry2\\src\\main\\resources\\static\\herolist.json";
        String jsonListString = null;
        try {
            jsonListString = FileUtils.readFileToString(new File(path), "UTF8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // log.debug(jsonListString);

        List<Hero> heroList = JSON.parseArray(jsonListString, Hero.class);
        log.debug("size:{}", heroList.size());
        assert heroList != null;
        // for (Hero hero : heroList) {
        // log.debug(hero.toString());
        // }

        return heroList;

    }

    public static boolean isUrlRight(String url) {
        Document document;
        try {
            // 设置连接超时时间
            Connection con = Jsoup.connect(url).userAgent(
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36")
                .timeout(30000);

            Connection.Response response = con.execute();

            if (response.statusCode() == 200) {
                document = con.get();
                return true;
            } else {
                log.error("图片地址错误，响应码为：{}", response.statusCode());
                return false;
            }
        } catch (IOException e) {
            log.error("读取图片是发生异常，信息为：{}", e.getMessage());
            e.printStackTrace();
            return false;
        }

    }

    /**
     * 查看URL对应的图片是否存在
     *
     * @param String imageUrl
     * @return boolean
     */
    public static boolean isUrlRight2(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            // 返回一个 URLConnection 对象，它表示到 URL 所引用的远程对象的连接。
            URLConnection uc = url.openConnection();
            // 打开的连接读取的输入流，注意：如果图片不存在，这里会抛出异常！！！
            InputStream in = uc.getInputStream();
            in.close();
            return true;
        } catch (IOException e) {
            log.error("图片地址不存在，错误地址为：{}", imageUrl);
            return false;
        }
    }

}
