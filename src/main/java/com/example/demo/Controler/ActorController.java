/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Controler;

import com.example.demo.Repository.ActorRepository;
import com.example.demo.exception.Exceptions;
import com.example.demo.moodel.ActorOrBasicNames;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class ActorController {

    ActorRepository actorRepository;

    @GetMapping("getIdnCost")
    public ActorOrBasicNames getActorId (@RequestParam Integer getIdnCost) throws Exceptions {
        return actorRepository.findById(getIdnCost).orElse(null);
    }

    @GetMapping("getPrimaryName")
    public List<ActorRepository> findPrimaryName (@RequestParam String getName) throws Exceptions {
        return actorRepository.findByPrimaryName(getName);
    }

    @GetMapping("getBirthYear")
    public List<ActorRepository> getBirthYear(@RequestParam Integer getBirthYear) throws Exceptions {
        return actorRepository.findByBirthYear(getBirthYear);
    }

    @GetMapping("getDeathYear")
    public List<ActorRepository> getDeathYear(@RequestParam Integer getDeathYear) throws Exceptions {
        return actorRepository.findByDeathYear(getDeathYear);
    }

    @GetMapping("getKnownForTitles")
    public List<ActorRepository> getKnownForTitles(@RequestParam Integer getKnown) throws Exceptions {
        return actorRepository.findByKnownForTitles(getKnown);
    }
}
