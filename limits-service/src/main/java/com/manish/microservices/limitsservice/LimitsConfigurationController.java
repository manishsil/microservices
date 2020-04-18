package com.manish.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manish.microservices.limitsservice.bean.LimitsConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration conf;
	
	@GetMapping("/limits")
	public LimitsConfiguration getLimitsFromConfiguration() {
		return LimitsConfiguration.builder().maximun(conf.getMaximum()).minimum(conf.getMinimum()).region(conf.getRegion()).build();
		
	}
	
	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
	public LimitsConfiguration retrieveConfiguration() {
		throw new RuntimeException("Not available");
	}

	public LimitsConfiguration fallbackRetrieveConfiguration() {
		return LimitsConfiguration.builder().maximun(999).minimum(9).region("DefaultRegion").build();
	}
}
