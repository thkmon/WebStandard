package com.thkmon.webstd.doc.model;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thkmon.webstd.doc.service.DocServiceImpl;

@Controller
public class DocModel {
	
	private static final Logger logger = LoggerFactory.getLogger(DocModel.class);
    
    @Resource(name="docService")
    private DocServiceImpl docService;
    
    @RequestMapping(value = "/doc/add", method = RequestMethod.GET)
    public String addDoc(Model model) {
        
        try {
        	docService.addDoc();
        
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        return "home";
    }
}