package com.qa.cinema.service;

public interface ScreenService {
	
String getAllScreens();
	
	String getScreenById(Long screenId);
	
	String addNewScreen(String screenJson);
	
	String removeScreen(Long screenId);
	
	String updateScreen(Long screenId, String screenUpdate);
	
}