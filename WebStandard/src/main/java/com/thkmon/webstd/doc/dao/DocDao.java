package com.thkmon.webstd.doc.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.thkmon.webstd.common.dao.AbstractDao;

@Repository("docDao")
public class DocDao extends AbstractDao {
	
	public boolean addDoc() throws Exception {
        // 여기서 doc.add 란, 네임스페이스가 doc 인 *-mapper.xml 내부의, id 가 add 인 쿼리를 의미한다.
        // 즉, doc-mapper.xml 파일에 담긴 쿼리를 뜻한다.
//		HashMap<String, String> params = null;
//		Object resultObj = insert("doc.add", params);
		
		System.out.println("addDoc");
		return true;
    }
}