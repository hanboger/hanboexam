package com.hanbo.cms.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbo.cms.dao.CommnentMapper;
import com.hanbo.cms.entity.Article;
import com.hanbo.cms.entity.Commnent;
import com.hanbo.cms.service.CommnentService;

@Service
public class CommnentServiceImpl implements CommnentService {

	@Autowired
	CommnentMapper commnentMapper;
	

	

	@Override
	public List<Commnent> commnentlist(Integer articleId) {
		// TODO Auto-generated method stub
		return commnentMapper.commnentlist(articleId);
	}

	@Override
	public void comment(Integer userId, Integer articleId, String content) {
		// TODO Auto-generated method stub
		Commnent commnent = new Commnent(articleId,userId,content);
		commnentMapper.addCommnent(commnent);
		commnentMapper.increaseCommentCnt(articleId);
	}
	


}
