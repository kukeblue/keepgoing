package com.kukechen.keepgoing.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class MyBatisConfig {
        @Autowired
        private DataSourceProperties dataSourceProperties;

        @Bean(name = "dataSource")
        public DruidDataSource dataSource() {
            DruidDataSource dataSource = new DruidDataSource();
            dataSource.setUrl(dataSourceProperties.getUrl());

            dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
            dataSource.setUsername(dataSourceProperties.getUsername());
            dataSource.setPassword(dataSourceProperties.getPassword());

            return dataSource;

        }

        @Bean
        public SqlSessionFactory sqlSessionFactory() throws Exception {
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
            sqlSessionFactoryBean.setDataSource(dataSource());
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:/mapper/*Mapper.xml"));
            return sqlSessionFactoryBean.getObject();
        }
}
