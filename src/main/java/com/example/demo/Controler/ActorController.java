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

public class ActorController {

    ActorRepository actorRepository;

    @GetMapping("getIdnCost")
    public ActorOrBasicNames getActorId (@RequestParam Integer getIdnCost) throws Exceptions {
        return actorRepository.findByIdnCost(getIdnCost).orElse(null);
    }

    @GetMapping("getPrimaryName")
    public ActorOrBasicNames findPrimaryName (@RequestParam String getName) throws Exceptions {
        return actorRepository.findByPrimaryName(getName).orElse(null);
    }

    @GetMapping("getBirthYear")
    public ActorOrBasicNames getBirthYear(@RequestParam Integer getBirthYear) throws Exceptions {
        return actorRepository.findBirthYear(getBirthYear).orElse(null);
    }

    @GetMapping("getDeathYear")
    public ActorOrBasicNames getDeathYear(@RequestParam Integer getDeathYear) throws Exceptions {
        return actorRepository.findByDeathYear(getDeathYear).orElse(null);
    }

    @GetMapping("getKnownForTitles")
    public ActorOrBasicNames getKnownForTitles(@RequestParam Integer getKnown) throws Exceptions {
        return actorRepository.findByKnownForTitles(getKnown).orElse(null);
    }
}
