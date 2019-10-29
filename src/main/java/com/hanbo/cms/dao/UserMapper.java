package com.hanbo.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hanbo.cms.entity.User;

public interface UserMapper {

	//添加用户
	@Insert("INSERT INTO cms_user(username,password,gender,create_time) values(#{username},#{password},#{gender},now())")
	int add(User user);
	/**
	 * 根据用户名查找
	 * @param username
	 * @return
	 */
	@Select("SELECT * FROM cms_user where username=#{value} limit 1")
	User findByName(String username);
	/**
	 * 查询
	 * @param locked
	 * @return
	 */
	List<User> list(@Param("locked")int locked);
	
	@Update("update cms_user set locked=#{locked} where id=#{id}")
	int update(@Param("id")Integer id ,@Param("locked")String locked);
	//
	//上傳圖片
	@Update("update cms_user set head_picture=#{head_picture} where id=#{id}")
	int addHead_picture(User user);
	
}
