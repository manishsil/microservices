# microservices

Ref: https://github.com/in28minutes/spring-microservices

# Currency conversion server

http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/100

http://localhost:8765/currency-conversion-service/currency-converter-feign/from/USD/to/INR/quantity/100

# Currency exchange server

http://localhost:8000/currency-exchange/from/USD/to/INR

http://localhost:8001/currency-exchange/from/USD/to/INR

#Limit Server

http://localhost:8080/limits

**URL to refresh individual instance of limit service

POST http://localhost:8081/actuator/refresh

**URL to refresh all instances of limit service

POST http://localhost:8080/actuator/bus-refresh


#Config server

http://localhost:8888/limits-service/dev

#Eureka Server

http://localhost:8761/

#Admin Server

http://localhost:7700/

#Hystrix Dashboard

http://localhost:8080/actuator/hystrix.stream

http://localhost:8080/actuator/hystrix


#Zuul Api Url

http://localhost:8765/{applicationName}/{uri}

**For currency-exchange
http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/INR


# Zipkin server

http://localhost:9411/zipkin/

**Steps to set up zipkin server

1) Install ERLANG
2) Install Rabbit MQ
3) Download Zipkin jar and run by the below command

*** Command to start Zipkin server

SET RABBIT_URI=amqp://localhost
java -jar zipkin-server-2.21.1-exec.jar

Download Links:

https://www.rabbitmq.com/install-windows.html

https://www.rabbitmq.com/which-erlang.html

http://www.erlang.org/downloads

Video - https://www.youtube.com/watch?v=gKzKUmtOwR4

