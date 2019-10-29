package com.hanbo.cms.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbo.cms.dao.Article4VoteMapper;
import com.hanbo.cms.entity.Article4Vote;
import com.hanbo.cms.entity.VoteStatic;
import com.hanbo.cms.service.Article4VoteService;

/**
 * 
 * @author Zhang旭涛
 *
 */
@Service
public class Article4VoteServiceImpl implements Article4VoteService {
	
	@Autowired
	Article4VoteMapper avMapper;

	@Override
	public int publish(Article4Vote av) {
		// TODO Auto-generated method stub
		return avMapper.add(av);
	}

	@Override
	public List<Article4Vote> list() {
		// TODO Auto-generated method stub
		return avMapper.list();
	}

	@Override
	public Article4Vote findById(Integer id) {
		// TODO Auto-generated method stub
		return avMapper.getById(id);
	}

	/*@Override
	public int vote(Integer userId, Integer articleId, Character option) {
		// TODO Auto-generated method stub
		return avMapper.vote(userId,  articleId,  option);
	}*/

	@Override
	public int vote(Integer articleId, Character option) {
		// TODO Auto-generated method stub
		//return avMapper.vote(userId,  articleId,  option);
		return avMapper.vote(articleId,  option);
	}

	
	@Override
	public List<VoteStatic> getVoteStatics(Integer articleId) {
		// TODO Auto-generated method stub
		return avMapper.getVoteStatics(articleId);
	}

}
