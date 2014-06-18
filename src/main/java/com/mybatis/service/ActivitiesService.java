package com.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.dao.ActivitiesMapper;
import com.mybatis.model.Activities;

@Service
public class ActivitiesService {
	
	@Autowired
	private ActivitiesMapper activitiesMapper;
	
	public Activities getActivities() {
		Activities activities = activitiesMapper.selectByPrimaryKey(1L);
		return activities;
	}

}
