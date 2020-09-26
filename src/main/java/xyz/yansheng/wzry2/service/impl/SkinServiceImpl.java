package xyz.yansheng.wzry2.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import xyz.yansheng.wzry2.dao.SkinDao;
import xyz.yansheng.wzry2.bean.Skin;
import xyz.yansheng.wzry2.service.SkinService;

/**
 * (Skin)表服务实现类
 *
 * @author makejava
 * @since 2020-09-26 18:45:48
 */
@Service("skinService")
public class SkinServiceImpl implements SkinService {
    @Resource
    private SkinDao skinDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ename
     *            主键
     * @return 实例对象
     */
    @Override
    public Skin queryById(Integer ename) {
        return this.skinDao.queryById(ename);
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
    public List<Skin> queryAllByLimit(int offset, int limit) {
        return this.skinDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param skin
     *            实例对象
     * @return 实例对象
     */
    @Override
    public Skin insert(Skin skin) {
        this.skinDao.insert(skin);
        return skin;
    }

    /**
     * 修改数据
     *
     * @param skin
     *            实例对象
     * @return 实例对象
     */
    @Override
    public Skin update(Skin skin) {
        this.skinDao.update(skin);
        return this.queryById(skin.getEname());
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
        return this.skinDao.deleteById(ename) > 0;
    }
}