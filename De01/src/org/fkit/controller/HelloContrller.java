package org.fkit.controller;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



//注解
@Controller
public class HelloContrller{

	 private static final Log logger = LogFactory
	            .getLog(HelloContrller.class);
	 
	
	 @RequestMapping(value="/hello")
	 public ModelAndView hello(){
		 logger.info("hello方法 被调用");
		 // 创建准备返回的ModelAndView对象，该对象通常包含了返回视图的路径、模型的名称以及模型对象
		 ModelAndView mv = new ModelAndView();
		 //添加模型数据 可以是任意的POJO对象  
	     mv.addObject("message", "Hello World!");  
	     // 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
	     mv.setViewName("/WEB-INF/Jsp/index.jsp"); 
		// 返回ModelAndView对象。
		return mv;
	 }

}

