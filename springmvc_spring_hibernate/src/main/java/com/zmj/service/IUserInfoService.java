package com.zmj.service;

import java.util.List;

import com.zmj.model.UserInfo;

public interface IUserInfoService {
	public boolean userSave(UserInfo userInfo);
	public List<UserInfo> doGetUserInfoList();
}
