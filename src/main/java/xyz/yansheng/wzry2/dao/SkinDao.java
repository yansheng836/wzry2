package xyz.yansheng.wzry2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import xyz.yansheng.wzry2.bean.Skin;

/**
 * (Skin)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-26 18:45:48
 */
public interface SkinDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ename
     *            主键
     * @return 实例对象
     */
    Skin queryById(Integer ename);

    /**
     * 查询指定行数据
     *
     * @param offset
     *            查询起始位置
     * @param limit
     *            查询条数
     * @return 对象列表
     */
    List<Skin> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param skin
     *            实例对象
     * @return 对象列表
     */
    List<Skin> queryAll(Skin skin);

    /**
     * 新增数据
     *
     * @param skin
     *            实例对象
     * @return 影响行数
     */
    int insert(Skin skin);

    /**
     * 修改数据
     *
     * @param skin
     *            实例对象
     * @return 影响行数
     */
    int update(Skin skin);

    /**
     * 通过主键删除数据
     *
     * @param ename
     *            主键
     * @return 影响行数
     */
    int deleteById(Integer ename);

}