package com.haoyong.pdf.service;

import com.haoyong.pdf.pojo.ReadPunch;

import java.util.List;

/**
 * @program: pdf
 * @description:
 * @author: zxb
 * @create: 2020-08-01 10:30
 **/
public interface ReadPunchService {
    /**
     *  将转换好的图片插入到数据库中
     *
     */
    List<String> ImportImages(String path);
}
