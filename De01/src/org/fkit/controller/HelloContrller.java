package org.fkit.controller;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



//ע��
@Controller
public class HelloContrller{

	 private static final Log logger = LogFactory
	            .getLog(HelloContrller.class);
	 
	
	 @RequestMapping(value="/hello")
	 public ModelAndView hello(){
		 logger.info("hello���� ������");
		 // ����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ��·����ģ�͵������Լ�ģ�Ͷ���
		 ModelAndView mv = new ModelAndView();
		 //���ģ������ �����������POJO����  
	     mv.addObject("message", "Hello World!");  
	     // �����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
	     mv.setViewName("/WEB-INF/Jsp/index.jsp"); 
		// ����ModelAndView����
		return mv;
	 }

}

