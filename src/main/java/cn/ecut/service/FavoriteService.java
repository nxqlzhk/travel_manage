package cn.ecut.service;

/**
 * @author Wko
 */
public interface FavoriteService {

    /**
     * 判断是否收藏
     * @param rid 1
     * @param uid 1
     * @return 1
     */
    public boolean isFavorite(String rid, int uid);

    /**
     * 添加收藏
     * @param rid 1
     * @param uid 1
     */
    void add(String rid, int uid);
}
