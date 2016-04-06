package com.zmj.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zmj.dao.IUserInfoDao;
import com.zmj.model.UserInfo;
@Service
@Transactional(readOnly=false)
public class UserInfoService implements IUserInfoService {
	@Autowired private IUserInfoDao userInfoDao; 
	public boolean userRegiste(UserInfo userInfo) {
		 userInfoDao.save(userInfo);  
	     return false;  
	}
	@Override
	public List<UserInfo> doGetUserInfoList() {
		return userInfoDao.findAll(UserInfo.class);
	}

}
