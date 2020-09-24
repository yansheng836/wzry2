package xyz.yansheng.wzry2.controller;

import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import springfox.documentation.annotations.ApiIgnore;
import xyz.yansheng.wzry2.bean.Hero;
import xyz.yansheng.wzry2.service.HeroService;
import xyz.yansheng.wzry2.util.SpiderUtil;

import java.util.List;

/**
 * 详见：https://github.com/yansheng836/hero-skin-images
 * 
 * @author yansheng
 * @date 2020/04/29
 */
@Controller
// @RequestMapping("/*")
@Api(tags = "主要页面前端控制器接口", value = "主要页面前端控制器接口")
@ApiIgnore
@Slf4j
public class MainController {

    @Autowired
    private HeroService heroService;


    @GetMapping({"/", "/index.html"})
    public String index() {

        List<Hero> heroList = SpiderUtil.getHeroList();
        log.debug("MainController size:{}", heroList.size());
        for (Hero hero : heroList) {
            log.debug(hero.toString());
            heroService.insert(hero);
        }

        return "index";
    }

    @RequestMapping(value = {"/404", "/404.html"}, method = {RequestMethod.GET})
    public String get404(HttpServletResponse response) {
        response.setStatus(404);
        return "404";
    }

}
