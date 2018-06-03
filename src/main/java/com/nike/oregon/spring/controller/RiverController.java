package com.nike.oregon.spring.controller;



import com.nike.oregon.spring.configuration.PropertyConfig;
import com.nike.oregon.spring.entity.River;
import com.nike.oregon.spring.repository.RiverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Component
@RestController
@RequestMapping("/oregon")
public class RiverController {



    @Autowired
    RiverRepository riverRepository;

    @Autowired
    PropertyConfig  propertyConfig;

    @RequestMapping(value = "/rivers", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity< List<River>> getRivers() {
        List<River> rivers = riverRepository.findAll();
        ResponseEntity< List<River>> riversResponseEntity = new ResponseEntity(rivers, HttpStatus.OK);
        return riversResponseEntity;
    }


    @RequestMapping(value = "/rivers", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<River> createRiver(@RequestBody River river){
        System.out.printf("Invoked");
        //riverRepository.save(river);
        return new ResponseEntity<River>(river, HttpStatus.OK);

    }

}
