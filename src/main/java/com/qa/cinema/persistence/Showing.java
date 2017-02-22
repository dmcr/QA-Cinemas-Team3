package com.qa.cinema.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cin_showing database table.
 * 
 */
@Entity
@Table(name="cin_showing")
@NamedQuery(name="Showing.findAll", query="SELECT s FROM Showing s")
public class Showing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="showing_id")
	private Long showingId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="showing_start_time")
	private Date startTime;

	//bi-directional many-to-one association to Screen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="showing_screen_id")
	private Screen screen;

	//bi-directional many-to-one association to Film
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="showing_film_id")
	private Film film;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="showing")
	private List<Ticket> tickets;

	public Showing() {
	}

	public Long getShowingId() {
		return this.showingId;
	}

	public void setShowingId(Long showingId) {
		this.showingId = showingId;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Screen getScreen() {
		return this.screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Film getFilm() {
		return this.film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public List<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Ticket addTicket(Ticket ticket) {
		getTickets().add(ticket);
		ticket.setShowing(this);

		return ticket;
	}

	public Ticket removeTicket(Ticket ticket) {
		getTickets().remove(ticket);
		ticket.setShowing(null);

		return ticket;
	}

}