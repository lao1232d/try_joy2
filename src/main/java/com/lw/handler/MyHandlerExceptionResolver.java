package com.lw.handler;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.LogManager;


@Component
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
 

 
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
 
        System.out.println("服务器出错:"+ ex);

        if (request.getHeader("X-Requested-With") != null) {
            try {
                response.getWriter().println(("服务器出错了"));
            } catch (IOException e) {
                System.out.println("服务器失败时发送错误提示信息失败 : "+ e);
            }
            //返回一个空的ModelAndView表示已经手动生成响应
            //return null表示使用默认的处理方式，等于没处理
            return new ModelAndView();
        } else {
            return new ModelAndView("500");
        }
    }
}