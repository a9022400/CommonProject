package com.gunner.model.pojo;

import java.io.Serializable;

/**
 * paper表(Paper)实体类
 *
 * @author makejava
 * @since 2019-03-26 15:58:21
 */
public class Paper implements Serializable {
    private static final long serialVersionUID = -64825096204848481L;
    //paperID
    private Long paperId;
    //paper名称
    private String name;
    //paper数量
    private Integer number;
    //paper描述
    private String detail;
    private String pageCount;
    private String allCount;

    public Long getPaperId() {
        return paperId;
    }

    public void setPaperId(Long paperId) {
        this.paperId = paperId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getPageCount() {return pageCount;}
    public void setPageCount(String pageCount) {this.pageCount = pageCount;}
    public String getAllCount() {return allCount;}
    public void setAllCount(String allCount) {this.allCount = allCount;}
}