package com.pn.wechatmini.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * @program: wechatmini
 * @description: 数据库连接
 * @author: peng.ning
 * @create: 2018-10-24 15:41
 **/
@Configuration
@MapperScan("com.pn.wechatmini.config.dao")
public class DataSourceConfiguration {

    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.user}")
    private String jdbcUser;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name = "datasource")
    public ComboPooledDataSource createDatasource() throws PropertyVetoException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(jdbcDriver);
        comboPooledDataSource.setJdbcUrl(jdbcUrl);
        comboPooledDataSource.setUser(jdbcUser);
        comboPooledDataSource.setPassword(jdbcPassword);
        comboPooledDataSource.setAutoCommitOnClose(false);
        return comboPooledDataSource;
    }
}
