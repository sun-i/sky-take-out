package com.sky.controller.admin;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 分类管理
 */
@Slf4j
@RestController
@RequestMapping("/admin/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 修改分类
     * @param categoryDTO
     * @return
     */
    @PutMapping
    public Result update(@RequestBody CategoryDTO categoryDTO) {
        categoryService.update(categoryDTO);
        return Result.success();
    }

    /**
     * 分类分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    @GetMapping("/page")
    public Result<PageResult> page(CategoryPageQueryDTO categoryPageQueryDTO) {
        PageResult pageResult = categoryService.page(categoryPageQueryDTO);
        return Result.success(pageResult);
    }

    /**
     * 启用禁用分类
     * @param status
     * @param id
     * @return
     */
    @PostMapping("/status/{status}")
    public Result startAndStop(@PathVariable int status, Long id) {
        categoryService.startAndStop(status, id);
        return Result.success();
    }

    /**
     * 根据 id 删除分类
     * @param id
     * @return
     */
    @DeleteMapping
    public Result delete(Long id) {
        categoryService.delete(id);
        return Result.success();
    }

    /**
     * 新增分类
     * @param categoryDTO
     * @return
     */
    @PostMapping
    public Result add(@RequestBody CategoryDTO categoryDTO) {
        categoryService.add(categoryDTO);
        return Result.success();
    }

}
