package com.emp.GlobalException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        /**内部异常*/
        String requestURI = request.getRequestURI();
        mv.addObject("url", requestURI);
        mv.addObject("data", ex.toString());
        /**返回异常的界面*/
        mv.setViewName("SystemError");
        return mv;
    }
}
