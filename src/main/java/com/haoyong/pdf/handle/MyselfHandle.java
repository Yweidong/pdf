package com.haoyong.pdf.handle;

import com.haoyong.pdf.common.Result;
import com.haoyong.pdf.common.StatusCode;
import com.haoyong.pdf.exception.MyselfException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: pdf
 * @description: 自定义异常处理类
 * @author: zxb
 * @create: 2020-08-04 09:31
 **/
@ControllerAdvice
public class MyselfHandle {


    @ResponseBody
    @ExceptionHandler(MyselfException.class)
    public Result selfHandler(MyselfException e) {

        return new Result(false, e.getCode(),e.getMessage(),null);
    }
}
