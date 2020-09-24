package xyz.yansheng.wzry2.bean;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * 测试Hero
 *
 * @author yansheng
 * @date 2020/9/24
 */
@Slf4j
public class HeroTest {

    /**
     * { "ename": 105, "cname": "廉颇", "title": "正义爆轰", "new_type": 0, "hero_type": 3, "skin_name": "正义爆轰|地狱岩魂" }
     */
    @Test
    public void testHero() {
        Hero hero = new Hero(105, "廉颇", "正义爆轰", 0, 3,1, "正义爆轰|地狱岩魂");
        log.debug(hero.toString());
        Assert.assertTrue(hero.toString() != null);
    }
}
