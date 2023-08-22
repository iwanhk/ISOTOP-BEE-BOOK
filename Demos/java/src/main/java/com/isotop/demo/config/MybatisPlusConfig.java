package com.isotop.demo.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @desc: Mybatis-Plus配置类
 * @author:hejr
 * @date:2019/4/8
 */
@Configuration
public class MybatisPlusConfig {



    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor().setDialectType("mysql");
    }


    /**
     * sql注入器  逻辑删除插件
     *
     * @return
     */
   /* @Bean
    public ISqlInjector iSqlInjector() {
        return new LogicSqlInjector();
    }*/

    /**
     * 乐观锁插件
     *
     * @return
     */
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}
