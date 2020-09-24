package xyz.yansheng.wzry2.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

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
}
