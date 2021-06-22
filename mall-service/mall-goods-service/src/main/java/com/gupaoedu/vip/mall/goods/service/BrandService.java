package com.gupaoedu.vip.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gupaoedu.vip.mall.goods.model.Brand;

import java.util.List;

/**
 * @author zhouzhen
 * @description
 * @date 2021/6/22
 */
public interface BrandService extends IService<Brand> {

    /**
     * 条件查询
     */
    List<Brand> queryList(Brand brand);

    /**
     * 条件分页
     * @param brand
     * @param currentPage
     * @param size
     * @return
     */
    Page<Brand> queryPageList(Brand brand,Long currentPage,Long size);
}
