package com.kkbox.domain;

import java.util.Date;

public class Playlist {
    private Integer id;

    private String uid;

    private String name;

    private String img;

    private Integer countcollection;

    private Integer countshare;

    private Integer countplay;

    private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getCountcollection() {
        return countcollection;
    }

    public void setCountcollection(Integer countcollection) {
        this.countcollection = countcollection;
    }

    public Integer getCountshare() {
        return countshare;
    }

    public void setCountshare(Integer countshare) {
        this.countshare = countshare;
    }

    public Integer getCountplay() {
        return countplay;
    }

    public void setCountplay(Integer countplay) {
        this.countplay = countplay;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}