package tech.chirayu.portfolio.controller;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tech.chirayu.portfolio.pojo.User;
import tech.chirayu.portfolio.service.MyService;

@Controller 
@RequestMapping("/test")
public class MyController {
	
	@Autowired
	private MyService myService;
	
//	public Map<Integer, Integer> readSales(){
//		return myService.readSales();
//	}
	
	@GetMapping("/sales2")
	@ResponseBody
	public List<User> readSales() {
		
		User user3 = new User(10, "Kavya", "Monalisa Surat");
		User user1 = new User(11, "Chirayu", "909 Clonsilla Peterborough");
		User user2 = new User(12, "neha", "sarita surat");
		
		List<User> asList = Arrays.asList(user3,user1,user2);
		
		return asList;
	}
	
}
