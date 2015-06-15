package com.appjardin.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appjardin.model.Nursery;

@RestController
public class HomeController {
	
	Logger LOG = LoggerFactory.getLogger(HomeController.class);
	
    @RequestMapping("/nurseries")
    public List<Nursery> getNurseries(@RequestParam(value="name", defaultValue="World") String name) {
    	LOG.info("get nurseries ndpoint");
    	
    	List<Nursery> jardines = new ArrayList<Nursery>();
    	
    	jardines.add(new Nursery("Nursery 1"));
    	
        return jardines;
    }
    
}