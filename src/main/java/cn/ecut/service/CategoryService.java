package cn.ecut.service;

import cn.ecut.domain.Category;

import java.util.List;

/**
 * @author Wko
 */
public interface CategoryService {

    /**
     * 查询所有分类数据
     * @return 1
     */
     List<Category> findAll();
}
