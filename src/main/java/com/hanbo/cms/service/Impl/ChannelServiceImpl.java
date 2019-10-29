package com.hanbo.cms.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbo.cms.dao.ChannelMapper;
import com.hanbo.cms.entity.Article;
import com.hanbo.cms.entity.Channel;
import com.hanbo.cms.service.ChannelService;

@Service
public class ChannelServiceImpl  implements ChannelService{

	@Autowired
	ChannelMapper channelMapper;
	
	/**
	 *  获取所有的频道（栏目）
	 * @return
	 */
	@Override
	public List<Channel> getAllChnls() {
		// TODO Auto-generated method stub
		return channelMapper.listAll();
	}

	@Override
	public List<Article> getSreach(String title) {
		// TODO Auto-generated method stub
		return channelMapper.sreach(title);
	}



	

}
