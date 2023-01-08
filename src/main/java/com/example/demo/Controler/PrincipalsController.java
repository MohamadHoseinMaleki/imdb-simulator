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

import java.util.Optional;

public class PrincipalsController {

    PrincipalsTitleRepository principalsRepo ;

    @GetMapping("getIdConst")
    public Optional<PrincipalsTitle> getIdConst (@RequestParam Integer integer){
        return  principalsRepo.findById(integer);
    }

    @GetMapping("getCategory")
    public PrincipalsTitle getCategory (@RequestParam String st){
        return (PrincipalsTitle) principalsRepo.findByCategory(st);
    }

    @GetMapping("getFindBOrdering")
    public PrincipalsTitle getFindBOrdering (@RequestParam Integer integer){
        return (PrincipalsTitle) principalsRepo.findByOrdering(integer);
    }

    @GetMapping("getFindBynConst")
    public PrincipalsTitle getFindBynConst (@RequestParam String st){
        return (PrincipalsTitle) principalsRepo.findByNConst(st);
    }

    @GetMapping("getFindByJob")
    public PrincipalsTitle getFindByJob (@RequestParam String st){
        return (PrincipalsTitle) principalsRepo.findByJob(st);
    }

    @GetMapping("getFindByCharacters")
    public PrincipalsTitle getFindByCharacters (@RequestParam String st){
        return (PrincipalsTitle) principalsRepo.findByCharacters(st) ;
    }
}
