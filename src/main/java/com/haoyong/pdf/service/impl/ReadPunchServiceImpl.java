package com.haoyong.pdf.service.impl;

import com.haoyong.pdf.mapper.ReadPunchMapper;
import com.haoyong.pdf.pojo.ReadPunch;
import com.haoyong.pdf.service.ReadPunchService;
import com.haoyong.pdf.util.PdfUtil;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: pdf
 * @description:
 * @author: zxb
 * @create: 2020-08-01 10:31
 **/
@Service
public class ReadPunchServiceImpl implements ReadPunchService {
    @Value("${haoyong.imageurl}")
    private String imageurl;
    @Value("${haoyong.serverurl}")
    private String serverurl;
//    @Autowired
//    ReadPunchMapper readPunchMapper;
    @Override
    public List<String> ImportImages(String path)  {

        File file = new File(path);
//        ReadPunch readPunch = readPunchMapper.selectById(id);

        String targerFolder = imageurl+"pdftoimage/";
        File file1 = new File(targerFolder);
        if(!file1.exists() && !file1.isDirectory()) {
            file1.mkdirs();
        }
        List<String> list = PdfUtil.extractImages(file, targerFolder);

        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            String s = list.get(i).replaceAll(imageurl, serverurl);
            stringArrayList.add(s);

        }
//        String s = StringUtils.join(stringArrayList, ',');//将数组转换成字符串
//        ReadPunch punch = new ReadPunch();
//        punch.setId(id);
//        punch.setPicbook_pdf(s);
//        int i = readPunchMapper.updateById(punch);

        return stringArrayList;
    }
}
