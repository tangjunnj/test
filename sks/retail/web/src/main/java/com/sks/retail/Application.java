/**
 * Copyright (C) 2006-2016 Tuniu All rights reserved
 */
package com.sks.retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * site web
 * Date: 2016-11-10
 *
 * @author lzm
 */
public class Application  extends SpringBootServletInitializer {

    public static void main(String... args) {
        SpringApplication.run(SiteConfig.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SiteConfig.class);
    }
}
