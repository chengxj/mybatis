package com.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.dao.ActivitiesMapper;
import com.mybatis.model.Activities;

@Service
public class ActivitiesService {
	
	
	private ActivitiesMapper activitiesMapper;
	
	public Activities getActivities() {
		Activities activities = activitiesMapper.selectByPrimaryKey(1L);
		return activities;
	}

	/**
	 * @return the activitiesMapper
	 */
	public ActivitiesMapper getActivitiesMapper() {
		return activitiesMapper;
	}

	/**
	 * @param activitiesMapper the activitiesMapper to set
	 */
	@Autowired
	public void setActivitiesMapper(ActivitiesMapper activitiesMapper) {
		this.activitiesMapper = activitiesMapper;
	}
	
}
