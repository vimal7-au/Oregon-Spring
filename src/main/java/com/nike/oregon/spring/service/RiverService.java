package com.nike.oregon.spring.service;

import com.nike.oregon.spring.entity.River;
import com.nike.oregon.spring.repository.RiverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("RiverService")
public class RiverService {


   // @Autowired
   // RiverRepository riverRepository;

    public List<River> getRivers() {
        List<River> rivers = new ArrayList<>();

        River tualatinRiver = new River();
        //tualatinRiver.setName("Tualatin");
        //tualatinRiver.setLength(100000);

        rivers.add(tualatinRiver);

        return rivers;
    }

    public void saveRiver() {
        River river = new River();
        river.setName("Tualatin");
        //riverRepository.save(river);
    }


}
