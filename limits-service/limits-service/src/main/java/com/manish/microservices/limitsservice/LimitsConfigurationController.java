package com.manish.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manish.microservices.limitsservice.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration conf;
	
	@GetMapping("/limits")
	public LimitsConfiguration getLimitsFromConfiguration() {
		return LimitsConfiguration.builder().maximun(conf.getMaximum()).minimum(conf.getMinimum()).region(conf.getRegion()).build();
		
	}
}
