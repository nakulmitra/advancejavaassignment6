package com.nagarro.flight.search.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class --> Flight
 * @author nakulmitra
 * Description --> getter and setter operations of flight class with toString methods.
 */
@Entity
@Table(name = "flight_details")
public class Flight {
	@Id
	@Column(name = "FLIGHT_NO")
	private String Flight_no;
	@Column(name = "DEP_LOC")
	private String departure;
	@Column(name = "ARR_LOC")
	private String arrival;
	@Column(name = "VALID_TILL")
	private String date;
	@Column(name = "FLIGHT_TIME")
	private int time;
	@Column(name = "FLIGHT_DUR")
	private double duration;
	@Column(name = "FARE")
	private int fare;
	@Column(name = "SEAT_AVAILABILITY")
	private char Aval;
	@Column(name = "CLASS")
	private String clas;

	private String pref;

	public String getPref() {
		return pref;
	}

	public void setPref(String pref) {
		this.pref = pref;
	}

	public String getFlight_no() {
		return Flight_no;
	}

	public void setFlight_no(String flight_no) {
		Flight_no = flight_no;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDate() {
		return date;
	}

	public LocalDate getDatee() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date2 = LocalDate.parse(date, format);
		return date2;

	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public char getAval() {
		return Aval;
	}

	public void setAval(char aval) {
		Aval = aval;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	@Override
	public String toString() {
		return "Flight [Flight_no=" + Flight_no + ", departure=" + departure + ", arrival=" + arrival + ", date=" + date
				+ ", time=" + time + ", duration=" + duration + ", fare=" + fare + ", Aval=" + Aval + ", clas=" + clas
				+ ", pref=" + pref + "]";
	}

}
