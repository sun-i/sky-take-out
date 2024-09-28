package com.sky.mapper;

import com.sky.entity.Dish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishMapper {
    /**
     * 根据分类 id 查询菜品
     * @param categoryId
     * @return
     */
    @Select("SELECT * FROM dish where category_id = #{categoryId}")
    List<Dish> getByCategoryId(Long categoryId);
}
