package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Payment")
public class Payment {

	@Id
	@Column(name = "TRANSACTION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAYMENT_SEQ")
	@SequenceGenerator(sequenceName = "transactionid_seq", allocationSize = 1, name = "PAYMENT_SEQ")
	private int transactionId;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "bookingId")
	private Booking booking;

	@Column(name = "CARD_NUMBER")
	private String cardNumber;

	@Column(name = "CARD_HOLDER_NAME")
	private String cardName;

	@Column(name = "TOTAL_COST")
	private long totalCost;

}
