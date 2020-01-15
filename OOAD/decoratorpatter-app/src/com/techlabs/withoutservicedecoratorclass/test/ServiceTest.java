package com.techlabs.withoutservicedecoratorclass.test;

import com.techlabs.withoutservicedecoratorclass.BasicService;
import com.techlabs.withoutservicedecoratorclass.IServiceble;
import com.techlabs.withoutservicedecoratorclass.OilChange;
import com.techlabs.withoutservicedecoratorclass.WaterWash;

public class ServiceTest {
	public static void main(String[] args) {
		IServiceble service = new WaterWash((new BasicService()));
		System.out.println("Total cost:" + service.getCost());
		System.out.println("description:" + service.getDescription());
	}

}
