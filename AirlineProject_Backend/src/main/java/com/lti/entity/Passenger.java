package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Passengers")
public class Passenger {

	@Id
	@Column(name = "PASSENGER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PASSENGER_SEQ")
	@SequenceGenerator(sequenceName = "passengerid_seq", allocationSize = 1, name = "PASSENGER_SEQ")
	private int passengerId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "bookingId")
	private Booking booking;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private int passengerAge;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "SEAT_NO")
	private int seatNo;

}
