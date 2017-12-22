package com.yinjk.web.core.vo;

import com.github.pagehelper.Page;

import java.util.ArrayList;
import java.util.List;

public class PageVO<T>  {

    /**
     * 默认分页
     */
    static int PAGE_SIZE = 25;

    /**当前页*/
    Integer pageNum;
    /**每页条数*/
    Integer pageSize;
    /**总条数*/
    Long total;
    /**数据对象*/
    List<T> data;

    public PageVO() {
    }

    public PageVO(Page page) {
        this.pageNum = page == null ? 1 : page.getPageNum();
        this.pageSize = page == null ? PAGE_SIZE : page.getPageSize();
        this.total = (page == null ? 0 : page.getTotal());
        this.data = (page == null || page.getResult() == null) ? new ArrayList<>(0) : page.getResult();
    }

    public Integer getPageNum() {
        return pageNum == null ? 1 : pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize == null ? PAGE_SIZE : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total == null ? 0 : total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}