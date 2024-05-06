package com.omrbranch.pojo.address;

import java.util.ArrayList;

public class City_Output {

	private int status;
	private String message;
	private ArrayList<Datum_OutPojo> data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<Datum_OutPojo> getData() {
		return data;
	}

	public void setData(ArrayList<Datum_OutPojo> data) {
		this.data = data;
	}

}
