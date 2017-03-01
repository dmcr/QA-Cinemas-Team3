package com.qa.cinema.persistence;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;


/**
 * The persistent class for the cin_seat_type database table.
 * 
 */
@Entity
@Table(name="cin_seat_type")
@NamedQuery(name="SeatType.findAll", query="SELECT s FROM SeatType s")
public class SeatType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="type_id")
	private Long typeId;

	@Column(name="type_name")
	@Enumerated(EnumType.STRING)
	private SeatTypeName name;

	@Column(name="type_price")
	private BigDecimal price;

	public SeatType() {
	}

	public SeatType(Long typeId, SeatTypeName name, BigDecimal price) {
		super();
		this.typeId = typeId;
		this.name = name;
		this.price = price;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public SeatTypeName getName() {
		return name;
	}

	public void setName(SeatTypeName name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
