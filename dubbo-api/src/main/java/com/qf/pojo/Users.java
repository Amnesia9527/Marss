package com.qf.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Users implements Serializable {
    int id;
    String name;
    int age;

}
