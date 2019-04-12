package com.hfmoney.generatorservice.controller;

import com.hfmoney.generatorservice.GeneratorService;
import com.hfmoney.generatorservice.NameData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: gaojun
 * @date: 2019/3/29 14:30
 * @description: dcada
 */
@RestController
@RequestMapping("data")
public class DataController {

    @RequestMapping("generator")
    public List<NameData> generator(Integer count){
        if (count == null){
            count = 100;
        }
        return GeneratorService.makeData(count);
    }
}
