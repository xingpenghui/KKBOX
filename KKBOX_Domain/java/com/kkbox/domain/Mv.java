package com.kkbox.domain;

import java.util.Date;

public class Mv {
    private Integer id;

    private String videoname;

    private String videoinfo;

    private String albuname;

    private String type;

    private Integer comment;

    private Integer colletion;

    private Integer playcount;

    private Integer thumbunm;

    private Date uploadtiome;

    private Date min;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public String getVideoinfo() {
        return videoinfo;
    }

    public void setVideoinfo(String videoinfo) {
        this.videoinfo = videoinfo == null ? null : videoinfo.trim();
    }

    public String getAlbuname() {
        return albuname;
    }

    public void setAlbuname(String albuname) {
        this.albuname = albuname == null ? null : albuname.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Integer getColletion() {
        return colletion;
    }

    public void setColletion(Integer colletion) {
        this.colletion = colletion;
    }

    public Integer getPlaycount() {
        return playcount;
    }

    public void setPlaycount(Integer playcount) {
        this.playcount = playcount;
    }

    public Integer getThumbunm() {
        return thumbunm;
    }

    public void setThumbunm(Integer thumbunm) {
        this.thumbunm = thumbunm;
    }

    public Date getUploadtiome() {
        return uploadtiome;
    }

    public void setUploadtiome(Date uploadtiome) {
        this.uploadtiome = uploadtiome;
    }

    public Date getMin() {
        return min;
    }

    public void setMin(Date min) {
        this.min = min;
    }
}