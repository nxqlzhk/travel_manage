package cn.ecut.service;

import cn.ecut.domain.PageBean;
import cn.ecut.domain.Route;

/**
 * 线路Service
 * @author Wko
 */
public interface RouteService {

    /**
     * 根据类别进行分页查询
     * @param cid 抓取数据的来源id
     * @param currentPage 当前页码
     * @param pageSize 每页显示的条数
     * @param rname 1
     * @return 1
     */
    PageBean<Route> pageQuery(int cid, int currentPage, int pageSize, String rname);

    /**
     * 根据id查询
     * @param rid 线路id
     * @return 1
     */
    Route findOne(String rid);
}
