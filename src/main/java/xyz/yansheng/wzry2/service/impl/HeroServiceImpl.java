package xyz.yansheng.wzry2.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import xyz.yansheng.wzry2.bean.Hero;
import xyz.yansheng.wzry2.dao.HeroDao;
import xyz.yansheng.wzry2.service.HeroService;

/**
 * (Hero)表服务实现类
 *
 * @author makejava
 * @since 2020-09-24 23:34:27
 */
@Service("heroService")
public class HeroServiceImpl implements HeroService {

    @Resource
    private HeroDao heroDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ename
     *            主键
     * @return 实例对象
     */
    @Override
    public Hero queryById(Integer ename) {
        return this.heroDao.queryById(ename);
    }

    /**
     * 查询多条数据
     *
     * @param offset
     *            查询起始位置
     * @param limit
     *            查询条数
     * @return 对象列表
     */
    @Override
    public List<Hero> queryAllByLimit(int offset, int limit) {
        return this.heroDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param hero
     *            实例对象
     * @return 实例对象
     */
    @Override
    public Hero insert(Hero hero) {
        this.heroDao.insert(hero);
        return hero;
    }

    /**
     * 修改数据
     *
     * @param hero
     *            实例对象
     * @return 实例对象
     */
    @Override
    public Hero update(Hero hero) {
        this.heroDao.update(hero);
        return this.queryById(hero.getEname());
    }

    /**
     * 通过主键删除数据
     *
     * @param ename
     *            主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer ename) {

        return this.heroDao.deleteById(ename) > 0;
    }
}