package com.nagarro.flight.search.interfaceDao;

import java.util.List;

import com.nagarro.flight.search.model.Flight;

/**
 * Class --> FlightDao
 * @author nakulmitra
 * Description --> check the authentication of user and make the list of flights.
 */
public interface FlightDao {

	boolean Auth(String userid, String pass);

	List<Flight> All_Flights();

	List<Flight> Sorted_Flights(String arrival, String departure, String date, String clas, String pref);

}
