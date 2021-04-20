package com.nagarro.flight.search.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.flight.search.interfaceDao.FlightDao;
import com.nagarro.flight.search.model.Flight;

/**
 * Class --> All_Flights
 * @author nakulmitra
 * Description --> find the list of all Flights.
 */
@Controller
public class AllFlights {

	@RequestMapping(value = "/all_flights", method = RequestMethod.POST)
	public String ShowAllflights(ModelMap map) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nagarro/flight/search/util/config2.xml");
		FlightDao dao = (FlightDao) context.getBean("FlightDao");
		List<Flight> all_Flights = dao.All_Flights();
		System.out.println(all_Flights);
		map.addAttribute("mmm", all_Flights);
		map.addAllAttributes(all_Flights);
		return "flights";

	}
}
