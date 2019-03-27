package com.gunner.service.impl;

import com.gunner.model.pojo.Paper;
import com.gunner.dao.mapper.PaperMapper;
import com.gunner.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * paper表(Paper)表服务实现类
 *
 * @author makejava
 * @since 2019-03-26 15:58:26
 */
@Service("paperService")
public class PaperServiceImpl implements PaperService {
    @Resource
    private PaperMapper paperMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param paperId 主键
     * @return 实例对象
     */
    @Override
    public Paper queryById(Long paperId) {
        return this.paperMapper.queryById(paperId);
    }

    /**
     * 查询多条数据
     *
     * @param paper 查询对象
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Paper> queryAllByLimit(Paper paper,int offset, int limit) {
        return this.paperMapper.queryAllByLimit(paper,offset, limit);
    }

    /**
     * 新增数据
     *
     * @param paper 实例对象
     * @return 实例对象
     */
    @Override
    public Paper insert(Paper paper) {
        this.paperMapper.insert(paper);
        return paper;
    }

    /**
     * 修改数据
     *
     * @param paper 实例对象
     * @return 实例对象
     */
    @Override
    public Paper update(Paper paper) {
        this.paperMapper.update(paper);
        return this.queryById(paper.getPaperId());
    }

    /**
     * 通过主键删除数据
     *
     * @param paperId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long paperId) {
        return this.paperMapper.deleteById(paperId) > 0;
    }
}