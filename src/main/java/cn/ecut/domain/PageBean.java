package cn.ecut.domain;

import java.util.List;

/**
 * 分页对象:
 *    总记录数
 *    总页数
 *    当前页码
 *    每页显示的条数
 * @author Wko
 */
public class PageBean<T> {

    private int totalCount;

    private int totalPage;

    private int currentPage;

    private int pageSize;


    /**
     * 每页显示的数据集合
     */
    private List<T> list;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
