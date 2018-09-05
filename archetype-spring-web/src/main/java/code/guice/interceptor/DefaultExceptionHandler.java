package code.guice.interceptor;

import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;

/**
 * @author xuyiwei
 * @since 2018/3/28
 */

public class DefaultExceptionHandler  extends BasicErrorController {

    public DefaultExceptionHandler(ErrorAttributes errorAttributes, ErrorProperties errorProperties) {
        super(errorAttributes, errorProperties);
    }
}
