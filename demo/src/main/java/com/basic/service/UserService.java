package com.basic.service;

import org.apache.catalina.User;

import java.util.List;

public interface UserService {


    //create
    User createData(User user);
    //read all Data
    List<User>getAllData();
    //read By Id data
    User byIdData(Long Id);
    //Update

    //delete

}
