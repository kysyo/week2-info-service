package com.assignmentwebflux.infoservice;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class InfoHandler {

    public Mono<ServerResponse> info(ServerRequest request){
        String name = request.queryParam("name").get();
        System.out.println(name);
        Mono<InfoData> infoData = Mono.just(new InfoData("Developer"));
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(infoData, InfoData.class)
                ;
    }

}
