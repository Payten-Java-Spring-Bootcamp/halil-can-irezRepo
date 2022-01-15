package com.homework3.controller;

import com.homework3.service.actor.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequiredArgsConstructor
public class ActorController {

    private final ActorService actorService;

    @PostMapping("/actor")
    public void addActor(@RequestBody @Valid ActorRequest request){
        actorService.add(request.convertToActor());
    }



}
