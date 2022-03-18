package com.lti.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Flights")
public class Flight {

	@Id
	@Column(name = "FLIGHT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FLIGHT_SEQ")
	@SequenceGenerator(sequenceName = "flightid_seq", allocationSize = 1, name = "FLIGHT_SEQ")
	private int flightId;

	@Column(name = "FLIGHT_NAME")
	private String flightName;

	@Column(name = "SOURCE")
	private String source;

	@Column(name = "DESTINATION")
	private String destination;

	@Column(name = "DEPARTURE_DATE")
	private Date departureDate;

	@Column(name = "DEPARTURE_TIME")
	private String departureTime;

	@Column(name = "ARRIVAL_DATE")
	private Date arrivalDate;

	@Column(name = "ARRIVAL_TIME")
	private String arrivalTime;

	@Column(name = "ECONOMIC_SEATS")
	private int economicSeats;

	@Column(name = "BUSINESS_SEATS")
	private int businessSeats;

	@Column(name = "ECONOMY_COST")
	private long economyCost;

	@Column(name = "BUSINESS_COST")
	private long businessCost;

	@Column(name = "E_SEATS_BOOKED")
	private int eSeatsBooked;

	@Column(name = "B_SEATS_BOOKED")
	private int bSeatsBooked;

}
