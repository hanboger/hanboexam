package com.hanbo.cms.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.github.pagehelper.PageInfo;
import com.hanbo.cms.entity.User;

public interface UserService {

	//判断用户名是否已经被占用
	boolean checkExist(String username);
//注册用户
	int register(User user);
//登录
	User login(User user);
	
	//用户管理//用户管理 禁用和解封
	PageInfo<User> list(Integer page, int locked);
	
	//修改禁止该用户
	int update(Integer id ,String locked);
	
	//个人主要上传头像
	int addHead_picture(User user);
	
	
}
