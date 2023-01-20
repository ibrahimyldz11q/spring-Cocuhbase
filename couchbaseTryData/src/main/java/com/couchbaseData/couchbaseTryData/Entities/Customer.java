package com.couchbaseData.couchbaseTryData.Entities;

import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;


@Document
@EqualsAndHashCode
public class Customer {
    @Id
    Integer id;
    String name;
    String lname;

    public Customer(Integer id, String name, String lname) {
        this.id = id;
        this.name = name;
        this.lname = lname;
    }

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
