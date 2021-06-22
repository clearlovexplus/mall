package com.gupaoedu.vip.mall.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gupaoedu.mall.util.RespResult;
import com.gupaoedu.vip.mall.goods.model.Brand;
import com.gupaoedu.vip.mall.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhouzhen
 * @description brand控制器
 * @date 2021/6/22
 */
@RestController
@RequestMapping(value = "/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    /**
     * 新增
     */
    @PostMapping
    public RespResult add(@RequestBody Brand brand) {
        brandService.save(brand);
        return RespResult.ok();
    }

    @PutMapping
    public RespResult update(@RequestBody Brand brand) {
        brandService.updateById(brand);
        return RespResult.ok();
    }

    @DeleteMapping("/{id}")
    public RespResult delete(@PathVariable(value = "id") String id) {
        brandService.removeById(id);
        return RespResult.ok();
    }

    @PostMapping("/search")
    public RespResult<List<Brand>> queryList(@RequestBody Brand brand) {
        List<Brand> list = brandService.queryList(brand);
        return RespResult.ok(list);
    }

    @PostMapping("/search/{page}/{size}")
    public RespResult<List<Brand>> queryPageList(@PathVariable(value = "page") Long page,
                                                 @PathVariable(value = "size") Long size,
                                                 @RequestBody Brand brand) {
        Page<Brand> pageList = brandService.queryPageList(brand,page,size);
        return RespResult.ok(pageList);
    }


}
