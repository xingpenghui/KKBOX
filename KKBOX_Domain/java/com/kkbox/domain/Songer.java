package com.kkbox.domain;

public class Songer {
    private Integer id;

    private String name;

    private Integer rongertype;

    private Integer lauguagerlist;

    private String info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRongertype() {
        return rongertype;
    }

    public void setRongertype(Integer rongertype) {
        this.rongertype = rongertype;
    }

    public Integer getLauguagerlist() {
        return lauguagerlist;
    }

    public void setLauguagerlist(Integer lauguagerlist) {
        this.lauguagerlist = lauguagerlist;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}