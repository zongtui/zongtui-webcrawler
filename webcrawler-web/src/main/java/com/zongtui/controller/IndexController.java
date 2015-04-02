package com.zongtui.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

	@RequestMapping
	public String index(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) throws Exception {

		String name = "Tommy";

		modelMap.addAttribute("Name", name);

		return "/home/index";
	}

	@RequestMapping(params = "c=edit")
	public String edit(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) throws Exception {

		String actionName = "edit";

		modelMap.addAttribute("ActionName", actionName);

		return "/home/edit";
	}

}
