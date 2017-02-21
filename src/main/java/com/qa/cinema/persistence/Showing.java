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
	@Column(name="showing_id", unique=true, nullable=false)
	private Long showingId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="showing_start_time", nullable=false)
	private Date startTime;

	//bi-directional many-to-one association to Screen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="showing_screen_id", nullable=false)
	private Screen cinScreen;

	//bi-directional many-to-one association to Film
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="showing_film_id", nullable=false)
	private Film cinFilm;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="cinShowing")
	private List<Ticket> cinTickets;

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

	public Screen getCinScreen() {
		return this.cinScreen;
	}

	public void setCinScreen(Screen cinScreen) {
		this.cinScreen = cinScreen;
	}

	public Film getCinFilm() {
		return this.cinFilm;
	}

	public void setCinFilm(Film cinFilm) {
		this.cinFilm = cinFilm;
	}

	public List<Ticket> getCinTickets() {
		return this.cinTickets;
	}

	public void setCinTickets(List<Ticket> cinTickets) {
		this.cinTickets = cinTickets;
	}

	public Ticket addCinTicket(Ticket cinTicket) {
		getCinTickets().add(cinTicket);
		cinTicket.setCinShowing(this);

		return cinTicket;
	}

	public Ticket removeCinTicket(Ticket cinTicket) {
		getCinTickets().remove(cinTicket);
		cinTicket.setCinShowing(null);

		return cinTicket;
	}

}