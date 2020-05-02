package com.manish.microservices.currencyexchangeservice;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Endpoint(id="manish", enableByDefault=true)
public class MyCustomActuatorEndpoint {

	@ReadOperation
	public MyCustomActuatorEndpointResponse feature() {
		return new MyCustomActuatorEndpointResponse(1 , "Manish Sil", "UP");
	}
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class MyCustomActuatorEndpointResponse {
	private int id;
	private String name;
	private String status;
}
