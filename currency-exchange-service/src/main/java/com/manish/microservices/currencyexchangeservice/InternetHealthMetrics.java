package com.manish.microservices.currencyexchangeservice;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealthMetrics implements HealthIndicator {

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		System.out.println("Health Check");
		Health health = null;
		health = checkInternet() == true ? Health.up().withDetail("Success Code", "Active Internet").build()
				: Health.down().withDetail("Error Code", "Inactive Internet").build();
		return health;
	}

	private boolean checkInternet() {
		boolean flag = false;
		try {
			URL url = new URL("https://www.google.com/");
			URLConnection con = url.openConnection();
			con.connect();
			flag = true;
		} catch (Exception e) {

		}
		return flag;
	}

}
