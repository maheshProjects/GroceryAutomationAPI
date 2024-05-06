package com.omrbranch.payload.manager;

import com.omrbranch.payload.address.AddressPayload;

public class PayloadObjectManager {

	private AddressPayload pom;

	public AddressPayload getAddressPayload() {
		return (pom == null) ? pom = new AddressPayload() : pom;
	}

}
