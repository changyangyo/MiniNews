package com.pn.wechatmini.dao;

import com.pn.wechatmini.entity.Logweblogin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LogWebLoginDAOTest {

    @Autowired(required = true)
    private LogWebLoginDAO logWebLoginDAO;

    @Test
    public void queryLogWebLogins() throws Exception {
        List<Logweblogin> logweblogins = logWebLoginDAO.queryLogWebLogins();
        assertEquals(5,logweblogins.size());
    }

}