package com.gunner.controller;

import com.gunner.model.pojo.Paper;
import com.gunner.service.PaperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * paper表(Paper)表控制层
 *
 * @author makejava
 * @since 2019-03-26 15:58:27
 */
@Controller
@RequestMapping("paper")
public class PaperController {
    /**
     * 服务对象
     */
    @Resource
    private PaperService paperService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ResponseBody
    @RequestMapping("selectOne")
    public Paper selectOne(Long id) {
        System.out.println(id);
        Paper paper=this.paperService.queryById(id);
        return paper;
    }

}