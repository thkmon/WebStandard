package com.thkmon.webstd.doc.data;

public class Doc {

	/**
	 * 문서아이디
		문서제목
		문서내용
		등록자아이디
		등록자이름
		검색엔진 등록여부
	 */
	
	/**
	CREATE TABLE DDOC_DOC (
		DOC_ID VARCHAR(100),
	    DOC_TITLE VARCHAR(500),
	    DOC_CONTENT VARCHAR(4000),
	    REG_USER_ID VARCHAR(100),
	    REG_USER_NAME VARCHAR(100),
	    IN_SEARCH_ENGINE VARCHAR(1)
	);
	*/
	
	private String docId = "";
	private String docTitle = "";
	private String docContent = "";
	private String regUserId = "";
	private String regUserName = "";
	private String inSearchEngine = "";
	
	public String getDocId() {
		return docId;
	}
	
	public void setDocId(String docId) {
		this.docId = docId;
	}
	
	public String getDocTitle() {
		return docTitle;
	}
	
	public void setDocTitle(String docTitle) {
		this.docTitle = docTitle;
	}
	
	public String getDocContent() {
		return docContent;
	}
	
	public void setDocContent(String docContent) {
		this.docContent = docContent;
	}
	
	public String getRegUserId() {
		return regUserId;
	}
	
	public void setRegUserId(String regUserId) {
		this.regUserId = regUserId;
	}
	
	public String getRegUserName() {
		return regUserName;
	}
	
	public void setRegUserName(String regUserName) {
		this.regUserName = regUserName;
	}
	
	public String getInSearchEngine() {
		return inSearchEngine;
	}
	
	public void setInSearchEngine(String inSearchEngine) {
		this.inSearchEngine = inSearchEngine;
	}
}