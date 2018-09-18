package com.kkbox.domain;

import java.util.Date;

public class Userstatus {
    private Integer id;

    private Integer uid;

    private String info;

    private String uplodphone;

    private String uplodvideo;

    private Date createtime;

    private Integer sharecount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getUplodphone() {
        return uplodphone;
    }

    public void setUplodphone(String uplodphone) {
        this.uplodphone = uplodphone == null ? null : uplodphone.trim();
    }

    public String getUplodvideo() {
        return uplodvideo;
    }

    public void setUplodvideo(String uplodvideo) {
        this.uplodvideo = uplodvideo == null ? null : uplodvideo.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getSharecount() {
        return sharecount;
    }

    public void setSharecount(Integer sharecount) {
        this.sharecount = sharecount;
    }
}