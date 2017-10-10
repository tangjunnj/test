/**
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 */
package com.sks.retail;

import com.sks.basic.jdbc.annotation.Dao;
import com.sks.basic.jdbc.annotation.SKSMapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置mapper的bean，数据库操作
 * Date: 2015-04-20
 *
 */
@Configuration
@SKSMapperScan(basePackages = {"com.sks.retail"}, annotationClass = Dao.class)
public class DatabaseConfig {
}
