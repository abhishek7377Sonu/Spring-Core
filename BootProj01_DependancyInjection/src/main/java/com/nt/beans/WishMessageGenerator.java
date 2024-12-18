package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
@Autowired
private Calendar calender;

//b.method

public String generateWishMessage(String user) {
	//get current hour of the day
	int hour=calender.get(Calendar.HOUR_OF_DAY);
	//generate wish message
	if(hour<12)
		return "Good Morning "+user;
	else if(hour<16)
		return "Good AfterNoon "+user;
	else if(hour<20)
		return "Good Evening "+user;
	else
		return "Good Night "+user;
	
}
}
