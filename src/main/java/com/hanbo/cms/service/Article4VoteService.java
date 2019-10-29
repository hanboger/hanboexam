package com.hanbo.cms.service;

import java.util.List;

import com.hanbo.cms.entity.Article4Vote;
import com.hanbo.cms.entity.VoteStatic;

/**
 * 
 * @author wangting
 *
 */
public interface Article4VoteService {
	
	int publish(Article4Vote av);
	
	List<Article4Vote>  list();
	
	Article4Vote  findById(Integer id);
	
	int vote(Integer articleId,Character option);
	//int vote(Integer userId, Integer articleId,Character option);
	
	List<VoteStatic> getVoteStatics(Integer articleId);
	
	
	

}
