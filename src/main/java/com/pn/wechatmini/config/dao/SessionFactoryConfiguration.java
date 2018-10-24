package com.pn.wechatmini.config.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @program: wechatmini
 * @description: mybatis配置
 * @author: peng.ning
 * @create: 2018-10-24 16:02
 **/
@Configuration
public class SessionFactoryConfiguration {
    @Value("${mybatisConfigFile}")
    private String mybatisConfigFile;
    @Value("${mapperPath}")
    private String mapperPath;
    @Value("${entityPath}")
    private String entityPath;
    @Autowired
    @Qualifier("datasource")
    private DataSource dataSource;

    @Bean("sqlSessionFactoryBean")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigFile));
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_URL_PREFIX + mapperPath;
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packageSearchPath));
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(entityPath);
        return sqlSessionFactoryBean;
    }
}
