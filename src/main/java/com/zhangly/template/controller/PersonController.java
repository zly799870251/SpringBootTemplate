package com.zhangly.template.controller;

import com.zhangly.template.model.Person;
import com.zhangly.template.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 青葉 on 2017/4/19.
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Resource
    private PersonService personService;

    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        List<Person> all = personService.findAll();
        return all.get(0).getName();
    }

}
