package com.zmj.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zmj.dao.IUserInfoDao;
import com.zmj.model.UserInfo;
@Service
@Transactional(readOnly=false) 
public class UserInfoService implements IUserInfoService {
	@Resource IUserInfoDao userInfoDao;
	@Override 
    
	public boolean userRegiste(UserInfo userInfo) {
		 userInfoDao.save(userInfo);  
	     return false;  
	}

}
