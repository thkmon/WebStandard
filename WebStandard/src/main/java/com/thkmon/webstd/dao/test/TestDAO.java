package com.thkmon.webstd.dao.test;

import org.springframework.stereotype.Repository;

import com.thkmon.webstd.common.dao.AbstractDAO;

@Repository("testDAO")
public class TestDAO extends AbstractDAO {

    public int selectCount() throws Exception {

        // 여기서 test.selectCount 란, 네임스페이스가 test 인 *-mapper.xml 내부의, id 가 selectCount 인 쿼리를 의미한다.

        // 즉, test-mapper.xml 파일에 담긴 쿼리를 뜻한다.​
        return (Integer) selectOne("test.selectCount");
    }
}