package com.haoyong.pdf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sun.javafx.beans.IDProperty;
import org.springframework.data.annotation.Id;

/**
 * @program: pdf
 * @description: 课外阅读实例
 * @author: zxb
 * @create: 2020-08-01 10:16
 **/
@TableName(value = "read_punching")
public class ReadPunch {
    @Id
    private Integer id;
    private int stage;
    private String bookname;
    private String author;
    private String press;
    private String guide;
    @TableField(value = "contentIntroduce")
    private String contentIntroduce;
    @TableField(value = "authorIntroduce")
    private String authorIntroduce;
    private String organize;
    private String cover;
    private String audio;
    @TableField(value = "picbook_audio")
    private String picbook_audio;
    @TableField(value = "picbook_video")
    private String picbook_video;
    @TableField(value = "picbook_pdf")
    private String picbook_pdf;
    @TableField(value = "isOpen")
    private int isOpen;
    @TableField(value = "bookCategory")
    private int bookCategory;
    @TableField(value = "ISBN")
    private String ISBN;
    private String no;

    @Override
    public String toString() {
        return "ReadPunch{" +
                "id=" + id +
                ", stage=" + stage +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", guide='" + guide + '\'' +
                ", contentIntroduce='" + contentIntroduce + '\'' +
                ", authorIntroduce='" + authorIntroduce + '\'' +
                ", organize='" + organize + '\'' +
                ", cover='" + cover + '\'' +
                ", audio='" + audio + '\'' +
                ", picbook_audio='" + picbook_audio + '\'' +
                ", picbook_video='" + picbook_video + '\'' +
                ", picbook_pdf='" + picbook_pdf + '\'' +
                ", isOpen=" + isOpen +
                ", bookCategory=" + bookCategory +
                ", ISBN='" + ISBN + '\'' +
                ", no='" + no + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getContentIntroduce() {
        return contentIntroduce;
    }

    public void setContentIntroduce(String contentIntroduce) {
        this.contentIntroduce = contentIntroduce;
    }

    public String getAuthorIntroduce() {
        return authorIntroduce;
    }

    public void setAuthorIntroduce(String authorIntroduce) {
        this.authorIntroduce = authorIntroduce;
    }

    public String getOrganize() {
        return organize;
    }

    public void setOrganize(String organize) {
        this.organize = organize;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getPicbook_audio() {
        return picbook_audio;
    }

    public void setPicbook_audio(String picbook_audio) {
        this.picbook_audio = picbook_audio;
    }

    public String getPicbook_video() {
        return picbook_video;
    }

    public void setPicbook_video(String picbook_video) {
        this.picbook_video = picbook_video;
    }

    public String getPicbook_pdf() {
        return picbook_pdf;
    }

    public void setPicbook_pdf(String picbook_pdf) {
        this.picbook_pdf = picbook_pdf;
    }

    public int getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(int isOpen) {
        this.isOpen = isOpen;
    }

    public int getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(int bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
