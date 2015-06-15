package com.appjardin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appjardin.model.Jardin;

@RestController
public class HomeController {
	
	Logger LOG = LoggerFactory.getLogger(HomeController.class);
	
    @RequestMapping("/jardin")
    public Jardin getJardin(@RequestParam(value="name", defaultValue="World") String name) {
    	LOG.info("get jardin endpoint");
        return new Jardin("Algun Jardin");
    }
    
}