package org.gangwan.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author gyf
 * @Date 2024/4/16 15:08
 * @Des mybatis plus代码生成器
 */
public class MybatisPlusGenerator {

    private static final String dbUrl = "jdbc:mysql://127.0.0.1:3306/gangwan?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8";
    private static final String userName = "root";
    private static final String password = "root";
    private static final String driverName = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        //创建generator对象
        AutoGenerator autoGenerator = new AutoGenerator();
        //数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUrl(dbUrl);
        dataSourceConfig.setUsername(userName);
        dataSourceConfig.setPassword(password);
        dataSourceConfig.setDriverName(driverName);
        autoGenerator.setDataSource(dataSourceConfig);

        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java")
                .setOpen(false)
                .setAuthor("郭云飞")
                .setServiceName("%sService")
                .setIdType(IdType.ASSIGN_UUID);  //去掉Impl前面的I
        autoGenerator.setGlobalConfig(globalConfig);

        //包信息
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("org.gangwan");
        //packageConfig.setModuleName("your");
        packageConfig.setController("controller")
                        .setService("service")
                    .setServiceImpl("service.impl")
                .setMapper("mapper")
                .setEntity("pojo.entity");
        autoGenerator.setPackageInfo(packageConfig);

        //配置策略
        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig.setInclude("user","product"); //默认生成所有表，这里设置只生成部分表
        strategyConfig.setInclude("file_info");
        strategyConfig.setEntityLombokModel(true); //自动添lombok注解
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel); //驼峰命名
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();
    }
}
