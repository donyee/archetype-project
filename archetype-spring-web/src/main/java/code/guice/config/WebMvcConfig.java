package code.guice.config;


import code.guice.interceptor.CountInterceptor;
import code.guice.interceptor.SecurityInterceptor;
import code.guice.interceptor.TimingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author xuyiwei
 * @since 2018/3/21
 */

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {


    @Autowired
    private SecurityInterceptor securityInterceptor;

    @Autowired
    private CountInterceptor countInterceptor;

    @Autowired
    private TimingInterceptor timingInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(securityInterceptor);
        registry.addInterceptor(countInterceptor);
        registry.addInterceptor(timingInterceptor);

    }
}