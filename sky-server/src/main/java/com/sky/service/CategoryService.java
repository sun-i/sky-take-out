package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.result.PageResult;

public interface CategoryService {
    /**
     * 修改分类
     * @param categoryDTO
     */
    void update(CategoryDTO categoryDTO);

    /**
     * 分类分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    PageResult page(CategoryPageQueryDTO categoryPageQueryDTO);


    /**
     * 启用禁用分类
     * @param status
     * @param id
     */
    void startAndStop(int status, Long id);

    /**
     * 根据 id 删除分类
     * @param id
     */
    void delete(Long id);

    /**
     * 新增分类
     * @param categoryDTO
     */
    void add(CategoryDTO categoryDTO);
}
