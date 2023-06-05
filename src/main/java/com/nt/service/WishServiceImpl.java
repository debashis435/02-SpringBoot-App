package com.nt.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishServiceImpl implements IWishService {

	@Override
	public String generateWishMessage() {
		// TODO Auto-generated method stub
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour<=12)
			
		return "good morning";
		else if(hour<=16)
			return "Good Afternoon";
		else if(hour<=20)
			return "good night";
		else
			return"good night";
	}

}
