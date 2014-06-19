package com.mybatis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mybatis.service.ActivitiesService;

@Controller
public class AuthController {
	
	@Autowired
	private ActivitiesService activitiesService;

	@RequestMapping(value = "/")
	public String indexAuth(Model model) {
		model.addAttribute("activities", activitiesService.getActivities());
		return "index";
	}

}