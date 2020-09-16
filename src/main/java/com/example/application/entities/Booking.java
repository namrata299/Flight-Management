package com.example.application.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter

@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "booking_id")
	private Long bookingId;
	@Column(name = "booking_date")
	private Date bookingDate;
	@Column(name = "ticket_cost")
	private double ticketCost;
	@Column(name = "no_passegeners")
	private int numberOfPassengers;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "booking")
	private List<Passenger> passengerList;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="scheduled_flight_id")
	private ScheduledFlight scheduledFlight;
}
