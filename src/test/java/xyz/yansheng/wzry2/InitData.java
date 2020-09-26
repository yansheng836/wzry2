package xyz.yansheng.wzry2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import xyz.yansheng.wzry2.bean.Hero;
import xyz.yansheng.wzry2.bean.Skin;
import xyz.yansheng.wzry2.service.HeroService;
import xyz.yansheng.wzry2.service.SkinService;
import xyz.yansheng.wzry2.util.SpiderUtil;

/**
 * description
 *
 * @author yansheng
 * @date 2020/9/26
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class InitData {

    @Autowired
    private HeroService heroService;

    @Autowired
    private SkinService skinService;

    /**
     * 初始化Hero表的基本数据
     */
    // @Test
    public void initHeroData() {
        List<Hero> heroList = SpiderUtil.getHeroList();
        log.debug("MainController size:{}", heroList.size());
        for (Hero hero : heroList) {
            log.debug(hero.toString());
            heroService.insert(hero.replaceNull());
        }
    }

    @Test
    public void testSplit() {
        String string = "苍天翔龙|忍●炎影|未来纪元|皇家上将|嘻哈天王|白执事|引擎之心";
        String[] skinNames = string.split("\\|");
        Assert.assertEquals(7, skinNames.length);
        for (String skinName : skinNames) {
            log.debug(skinName);
        }

        String string2 = "苍天翔龙";
        String[] skinNames2 = string2.split("\\|");
        Assert.assertEquals(1, skinNames2.length);
        for (String skinName : skinNames2) {
            log.debug(skinName);
        }

        // 特殊情况，为空字符串时，数组长度也为1
        String string3 = "";
        String[] skinNames3 = string3.split("\\|");
        Assert.assertEquals(1, skinNames3.length);
        for (String skinName : skinNames3) {
            log.debug(skinName);
        }
    }

    /**
     * 初始化Hero表的基本数据
     */
    @Test
    public void initSkinData() {
        List<Hero> heroList = SpiderUtil.getHeroList();
        log.debug("MainController size:{}", heroList.size());

        List<Skin> skinList = new ArrayList<>();

        for (Hero hero : heroList) {
            log.debug(hero.toString());

            if (hero.getSkinName() != null) {
                // 获取壁纸列表信息
                String[] skinNames = hero.getSkinName().split("\\|");
                // 猜测英雄的皮肤图片是否存在
                for (int i = 0; i < skinNames.length; i++) {
                    Skin skin = new Skin(hero.getEname(), i + 1, skinNames[i]);
                    boolean isExist = SpiderUtil.isUrlRight2(skin.getPhoneSmallskinUrl());
                    if (isExist) {
                        log.info(skin.toString());
                        // 将数据插入到skin表
                        // skinService.insert(skin);
                        Skin skin1 = skinService.queryBy2Id(hero.getEname(), i + 1);
                        log.info("skin:{}", skin.toString());
                        log.info("skin1:{}", skin1.toString());
                        System.out.println(skin.equals(skin1));
                        if (!skin.equals(skin1)) {
                            skinService.insert(skin);
                        } else {
                            // skinService.update(skin);
                            log.debug("skin已存在：{},{}", skin.getEname(), skin.getSkinId());
                        }

                    } else {
                        log.error(skin.toString());
                        break;
                    }
                }
            } else {
                log.error("{}的皮肤名为null", hero.getEname());
            }

        }

    }
}
