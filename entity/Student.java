package com.poly.demo01.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String id;
    public String name;
    public int age;
    public String hometown;
    public  String classes;
    public String address;
}
