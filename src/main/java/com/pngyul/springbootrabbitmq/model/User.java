package com.pngyul.springbootrabbitmq.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String name;
    private String pass;
}
