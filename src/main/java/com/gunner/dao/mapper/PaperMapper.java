package com.gunner.dao.mapper;

import com.gunner.model.pojo.Paper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * paper表(Paper)表数据库访问层
 *
 * @author makejava
 * @since 2019-03-26 15:58:25
 */
public interface PaperMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param paperId 主键
     * @return 实例对象
     */
    Paper queryById(Long paperId);
 
    /**
     * 查询指定行数据
     *
     * @param paper 实例对象
     * @param offset 当前页面
     * @param limit 每页条数
     * @return 对象列表
     */
    List<Paper> queryAllByLimit(Paper paper, @Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询,判断是否存在该实体
     *
     * @param paper 实例对象
     * @return 对象列表
     */
    List<Paper> queryAll(Paper paper);

    /**
     * 新增数据
     *
     * @param paper 实例对象
     * @return 影响行数
     */
    int insert(Paper paper);

    /**
     * 修改数据
     *
     * @param paper 实例对象
     * @return 影响行数
     */
    int update(Paper paper);

    /**
     * 通过主键删除数据
     *
     * @param paperId 主键
     * @return 影响行数
     */
    int deleteById(Long paperId);
}