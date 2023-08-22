package com.example.demo.day5.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.day5.model.HotelModel;
import com.example.demo.day5.service.HotelService;

@RestController
public class HotelController {
	
@Autowired
public HotelService hser;
//post
@PostMapping("/PostHotel")
public String postHotel(@RequestBody HotelModel hr) {
	hser.saveHotel(hr);
	return"data saved";
}
//get
@GetMapping("/getHotel")
public List<HotelModel>getHotelInfo(){
	return hser.getHotel();
}
@PutMapping("/updateModel")
public HotelModel updateInfo(@RequestBody HotelModel h) {
	return hser.updateHotel(h);
}
//delete
@DeleteMapping("/deleteHotel/(id")
public String removeHotel(@PathVariable("id")int hid){
	hser.deleteHotel(hid);
	return "Hotel with Id"+hid+ "is deleted";
}
//delete mapping using request parm
@DeleteMapping("/byReqParm")
public String removeByRequestParam(@RequestParam("id") int id) {
	hser.deleteHotel(id);
	return "Hotel with Id "+id+" is deleted";

}
public boolean
}
