package xyz.yansheng.wzry2.bean;

import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * 测试Skin
 *
 * @author yansheng
 * @date 2020/9/25
 */
@Slf4j
public class SkinTest {

    /**
     * { "ename": 105, "cname": "廉颇", "title": "正义爆轰", "new_type": 0, "hero_type": 3, "skin_name": "正义爆轰|地狱岩魂" }
     */
    @Test
    public void testSkin() {
        // Hero hero = new Hero(105, "廉颇", "正义爆轰", 0, 3,1, "正义爆轰|地狱岩魂");
        // log.debug(hero.toString());
        // Assert.assertTrue(hero.toString() != null);

        Skin skin = new Skin(105, 1, "正义爆轰");
        Assert.assertEquals(105, (int)skin.getEname());
        Assert.assertEquals("https://game.gtimg.cn/images/yxzj/img201606/heroimg/105/105-smallskin-1.jpg",
            skin.getPhoneSmallskinUrl());
        Assert.assertEquals("https://game.gtimg.cn/images/yxzj/img201606/heroimg/105/105-mobileskin-1.jpg",
            skin.getPhoneMobileskinUrl());
        Assert.assertEquals("https://game.gtimg.cn/images/yxzj/img201606/heroimg/105/105-bigskin-1.jpg",
            skin.getPhoneBigskinUrl());
        Assert.assertEquals("https://game.gtimg.cn/images/yxzj/img201606/skin/hero-info/105/105-mobileskin-1.jpg",
            skin.getWallpaperMobileskinUrl());
        Assert.assertEquals("https://game.gtimg.cn/images/yxzj/img201606/skin/hero-info/105/105-bigskin-1.jpg",
            skin.getWallpaperBigskinUrl());
        log.info("skin:{}", skin);
    }
}
