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
@Table(name = "Bookings")
public class Booking {

	@Id
	@Column(name = "BOOKING_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOKING_SEQ")
	@SequenceGenerator(sequenceName = "bookingid_seq", allocationSize = 1, name = "BOOKING_SEQ")
	private int bookingId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userId")
	private User user;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "flightId")
	private Flight flight;

	@Column(name = "BOOKING_STATUS")
	private String bookingStatus;

	@Column(name = "NO_OF_PASSENGERS")
	private int noOfPassengers;

	@Column(name = "TOTAL_COST")
	private long totalCost;

	@Column(name = "REFUND_AMOUNT")
	private long refundAmount;

	@Column(name = "TRAVEL_CLASS")
	private String travelClass;

}
