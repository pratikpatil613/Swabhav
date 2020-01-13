package com.techlabs.servce.test;

import com.techlabs.servce.BasicService;
import com.techlabs.servce.Iserviceble;
import com.techlabs.servce.OilChange;
import com.techlabs.servce.WaterWash;

public class ServiceTest {
	public static void main(String[] args) {
		Iserviceble service = new WaterWash(new OilChange(new BasicService()));
		System.out.println("Total cost:" + service.getCost());
		System.out.println("description:" + service.getDescription());
	}

}
