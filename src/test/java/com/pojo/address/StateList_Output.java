package com.omrbranch.pojo.address;

import java.util.ArrayList;

public class StateList_Output {

	private int status;
	private String message;
	private ArrayList<DatumState> data;

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

	public ArrayList<DatumState> getData() {
		return data;
	}

	public void setData(ArrayList<DatumState> data) {
		this.data = data;
	}

}
