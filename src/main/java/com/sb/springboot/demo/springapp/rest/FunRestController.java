package com.sb.springboot.demo.springapp.rest;

import com.sb.springboot.demo.springapp.classes.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class FunRestController {

    // add code fror "/hell" endpoint
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World !!!";
    }
}
