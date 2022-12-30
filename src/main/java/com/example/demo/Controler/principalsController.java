/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Controler;

import com.example.demo.Repository.principalsTitleRepository;
import com.example.demo.moodel.principalsTitle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class principalsController {

    principalsTitleRepository principalsRepo ;

    @GetMapping("getIdConst")
    public principalsTitle getIdConst (@RequestParam String st){
        return (principalsTitle) principalsRepo.findByIdTConst(st).orElse(null);
    }

    @GetMapping("getCategory")
    public principalsTitle getCategory (@RequestParam String st){
        return (principalsTitle) principalsRepo.findByCategory(st).orElse(null);
    }

    @GetMapping("getFindBOrdering")
    public principalsTitle getFindBOrdering (@RequestParam String st){
        return (principalsTitle) principalsRepo.findByOrdering(st).orElse(null);
    }

    @GetMapping("getFindBynConst")
    public principalsTitle getFindBynConst (@RequestParam String st){
        return (principalsTitle) principalsRepo.findBynConst(st).orElse(null);
    }

    @GetMapping("getFindByJob")
    public principalsTitle getFindByJob (@RequestParam String st){
        return (principalsTitle) principalsRepo.findByJob(st).orElse(null);
    }

    @GetMapping("getFindByCharacters")
    public principalsTitle getFindByCharacters (@RequestParam String st){
        return (principalsTitle) principalsRepo.findByCharacters(st).orElse(null);
    }
}
