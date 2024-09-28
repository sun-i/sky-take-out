package com.sky.mapper;

import com.sky.entity.Setmeal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealMapper {

    /**
     * 根据分类 id 查询套餐
     * @param categoryId
     * @return
     */
    @Select("SELECT * FROM setmeal where category_id = #{categoryId}")
    List<Setmeal> getByCategoryId(Long categoryId);
}
