package cn.ecut.dao;

import cn.ecut.domain.RouteImg;

import java.util.List;

/**
 * @author Wko
 */
public interface RouteImgDao {

    /**
     * 根据route的id查询图片
     * @param rid 1
     * @return 1
     */
    List<RouteImg> findByRid(int rid);
}
