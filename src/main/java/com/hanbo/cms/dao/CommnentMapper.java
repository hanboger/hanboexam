package com.hanbo.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hanbo.cms.entity.Article;
import com.hanbo.cms.entity.Commnent;

public interface CommnentMapper {

	@Update("UPDATE cms_article SET commentCnt=commentCnt+1 WHERE id =#{id}")
	int updateCommnents(Article article);

	@Insert("INSERT INTO `cms_comment` (articleId,userId,content,created) VALUES(#{articleId},41,#{content},now())")
	int insert(Commnent commnent);

	@Select("select c.*,u.username as userName  FROM cms_comment c LEFT JOIN cms_user u  ON u.id=c.userId WHERE c.articleId=#{articleId}")
	List<Commnent> commnentlist(@Param("articleId")Integer articleId);
	
	
	@Insert("INSERT INTO cms_comment(userId,articleId,content,created)"
			+ " VALUES(#{userId},#{articleId},#{content},now() )")
	void addCommnent(Commnent commnent);
	@Update("UPDATE cms_article SET commentCnt=commentCnt+1 WHERE id=#{value}")
	void increaseCommentCnt(Integer articleId);

}
