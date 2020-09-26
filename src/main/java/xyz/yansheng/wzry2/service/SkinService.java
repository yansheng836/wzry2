package xyz.yansheng.wzry2.service;

import java.util.List;

import xyz.yansheng.wzry2.bean.Skin;

/**
 * (Skin)表服务接口
 *
 * @author makejava
 * @since 2020-09-26 18:45:48
 */
public interface SkinService {

    /**
     * 通过ID查询单条数据
     *
     * @param ename
     *            主键
     * @return 实例对象
     */
    Skin queryById(Integer ename);

    /**
     * 通过2个ID查询单条数据
     *
     * @param ename
     *            主键
     * @return 实例对象
     */
    Skin queryBy2Id(Integer ename,Integer skinId);

    /**
     * 查询多条数据
     *
     * @param offset
     *            查询起始位置
     * @param limit
     *            查询条数
     * @return 对象列表
     */
    List<Skin> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param skin
     *            实例对象
     * @return 实例对象
     */
    Skin insert(Skin skin);

    /**
     * 修改数据
     *
     * @param skin
     *            实例对象
     * @return 实例对象
     */
    Skin update(Skin skin);

    /**
     * 通过主键删除数据
     *
     * @param ename
     *            主键
     * @return 是否成功
     */
    boolean deleteById(Integer ename);

}