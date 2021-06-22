package com.gupaoedu.vip.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gupaoedu.vip.mall.goods.mapper.BrandMapper;
import com.gupaoedu.vip.mall.goods.model.Brand;
import com.gupaoedu.vip.mall.goods.service.BrandService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouzhen
 * @description
 * @date 2021/6/22
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {


    @Autowired
    private BrandMapper brandMapper;


    @Override
    public List<Brand> queryList(Brand brand) {
        LambdaQueryWrapper<Brand> wrapper = Wrappers.lambdaQuery();
        wrapper.like(StringUtils.isNotBlank(brand.getName()), Brand::getName, brand.getName());
        wrapper.eq(StringUtils.isNotBlank(brand.getInitial()), Brand::getInitial, brand.getInitial());
        return brandMapper.selectList(wrapper);
    }

    @Override
    public Page<Brand> queryPageList(Brand brand, Long currentPage, Long size) {
        QueryWrapper<Brand> wrapper = Wrappers.query();
        wrapper.lambda().like(StringUtils.isNotBlank(brand.getName()), Brand::getName, brand.getName());
        return brandMapper.selectPage(new Page<>(currentPage, size), wrapper);
    }
}
