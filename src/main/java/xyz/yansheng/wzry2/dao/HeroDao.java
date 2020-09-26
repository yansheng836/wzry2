package xyz.yansheng.wzry2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.yansheng.wzry2.bean.Hero;

/**
 * (Hero)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-24 23:34:26
 */
public interface HeroDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ename
     *            主键
     * @return 实例对象
     */
    Hero queryById(Integer ename);

    /**
     * 查询指定行数据
     *
     * @param offset
     *            查询起始位置
     * @param limit
     *            查询条数
     * @return 对象列表
     */
    List<Hero> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param hero
     *            实例对象
     * @return 对象列表
     */
    List<Hero> queryAll(Hero hero);

    /**
     * 新增数据
     *
     * @param hero
     *            实例对象
     * @return 影响行数
     */
    int insert(Hero hero);

    /**
     * 修改数据
     *
     * @param hero
     *            实例对象
     * @return 影响行数
     */
    int update(Hero hero);

    /**
     * 通过主键删除数据
     *
     * @param ename
     *            主键
     * @return 影响行数
     */
    int deleteById(Integer ename);

}