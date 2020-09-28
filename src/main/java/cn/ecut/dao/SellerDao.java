package cn.ecut.dao;

import cn.ecut.domain.Seller;

/**
 * @author Wko
 */
public interface SellerDao {
    /**
     * 根据id查询
     * @param id 1
     * @return 1
     */
    Seller findById(int id);
}
