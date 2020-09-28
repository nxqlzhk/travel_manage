package cn.ecut.dao;

import cn.ecut.domain.Category;

import java.util.List;

/**
 * @author Wko
 */
public interface CategoryDao {
    /**
     * 查询所有
     * @return list
     */
     List<Category> findAll();
}
