package com.genie.API_Gateway;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Set;


@Component
public class MyFilter implements GlobalFilter {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("inside filter......");
        ServerHttpRequest request = exchange.getRequest();
        HttpHeaders headers = request.getHeaders();
        Set<String> keySet = headers.keySet();
        String mykey="zzzz";

        String APIKEY = headers.getFirst("X-API-KEY");
        if(APIKEY==null || !APIKEY.equals(mykey))
        {
            ServerHttpResponse response= (ServerHttpResponse) exchange.getResponse();
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return response.setComplete();
        }

/*
        keySet.forEach(key->{
            List<String> values = headers.get(key);
            System.out.println("key : "+values);
        });
        */
        return chain.filter(exchange);
    }
}
