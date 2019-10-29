package com.hanbo.cms.entity;

import java.util.LinkedHashMap;

/**
 * 
 * @author wangting
 *
 */
public class Article4Vote {
	
	Integer id;
	
	String title;
	/**
	 * 投票的选项 的字符串
	 */
	String content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 投票的选项
	 */
	LinkedHashMap< Character, String > voteMap;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LinkedHashMap<Character, String> getVoteMap() {
		return voteMap;
	}
	public void setVoteMap(LinkedHashMap<Character, String> voteMap) {
		this.voteMap = voteMap;
	}
	
	
}
