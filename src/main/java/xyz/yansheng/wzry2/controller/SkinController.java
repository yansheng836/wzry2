package xyz.yansheng.wzry2.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.yansheng.wzry2.bean.Skin;
import xyz.yansheng.wzry2.service.SkinService;

/**
 * (Skin)表控制层
 *
 * @author makejava
 * @since 2020-09-26 18:45:48
 */
@RestController
@RequestMapping("skin")
public class SkinController {
    /**
     * 服务对象
     */
    @Resource
    private SkinService skinService;

    /**
     * 通过主键查询单条数据
     *
     * @param id
     *            主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Skin selectOne(Integer id) {

        return this.skinService.queryById(id);
    }

}