package xyz.yansheng.wzry2.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.yansheng.wzry2.bean.Hero;
import xyz.yansheng.wzry2.service.HeroService;

/**
 * (Hero)表控制层
 *
 * @author makejava
 * @since 2020-09-24 23:34:28
 */
@RestController
@RequestMapping("hero")
public class HeroController {
    /**
     * 服务对象
     */
    @Resource
    private HeroService heroService;

    /**
     * 通过主键查询单条数据
     *
     * @param id
     *            主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Hero selectOne(Integer id) {
        return this.heroService.queryById(id);
    }

}