package com.kkbox.domain;

import java.util.Date;

public class Music {
    private Integer id;

    private Integer songerid;

    private String musicname;

    private String lyrics;

    private String albuname;

    private String type;

    private Integer collection;

    private Integer comment;

    private Integer playcount;

    private Integer thumbnum;

    private Date uploadtime;

    private Date min;

    private Integer mid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSongerid() {
        return songerid;
    }

    public void setSongerid(Integer songerid) {
        this.songerid = songerid;
    }

    public String getMusicname() {
        return musicname;
    }

    public void setMusicname(String musicname) {
        this.musicname = musicname == null ? null : musicname.trim();
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics == null ? null : lyrics.trim();
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

    public Integer getCollection() {
        return collection;
    }

    public void setCollection(Integer collection) {
        this.collection = collection;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Integer getPlaycount() {
        return playcount;
    }

    public void setPlaycount(Integer playcount) {
        this.playcount = playcount;
    }

    public Integer getThumbnum() {
        return thumbnum;
    }

    public void setThumbnum(Integer thumbnum) {
        this.thumbnum = thumbnum;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Date getMin() {
        return min;
    }

    public void setMin(Date min) {
        this.min = min;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}