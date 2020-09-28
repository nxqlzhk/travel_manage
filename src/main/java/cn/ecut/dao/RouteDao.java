package cn.ecut.dao;

import cn.ecut.domain.Route;

import java.util.List;

/**
 * @author Wko
 */
public interface RouteDao {

    /**
     * 根据cid查询总记录数
     * @param cid 1
     * @param rname 1
     * @return 1
     */
    int findTotalCount(int cid, String rname);

    /**
     * 根据cid，start,pageSize查询当前页的数据集合
     * @param cid 1
     * @param start 1
     * @param pageSize 1
     *  @param rname 1
     * @return 1
     */
    List<Route> findByPage(int cid, int start, int pageSize, String rname);

    /**
     * 根据id查询
     * @param rid 1
     * @return 1
     */
    Route findOne(int rid);
}
