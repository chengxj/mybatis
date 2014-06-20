package com.mybatis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mybatis.service.ActivitiesService;

@Controller
public class AuthController {
	
	private ActivitiesService activitiesService;

	@RequestMapping(value = "/")
	public String stockAuth(Model model) {
		model.addAttribute("activities", activitiesService.getActivities());
		return "index";
	}

	/**
	 * @return the activitiesService
	 */
	public ActivitiesService getActivitiesService() {
		return activitiesService;
	}

	/**
	 * @param activitiesService the activitiesService to set
	 */
	@Autowired
	public void setActivitiesService(ActivitiesService activitiesService) {
		this.activitiesService = activitiesService;
	}

}