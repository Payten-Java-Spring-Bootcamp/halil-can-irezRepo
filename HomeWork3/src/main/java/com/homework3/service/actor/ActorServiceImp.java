package com.homework3.service.actor;


import com.homework3.repository.actor.ActorDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActorServiceImp implements ActorService {

    private final ActorDao actorDao;

    @Override
    public void add(Actor actor) {
        actorDao.create(actor.convertToActorEntity());

    }
}
