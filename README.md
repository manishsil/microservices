# microservices

# Currency conversion server
http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/100
http://localhost:8765/currency-conversion-service/currency-converter-feign/from/USD/to/INR/quantity/100

# Currency exchange server
http://localhost:8000/currency-exchange/from/USD/to/INR
http://localhost:8001/currency-exchange/from/USD/to/INR

#Limit Server
http://localhost:8080/limits

#Config server
http://localhost:8888/limits-service/dev

#Eureka Server
http://localhost:8761/

#Zuul Api Url
http://localhost:8765/{applicationName}/{uri}

**For currency-exchange
http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/INR

