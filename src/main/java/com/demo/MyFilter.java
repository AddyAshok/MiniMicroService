package com.demo;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;



import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter {
	
	
	
     
	 Logger log = LoggerFactory.getLogger(MyFilter.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        
		
		log.info(" filter() executed");
		
		  ServerHttpRequest httpRequest=exchange.getRequest();
		  
            HttpHeaders headers=httpRequest.getHeaders();
            
            Set<String> ketset=headers.keySet();
            ketset.forEach(key ->{
            	
            	List<String> vaList=headers.get(key);
            	System.out.println(key +"    :::::"+vaList);
            });
		  
		
		
		
		return chain.filter(exchange);
	}

}
