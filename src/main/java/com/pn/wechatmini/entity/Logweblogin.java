package com.pn.wechatmini.entity;

import java.util.Date;

/**
 * @program: wechatmini
 * @description: Logweblogin
 * @author: peng.ning
 * @create: 2018-10-24 17:57
 **/
public class Logweblogin {
    private Long logid;//日志id
    private Long loginaccount;//登录用户id
    private String loginip;//登录ip
    private Date logintime;//登录时间
    private Integer schoolid;//机构id
    private Integer campusid;//分校id
    private String browserinfo;//浏览器信息
    private Integer sourcetype;//采购商来源(1:平台机构, 2:商城注册)
    private String openid;//微信登录时用户对应小程序的openid

    public Long getLogid() {
        return logid;
    }

    public void setLogid(Long logid) {
        this.logid = logid;
    }

    public Long getLoginaccount() {
        return loginaccount;
    }

    public void setLoginaccount(Long loginaccount) {
        this.loginaccount = loginaccount;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public Integer getCampusid() {
        return campusid;
    }

    public void setCampusid(Integer campusid) {
        this.campusid = campusid;
    }

    public String getBrowserinfo() {
        return browserinfo;
    }

    public void setBrowserinfo(String browserinfo) {
        this.browserinfo = browserinfo;
    }

    public Integer getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(Integer sourcetype) {
        this.sourcetype = sourcetype;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}