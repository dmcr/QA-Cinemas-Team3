package com.qa.cinema.persistence;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the cin_seat database table.
 * 
 */
@Entity
@Table(name = "cin_seat")
@NamedQuery(name = "Seat.findAll", query = "SELECT s FROM Seat s")
public class Seat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seat_id")
	private Long seatId;

	@Column(name = "seat_number")
	private int number;

	@Column(name = "seat_row")
	private String row;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seat_type_id")
	private SeatType seatType;

	@Column(name = "seat_screen_id")
	private Long screenId;

	public Seat() {
	}

	public Seat(Long seatId, int number, String row, SeatType seatType, Long screenId) {
		super();
		this.seatId = seatId;
		this.number = number;
		this.row = row;
		this.seatType = seatType;
		this.screenId = screenId;
	}

	public Long getSeatId() {
		return seatId;
	}

	public void setSeatId(Long seatId) {
		this.seatId = seatId;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public Long getScreenId() {
		return screenId;
	}

	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}
}