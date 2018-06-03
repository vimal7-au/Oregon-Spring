package com.nike.oregon.spring.entity;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "rivers")
@Component
public class River {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="SEQ_GEN", initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    private long id;

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   /* private String startLocation;
    private String endLocation;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }



    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }*/

}
