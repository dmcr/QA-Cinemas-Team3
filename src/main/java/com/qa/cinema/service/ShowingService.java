package com.qa.cinema.service;

public interface ShowingService {

String getAllShowings();
	
	String getShowingById(Long showingId);
	
	String addNewShowing(String showingJson);
	
	String removeShowing(Long showingId);
	
	String updateShowing(Long showingId, String showingUpdate);
	
}