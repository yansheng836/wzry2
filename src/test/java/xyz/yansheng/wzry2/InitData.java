package xyz.yansheng.wzry2;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import xyz.yansheng.wzry2.bean.Hero;
import xyz.yansheng.wzry2.service.HeroService;
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

    /**
     * 初始化Hero表的基本数据
     */
//    @Test
    public void initHeroData() {
        List<Hero> heroList = SpiderUtil.getHeroList();
        log.debug("MainController size:{}", heroList.size());
        for (Hero hero : heroList) {
            log.debug(hero.toString());
             heroService.insert(hero.replaceNull());
        }
    }

    /**
     * 初始化Hero表的基本数据
     */
    @Test
    public void initSkinData() {
        List<Hero> heroList = SpiderUtil.getHeroList();
        log.debug("MainController size:{}", heroList.size());
        for (Hero hero : heroList) {
            log.debug(hero.toString());

        }
    }
}
