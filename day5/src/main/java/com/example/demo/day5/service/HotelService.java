package com.example.demo.day5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.day5.model.HotelModel;
import com.example.demo.day5.repository.HotelRepo;


@Service
public class HotelService {
	@Autowired
public HotelRepo hrepo;
	public String saveHotel(HotelModel h)
	{
		hrepo.save(h);
		return "data is saved to database";
		}
	//get the data
	public List<HotelModel> getHotel()
	{
		return hrepo.findAll();
	}
	//update the data(put)
	public HotelModel updateHotel(HotelModel hm)
	{
		return hrepo.saveAndFlush(hm);
	}
	//dalete the data
	public void deleteHotel(int hotel_id) 
	
	{
		System.out.println("Deleted");
		hrepo.deleteById(hotel_id);
	}
}
