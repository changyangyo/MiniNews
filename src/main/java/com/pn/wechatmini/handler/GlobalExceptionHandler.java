package com.pn.wechatmini.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(HttpServletRequest req, Exception e) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", false);
        modelMap.put("errorMessage", e.getMessage());
        return modelMap;
    }

}