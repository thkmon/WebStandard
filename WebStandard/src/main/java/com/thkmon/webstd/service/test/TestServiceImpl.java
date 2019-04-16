package com.thkmon.webstd.service.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.thkmon.webstd.dao.test.TestDAO;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Resource(name="testDAO")
    private TestDAO testDAO;
    
    public int select() throws Exception {
        return testDAO.selectCount();
    }
}