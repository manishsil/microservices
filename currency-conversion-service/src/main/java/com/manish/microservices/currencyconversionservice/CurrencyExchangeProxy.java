package com.manish.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currency-exchange-service", url="localhost:8000")  //this is for direct api call without ribbon load-balancing
//@FeignClient(name="currency-exchange-service")  // This is for api call through Load balanced through ribbon
@FeignClient(name="netflix-zuul-api-gateway-server") // Api call through Zuul server and Load balanced through ribbon
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {
	
	// This GetMethod uri is for direct api calling without zuul filter
	/*@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue
		(@PathVariable("from") String from, @PathVariable("to") String to);*/
	
	@GetMapping("currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue
		(@PathVariable("from") String from, @PathVariable("to") String to);
}
