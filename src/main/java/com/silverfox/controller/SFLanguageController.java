package com.silverfox.controller;


import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.silverfox.model.SFConfig;
import com.silverfox.service.SFConfigService;

@Controller
public class SFLanguageController {
	
	@Autowired
	SFConfigService  sfConfigService;
	
	@RequestMapping("/")
	public String goIndex(HttpServletRequest request,HttpServletResponse response){
		Locale l = (Locale) request.getSession().getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
		if(l == null){
	        l = new Locale("zh", "CN"); 
	        request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,l); 
		}
		String language = l.getLanguage();
		SFConfig sf = sfConfigService.findByPrimaryKey("Portfolio", "1");
		SFConfig sf1 = sfConfigService.findByPrimaryKey("About", "1");
		String portfolio = "";
		String content = "";
		String about = "";
		String aboutContent = "";
		if("zh".equals(language)){
			portfolio = sf.getCodeCName();
			content = sf.getCodeCContent();
			
			about = sf1.getCodeCName();
			aboutContent = sf1.getCodeCContent();
		}
		if("en".equals(language)){
			portfolio = sf.getCodeEName();
			content = sf.getCodeEContent();
			
			about = sf1.getCodeEName();
			aboutContent = sf1.getCodeEContent();
		}
		if("tw".equals(language)){
			portfolio = sf.getCodeTName();
			content = sf.getCodeTContent();
			
			about = sf1.getCodeTName();
			aboutContent = sf1.getCodeTContent();
		}
		request.setAttribute("portfolio", portfolio);
		request.setAttribute("content", content);
		
		request.setAttribute("about", about);
		request.setAttribute("aboutContent", aboutContent);
		return "index";
	}
	
	@RequestMapping("/language")
	public String changeLanguage(HttpServletRequest request,HttpServletResponse response, String locale){
		locale = locale.toLowerCase();
		Locale l = null;
	    if(locale.equals("zh")){
	        l = new Locale("zh", "CN"); 
	        request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,l); 
        }else if(locale.equals("en")){
	        l = new Locale("en", "US"); 
	        request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,l);
        }else if(locale.equals("tw")){
	        l = new Locale("tw", "TW"); 
	        request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,l);
	    }else{
	    	request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,LocaleContextHolder.getLocale());
	    }
	          
	    return "redirect:/";
	}
}
