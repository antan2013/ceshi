package cn.dksy.utils;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author JAVASM
 * @title: PageBean
 * @projectName 综合案例（用户信息）
 * @description: 分页对象
 * @date 2019/7/29 20:00
 */

public class PageBean<T> {
    private int totalCount;//查询的总记录数，需要service传入   set
    private int totalPage;//总页码；   可不传入，自己可计算，直接私有set，对外提供公有访问
    private List<T> list;//页面上的对象类型，使用泛型，复用  传入   set
    private int currentPage;//当前页面    传入   set
    private int rows;//每页展示的对象个数 ,需要传入     set
    private int start;//当前页面查询的开始记录数

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    private void setTotalPage() {
        totalPage = (totalCount % rows == 0 ) ? (totalCount / rows):(totalCount / rows) + 1;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getStart() {
        return start;
    }

    private void setStart() {
        start = (currentPage - 1) * rows;
    }

    public PageBean() {
    }
    public PageBean(int totalCount, int currentPage, int rows) {
        this.totalCount = totalCount;
        this.rows = rows;
        this.currentPage = currentPage;
        this.setTotalPage();
        this.setStart();
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", list=" + list +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                ", start=" + start +
                '}';
    }
}
