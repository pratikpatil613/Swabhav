package com.techlabs.singletone.test;

import com.techlabs.singletone.DataService;

public class SingleToneDataServiceTest {
	public static void main(String[] args) {
			
		DataService service = new DataService();
	    DataService service1=new DataService();
        System.out.println(service.hashCode());
        System.out.println(service1.hashCode());
        
		// DataService service=DataService.getInstance();
		DataService service2 = DataService.getInstance();
		DataService service3 = DataService.getInstance();

		service2.processData();
		service3.processData();
	}

}
