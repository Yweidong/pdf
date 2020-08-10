package com.haoyong.pdf.util;

import com.haoyong.pdf.exception.MyselfException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDXObjectImage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @program: pdf
 * @description: pdf转换成图片的工具类
 * @author: zxb
 * @create: 2020-08-01 10:00
 **/
@Component
public class PdfUtil {


    /**
     * 提取
     * @param file          PDF文件
     * @param targetFolder  图片存放目录
     * @return
     */
    public static List<String> extractImages(File file, String targetFolder) {
        boolean result = true;
        List<String> list = null;
        try{
            list  = new ArrayList<>();
            PDDocument document = PDDocument.load(file);

            List<PDPage> pages = document.getDocumentCatalog().getAllPages();

            Iterator<PDPage> iter = pages.iterator();


            int count = 0;
            while( iter.hasNext()){
                PDPage page = (PDPage)iter.next();
                PDResources resources = page.getResources();
                if(resources != null)
                {
                Map<String, PDXObjectImage> images = resources.getImages();


                    Iterator<String> imageIter = images.keySet().iterator();
                    while(imageIter.hasNext())
                    {
                        count++;
                        String key = (String)imageIter.next();
                        PDXObjectImage image = (PDXObjectImage)images.get( key );
                        String name = IDUtil.genImageName() + "_" + count; // 图片文件名
                        String suffix = image.getSuffix().toString();//文件后缀

                        image.write2file(targetFolder + name);      // 保存图片
                        list.add(targetFolder + name+"."+suffix);
                    }
                }else {
                    throw new MyselfException(400,"解析pdf失败");
                }
            }
        } catch(IOException ex){
            ex.printStackTrace();
            throw new MyselfException(400,"IO处理异常");
        }

        return list;
    }

    public static void main(String[] args) {
        File file = new File("D:/白雪公主和七个小矮人.pdf");
        String targerFolder = "D:/image/";

       List<String> list = extractImages(file, targerFolder);
        for (Object s : list) {
            System.out.println(s);
        }
    }
}
