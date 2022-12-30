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
    public principalsTitleRepository getFindBOrdering (@RequestParam String st){
        return principalsRepo.findByOrdering(st).orElse(null);
    }

    @GetMapping("getFindBynConst")
    public principalsTitleRepository getFindBynConst (@RequestParam String st){
        return principalsRepo.findBynConst(st).orElse(null);
    }

    @GetMapping("getFindByJob")
    public principalsTitleRepository getFindByJob (@RequestParam String st){
        return principalsRepo.findByJob(st).orElse(null);
    }

    @GetMapping("getFindByCharacters")
    public principalsTitleRepository getFindByCharacters (@RequestParam String st){
        return principalsRepo.findByCharacters(st).orElse(null);
    }
}
