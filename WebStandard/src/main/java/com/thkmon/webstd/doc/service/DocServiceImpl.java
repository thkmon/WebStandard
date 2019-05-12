package com.thkmon.webstd.doc.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.thkmon.webstd.doc.dao.DocDao;

@Service("docService")
public class DocServiceImpl implements DocService {
	
	@Resource(name="docDao")
    private DocDao docDao;
	
	@Override
	public boolean addDoc() throws Exception {
		return docDao.addDoc();
	}
}