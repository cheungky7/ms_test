package com.mytest.swagger_ui_1.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
    private Long id;
    private String firstName;
    private int age;
    private String email;


}
