package com.zmj.service;

import org.junit.Test;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.FileSystemXmlApplicationContext;  

import com.zmj.controller.UserController;
  
 
  
public class UserServiceTest {  
    @Test  
    public void test() {  
        ApplicationContext ctx = new FileSystemXmlApplicationContext(  
                "src/main/webapp/WEB-INF/applicationContext.xml");  
        UserController controller = ctx.getBean(UserController.class);  
        controller.registe();  
    }  
}  
