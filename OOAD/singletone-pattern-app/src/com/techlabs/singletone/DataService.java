package com.techlabs.singletone;

public class DataService {

	static DataService bucket;

	public DataService() {
		System.out.println("Service created");
	}

	public static DataService getInstance() {
		if (bucket == null)
			// return new DataService();
			bucket = new DataService();
		return bucket;
	}

	public void processData() {
		System.out.println("process data service:" + this.hashCode());
	}

}
