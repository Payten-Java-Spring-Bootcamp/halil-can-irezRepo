package com.homework3.controller;

import com.homework3.service.actor.Actor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class ActorRequest {

    @NotNull
    private String name;

    @NotBlank
    private LocalDateTime birthDate;

    public Actor convertToActor(){
        Actor actor = new Actor();
        actor.setName(name);
        actor.setBirthDate(birthDate);
        return actor;

    }
}
