package xyz.yansheng.wzry2.service;

import java.util.List;

import xyz.yansheng.wzry2.bean.Hero;

/**
 * (Hero)表服务接口
 *
 * @author makejava
 * @since 2020-09-24 23:34:27
 */
public interface HeroService {

    /**
     * 通过ID查询单条数据
     *
     * @param ename
     *            主键
     * @return 实例对象
     */
    Hero queryById(Integer ename);

    /**
     * 查询多条数据
     *
     * @param offset
     *            查询起始位置
     * @param limit
     *            查询条数
     * @return 对象列表
     */
    List<Hero> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param hero
     *            实例对象
     * @return 实例对象
     */
    Hero insert(Hero hero);

    /**
     * 修改数据
     *
     * @param hero
     *            实例对象
     * @return 实例对象
     */
    Hero update(Hero hero);

    /**
     * 通过主键删除数据
     *
     * @param ename
     *            主键
     * @return 是否成功
     */
    boolean deleteById(Integer ename);

}