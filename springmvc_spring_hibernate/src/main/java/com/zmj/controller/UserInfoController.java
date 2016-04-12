package com.zmj.controller;



import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zmj.model.UserInfo;
import com.zmj.service.IUserInfoService;


@Controller
@RequestMapping("/admin/userInfo")
public class UserInfoController {
	 @Resource private IUserInfoService userInfoService; 
	 //用户注册
	 @RequestMapping("/userRegiste")
	 public String userRegiste() {  
//	        UserInfo user = new UserInfo(5, "zmj", 20, "男", "11", "22", "33");  
//	        userInfoService.userRegiste(user); 
	        return "front/register";  
	    }
	 //注册用户的保存
	 @RequestMapping("/userSave")
	 public String userSave(@ModelAttribute("userInfo") UserInfo userInfo){
		 UserInfo user=new UserInfo();
		 user.setUsername(userInfo.getUsername());
		 user.setPassword(userInfo.getPassword());
		 userInfoService.userSave(user);
		return "front/login";		 
	 }
//	 @RequestMapping("/userSave")
//	 public String doSelect(Model model){
//		 List<UserInfo> userList=userInfoService.doGetUserInfoList();
//		 model.addAttribute("userList", userList);
//		 return "/admin/userInfo";
//	 }
	 @RequestMapping("/userLogin")
	 public String userLogin(@ModelAttribute("loginInfo") UserInfo userInfo){
		 String username=userInfo.getUsername();
		 String password=userInfo.getPassword();
		 return "front/index";
	 }
}
