package com.example.demo;

import java.util.UUID;

public class Student {

    private final String id;
    private String name;
    public Student(String id, String name){
        this.id=id;
        this.name=name;
    }
    public Student(String name){
        this(UUID.randomUUID().toString(),name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
