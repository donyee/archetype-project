package code.guice.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xuyiwei
 * @since 2018/7/17
 *
 * TODO 实现参数 HASH 校验、IP白名单校验、
 *  TODO log 记录下访问者的appId、ip、访问路径等日志
 */
@Component
public class SecurityInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(SecurityInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        // String x = request.getMethod();
        logger.info( " intercepted {} {}", request.getMethod(),  request.getRequestURI() );
        return true;
    }
}
