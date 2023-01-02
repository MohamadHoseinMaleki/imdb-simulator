/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Controler;

import com.example.demo.Repository.PrincipalsTitleRepository;
import com.example.demo.moodel.PrincipalsTitle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class PrincipalsController {

    PrincipalsTitleRepository principalsRepo ;

    @GetMapping("getIdConst")
    public PrincipalsTitle getIdConst (@RequestParam String st){
        return (PrincipalsTitle) principalsRepo.findByIdTConst(st).orElse(null);
    }

    @GetMapping("getCategory")
    public PrincipalsTitle getCategory (@RequestParam String st){
        return (PrincipalsTitle) principalsRepo.findByCategory(st).orElse(null);
    }

    @GetMapping("getFindBOrdering")
    public PrincipalsTitle getFindBOrdering (@RequestParam String st){
        return (PrincipalsTitle) principalsRepo.findByOrdering(st).orElse(null);
    }

    @GetMapping("getFindBynConst")
    public PrincipalsTitle getFindBynConst (@RequestParam String st){
        return (PrincipalsTitle) principalsRepo.findBynConst(st).orElse(null);
    }

    @GetMapping("getFindByJob")
    public PrincipalsTitle getFindByJob (@RequestParam String st){
        return (PrincipalsTitle) principalsRepo.findByJob(st).orElse(null);
    }

    @GetMapping("getFindByCharacters")
    public PrincipalsTitle getFindByCharacters (@RequestParam String st){
        return (PrincipalsTitle) principalsRepo.findByCharacters(st).orElse(null);
    }
}
