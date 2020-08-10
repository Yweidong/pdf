package com.haoyong.pdf.controller;

import com.haoyong.pdf.common.Result;
import com.haoyong.pdf.common.StatusCode;
import com.haoyong.pdf.service.ReadPunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: pdf
 * @description:
 * @author: zxb
 * @create: 2020-08-01 10:34
 **/
@RestController
@CrossOrigin
@RequestMapping("pdf")
public class ReadPunchController {
    @Autowired
    ReadPunchService readPunchService;
    @PostMapping("/import")
    public Result<String> ImportImages(
                                       @RequestParam("path") String path){
        List<String> strings = readPunchService.ImportImages(path);
        return new Result<String>(true, StatusCode.OK,"操作成功",strings);
    }
}
