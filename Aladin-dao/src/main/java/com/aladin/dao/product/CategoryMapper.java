package com.aladin.dao.product;

import com.aladin.pojo.product.Category;

import java.util.List;

public interface CategoryMapper {



    /**
     * @param name
     * 通过商品分类名查找分类
     */
    Category findCategoryByName(String name);

    /**
     * @ categoryId
     * 通过分类id查找分类
     */
    Category findCategoryById(Long categoryId);

    /**
     * @param parentId
     * 通过父分类id查询子分类
     */
    List<Category> findCategoryByParentId(Long parentId);
}