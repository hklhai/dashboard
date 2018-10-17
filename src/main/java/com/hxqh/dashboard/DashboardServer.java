package com.hxqh.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Lin
 * Debug
 * SpringBoot mode
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.hxqh.dashboard.**.*")
@RestController
public class DashboardServer extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {
    public static void main(String[] args) {
        SpringApplication.run(DashboardServer.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8090);
    }
}


/**
 * @author Lin
 * Release
 * Tomcat mode
 */
//@SpringBootApplication
//@ComponentScan(basePackages = "com.hxqh.dashboard.**.*")
//@RestController
//public class DashboardServer extends SpringBootServletInitializer {
//    public static void main(String[] args) {
//        SpringApplication.run(DashboardServer.class, args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(this.getClass());
//    }
//}