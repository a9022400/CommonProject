package com.gunner.service;

import com.gunner.model.pojo.Paper;
import java.util.List;

/**
 * paper表(Paper)表服务接口
 *
 * @author makejava
 * @since 2019-03-26 15:58:26
 */
public interface PaperService {

    /**
     * 通过ID查询单条数据
     *
     * @param paperId 主键
     * @return 实例对象
     */
    Paper queryById(Long paperId);

    /**
     * 查询多条数据
     *
     * @param paper 查询对象
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    public List<Paper> queryAllByLimit(Paper paper,int offset, int limit);

    /**
     * 新增数据
     *
     * @param paper 实例对象
     * @return 实例对象
     */
    Paper insert(Paper paper);

    /**
     * 修改数据
     *
     * @param paper 实例对象
     * @return 实例对象
     */
    Paper update(Paper paper);

    /**
     * 通过主键删除数据
     *
     * @param paperId 主键
     * @return 是否成功
     */
    boolean deleteById(Long paperId);

}