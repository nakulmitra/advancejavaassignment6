package com.nagarro.flight.search.dao.implementaion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.nagarro.flight.search.interfaceDao.FlightDao;
import com.nagarro.flight.search.model.Flight;
import com.nagarro.flight.search.model.User;

/**
 * Class name --> FlightDaoImpl
 * @author nakulmitra
 * Description --> To implement searching and sorting of flight details.
 */
@Component("FlightDao")
public class FlightDaoImpl implements FlightDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	/**
	 * check authentication of user.
	 */
	@Override
	public boolean Auth(String userid, String pass) {
		System.out.println(userid+" : "+pass);
		
		User user = hibernateTemplate.get(User.class, userid);
		if (user.getUserid() != null && user.getPass().equals(pass)) {
			return true;
		}
		return false;
	}

	/**
	 * return all flight details
	 */
	@Override
	public List<Flight> All_Flights() {
		List<Flight> flight = hibernateTemplate.loadAll(Flight.class);
		return flight;
	}
	
	/**
	 * return the flight which matches the user requirements.
	 */
	@Override
	public List<Flight> Sorted_Flights(String arr, String dep, String date, String clas, String pref) {
		
		System.out.println(arr+" : "+dep+" : "+date+" : "+clas+" : " + pref);
		
		System.out.println(date.length());
		
		if(arr.length() == 0 || dep.length() == 0 || date.length() == 0 || clas == null || pref == null) {
			System.out.println(1);
			arr = "xxx";
			dep = "xxx";
			date = "01-01-2020";
			clas = "E";
			pref = "fare";
		}
		
		System.out.println(date +date.length());
		
		List<Flight> sortflight = new LinkedList<>();
		List<Flight> flight = hibernateTemplate.loadAll(Flight.class);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate datee = LocalDate.parse(date, format);
		for (Flight f : flight) {
			if (f.getArrival().equalsIgnoreCase(arr)) {
				if (f.getDeparture().equalsIgnoreCase(dep)) {
					if (f.getAval() == 'Y') {
						if (f.getClas().equalsIgnoreCase(clas)) {
							if (f.getDatee().compareTo(datee) >= 0) {
								Flight temp = new Flight();
								temp.setArrival(f.getArrival());
								temp.setAval(f.getAval());
								temp.setClas(f.getClas());
								temp.setDate(f.getDate());
								temp.setDeparture(f.getDeparture());
								temp.setDuration(f.getDuration());
								temp.setFare(f.getFare());
								temp.setFlight_no(f.getFlight_no());
								temp.setTime(f.getTime());
								sortflight.add(temp);
							}
						}
					}
				}
			}
		}
		if (pref.equalsIgnoreCase("fare")) {
			Collections.sort(sortflight, new fare());
		} else if (pref.equalsIgnoreCase("Duration")) {
			Collections.sort(sortflight, new duration());
		}
		return sortflight;
	}
}

/**
 * Class name --> fare
 * @author nakulmitra
 * Description --> sort the flights according to the fare 
 */
class fare implements Comparator<Flight> {
	@Override
	public int compare(Flight o1, Flight o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getFare() - o2.getFare());
	}
}

/**
 * Class name --> duration
 * @author nakulmitra
 * Description --> sort the flights according to the duration
 */
class duration implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {
		if (o1.getFare() - o2.getFare() == 0) {
			return (int) (o1.getDuration() - o2.getDuration());
		} else {
			return (int) (o1.getFare() - o2.getFare());
		}
	}

}