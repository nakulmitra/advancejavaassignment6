package com.nagarro.flight.search.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.flight.search.interfaceDao.FlightDao;
import com.nagarro.flight.search.model.Flight;

/**
 * Class --> FlightFillter
 * @author nakulmitra
 * Description --> return the flight that matches the user requirements
 */
@Controller
public class FlightFillter {
	@RequestMapping(value = "/sort_flight", method = RequestMethod.POST)
	public String Flights(@ModelAttribute("flight") Flight flight, ModelMap map) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nagarro/flight/search/util/config2.xml");
		FlightDao dao = (FlightDao) context.getBean("FlightDao");
		List<Flight> all_Flights = dao.Sorted_Flights(flight.getArrival(), flight.getDeparture(), flight.getDate(),
				flight.getClas(), flight.getPref());
		map.addAttribute("mmm", all_Flights);
		map.addAllAttributes(all_Flights);
		return "flights";

	}

}
