package com.pn.wechatmini.dao;

import com.pn.wechatmini.entity.Logweblogin;

import java.util.List;

/**
 * @program: wechatmini
 * @description: LogWebLoginDAO
 * @author: peng.ning
 * @create: 2018-10-24 17:59
 **/
public interface LogWebLoginDAO {

    public List<Logweblogin> queryLogWebLogins();
}
