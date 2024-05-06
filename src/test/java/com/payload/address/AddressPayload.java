package com.omrbranch.payload.address;

import com.omrbranch.pojo.address.AddAdress_Input_Pojo;
import com.omrbranch.pojo.address.City_Input;
import com.omrbranch.pojo.address.Delete_Input;
import com.omrbranch.pojo.address.UpdateAddress_Input;

public class AddressPayload {

	public City_Input getPayloadCity(int i) {
		City_Input city_Input = new City_Input(i);
		return city_Input;

	}

	public AddAdress_Input_Pojo getaddAdress(String fName, String sName, String mobile, String app, int stateId,
			int cityId, int country, String zipcode, String address, String addresType) {

		AddAdress_Input_Pojo addAdress_Input_Pojo = new AddAdress_Input_Pojo(fName, mobile, mobile, app, stateId,
				cityId, country, zipcode, address, addresType);
		return addAdress_Input_Pojo;

	}

	public UpdateAddress_Input getUpdatePayload(String addressID, String fName, String sName, String mobile, String app,
			int stateId, int cityId, int country, String zipcode, String address, String addresType) {

		UpdateAddress_Input updatedress_Input_Pojo = new UpdateAddress_Input(addressID, fName, mobile, mobile, app,
				stateId, cityId, country, zipcode, address, addresType);
		return updatedress_Input_Pojo;

	}

	public Delete_Input getDeletePayload(String addressID) {

		Delete_Input delete_Input = new Delete_Input(addressID);
		return delete_Input;

	}

}
