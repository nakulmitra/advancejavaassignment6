package com.nagarro.flight.search.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.flight.search.interfaceDao.FlightDao;
import com.nagarro.flight.search.model.User;

/**
 * Class --> Login
 * @author nakulmitra
 * Description --> check the authentication of user if right than send to result.jsp page else return control 
 * to same page.
 */
@Controller
public class Login {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView hello(@ModelAttribute("user") User user) {
		System.out.println(user);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nagarro/flight/search/util/config1.xml");
		FlightDao dao = (FlightDao) context.getBean("FlightDao");
		boolean b = dao.Auth(user.getUserid(), user.getPass());
		ModelAndView modelAndView = new ModelAndView();
		if (b) {
			modelAndView.setViewName("result");
		} else {
			modelAndView.setViewName("index");
		}
		return modelAndView;
	}
}
