package com.assignmentwebflux.infoservice;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Component
public class InfoClient {
    private final WebClient client;

    public InfoClient(WebClient.Builder builder){
        this.client = builder.baseUrl("http://localhost:8090").build();
    }

    public Mono<String> infoClient(){
        return this.client.get().uri("/info-service/uri").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                ;
    }

}
