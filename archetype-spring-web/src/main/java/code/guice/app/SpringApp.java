package code.guice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

/**
 * @author xuyiwei
 * @since 2018/9/4
 */

@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
@ComponentScan(basePackages = {"code.guice"})
@ImportResource({"applicationContext.xml"})
@SpringBootApplication
public class SpringApp {

    public static void main(String[] args) {
        SpringApplication springApplication =
                new SpringApplicationBuilder()
                        .sources(SpringApp.class)
                        .web(true)
                        .build();


        ApplicationContext ctx = springApplication.run(args);
    }

}


