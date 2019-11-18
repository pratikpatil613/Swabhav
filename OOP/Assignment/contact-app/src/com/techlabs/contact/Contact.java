package com.techlabs.contact;

import java.io.Serializable;
import java.math.BigInteger;

public class Contact implements Serializable {
	protected String name;
	protected String contctNo;
	protected String emailId;

	public Contact(String name, String contactNo, String emailId) {
		this.name = name;
		this.contctNo = contactNo;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public String getContactNO() {
		return contctNo;
	}

	public String getEmailId() {
		return emailId;
	}

	@Override
	public String toString() {
		String format = "Name:" + this.name + "Contact no:" + this.contctNo + "Email" + this.emailId;
		return format;
	}

}
