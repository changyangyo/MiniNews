package com.pn.wechatmini.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program: wechatmini
 * @description: 事物
 * @author: peng.ning
 * @create: 2018-10-25 15:38
 **/
@Configuration
@EnableTransactionManagement
public class TransactionManagerConfiguration implements TransactionManagementConfigurer{

    @Autowired
    private DataSource dataSource;
    private ThreadPoolExecutor threadPoolExecutor;

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
