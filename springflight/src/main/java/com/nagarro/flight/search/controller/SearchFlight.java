package com.nagarro.flight.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Class --> SearchFlight
 * @author nakulmitra
 * send the response to the result.jsp page 
 */
@Controller
public class SearchFlight {
	@RequestMapping(value = "/search_option", method = RequestMethod.POST)
	public String FindFlight() {
		System.out.println("search flight");
		return "result";
	}
}
