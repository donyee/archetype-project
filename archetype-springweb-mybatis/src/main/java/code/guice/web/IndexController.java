package code.guice.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xuyiwei
 * @since 2018/9/4
 */

@Slf4j
@Controller
public class IndexController {



    @RequestMapping(value = "/index", method = RequestMethod.GET)
   public void index(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        try {
            httpServletResponse.addHeader("Content-Type", "text/plain;charset=utf-8");
            httpServletResponse.getWriter().write(" index page");
            httpServletResponse.getWriter().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
