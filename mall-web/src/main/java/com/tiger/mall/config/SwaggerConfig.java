package com.tiger.mall.config;

import com.tiger.mall.common.config.BaseSwaggerConfig;
import com.tiger.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.tiger.vhr.controller")
                .title("vhr后台系统")
                .description("vhr后台相关接口文档")
                .contactName("tiger")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
