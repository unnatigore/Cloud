package com.capgemini.WebsiteService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebsiteController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/index")
	public ModelAndView gethelloWorld() {
		String message = restTemplate.exchange("http://HelloWorldService/helloWorlds", HttpMethod.GET,null,new ParameterizedTypeReference<String>() {
		}).getBody();
		return new ModelAndView("index","message",message);
}

}
