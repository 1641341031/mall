package com.tiger.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tiger.vhr.mapper")
public class MybatisConfig {
}
