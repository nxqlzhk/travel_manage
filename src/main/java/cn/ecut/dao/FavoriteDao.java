package cn.ecut.dao;

import cn.ecut.domain.Favorite;

/**
 * @author Wko
 */
public interface FavoriteDao {

    /**
     * 根据rid和uid查询收藏信息
     * @param rid 1
     * @param uid 1
     * @return 1
     */
    Favorite findByRidAndUid(int rid, int uid);

    /**
     * 根据rid 查询收藏次数
     * @param rid 1
     * @return 1
     */
    int findCountByRid(int rid);

    /**
     * 添加收藏
     * @param i 1
     * @param uid 1
     */
    void add(int i, int uid);
}
