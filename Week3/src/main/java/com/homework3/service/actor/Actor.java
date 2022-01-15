package com.homework3.service.actor;

import com.homework3.repository.actor.ActorEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Actor {

    private String name;
    private LocalDateTime birthDate;

    public ActorEntity convertToActorEntity() {
        ActorEntity entity = new ActorEntity();
        entity.setName(name);
        entity.setBirthDate(birthDate);
        return entity;
    }
}
