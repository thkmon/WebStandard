package com.thkmon.webstd.doc.dao;

import org.springframework.stereotype.Repository;

import com.thkmon.webstd.common.dao.AbstractDao;
import com.thkmon.webstd.doc.data.Doc;

@Repository("docDao")
public class DocDao extends AbstractDao {
	
	public boolean addDoc() throws Exception {
        // 여기서 doc.add 란, 네임스페이스가 doc 인 *-mapper.xml 내부의, id 가 add 인 쿼리를 의미한다.
        // 즉, doc-mapper.xml 파일에 담긴 쿼리를 뜻한다.
		
		// System.out.println("doc.addDoc");
		
		Doc doc = new Doc();
		doc.setDocId("111");
		doc.setDocContent("222");
		insert("doc.addDoc", doc);
		return true;
    }
}