package com.gupaoedu.vip.mall;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author zhouzhen
 * @description
 * @date 2021/6/22
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.gupaoedu.vip.mall.goods.mapper"})
public class MallGoodsApplication {
    public static void main(String[] args){
        SpringApplication.run(MallGoodsApplication.class,args);
    }
}
