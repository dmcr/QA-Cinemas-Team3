package com.qa.cinema.service;

import static org.junit.Assert.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.junit.Test;

public class SeatTypeServiceJunitTests {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Test
	public void testListAllSeatTypes() {
		DBSeatTypeService DBST = new DBSeatTypeService();
		SeatType newSeatType = SeatType(4L, 10.00, "Adult");
		em.persist(newSeatType);
		assertEquals("" ,DBST.listAllSeatTypes());	
	}
	
	
	@Test
	public void testListSeatTypeBasedOnId(){
		DBSeatTypeService DBST = new DBSeatTypeService();
		assertEquals( ,DBST.listSeatTypeBasedOnId(4L));
	}

}
