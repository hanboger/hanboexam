package com.hanbo.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.hanbo.cms.entity.Article4Vote;
import com.hanbo.cms.entity.VoteStatic;



/**
 * 
 * @author
 *
 */
@Mapper
public interface Article4VoteMapper {

	/**
	 * 发布一个投票
	 * @param av
	 * @return
	 */
	@Insert("insert into cms_article_vote (title,content) "
			+ "values(#{title},#{content})")
	int add(Article4Vote av);
	
	@Select("select * from cms_article_vote order by id desc limit 10")
	@ResultType(Article4Vote.class)
	List<Article4Vote> list();

	@Select("select * from cms_article_vote where id=#{value}   ")
	Article4Vote getById(Integer id);
	
	/**
	 *   参加投票
	 * @param userId
	 * @param articleId
	 * @param option
	 * @return
	 */
	/*@Insert("insert into cms_vote(article_id,user_id,`option`) "
			+ "values(#{articleId},#{userId},#{option})")
	int vote(@Param("userId") Integer userId, 
			@Param("articleId")  Integer articleId,
			@Param("option") Character option);*/
	
	@Insert("insert into cms_vote(article_id,`option`) "
			+ "values(#{articleId},#{option})")
	int vote(@Param("articleId")  Integer articleId,
			@Param("option") Character option);
	
	@Select("select  count(1) as voteNum , `option` as optionKey  "
			+ " FROM cms_vote  "
			+ " where article_id=#{value} "
			+ " GROUP BY `option`")
	@ResultType(VoteStatic.class)
	List<VoteStatic> getVoteStatics(Integer articleId);
	

}
