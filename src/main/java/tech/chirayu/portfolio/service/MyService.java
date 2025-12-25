package tech.chirayu.portfolio.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public Map<Integer, Integer> readSales() {
		Map<Integer, Integer> map=new LinkedHashMap<>();
		map.put(1991, 2000);
		map.put(1992, 4500);
		map.put(1993, 3200);
		map.put(1994, 5600);
		map.put(1995, 4100);
		map.put(1996, 3700);
		map.put(1997, 5000);
		
		return map;
	}
}
