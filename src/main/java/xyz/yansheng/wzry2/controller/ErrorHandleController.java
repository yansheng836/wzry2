package xyz.yansheng.wzry2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import springfox.documentation.annotations.ApiIgnore;

/**
 * 定义一个处理错误页面的Controller实现ErrorController，重定向错误码后，会自动设置响应的状态码。
 * 
 * @author yansheng
 * @date 2020/04/30
 */
@Controller
@ApiIgnore
public class ErrorHandleController implements ErrorController {

    /**
     * 重写ErrorController的方法
     * 
     * @see ErrorController#getErrorPath()
     */
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @GetMapping("/error")
    public String handleError(HttpServletRequest request) {

        // 获取statusCode
        Integer statusCode = (Integer)request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == 401) {
            return "401";
        } else if (statusCode == 404) {
            return "404";
        } else if (statusCode == 403) {
            return "403";
        } else {
//            return "500";
            return "404";
        }
    }

}
