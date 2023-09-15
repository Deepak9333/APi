package com.basic.controller;

import com.basic.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;


    //@RequestMapping(path="/add",method=RequestMethod.POST)
    //Add Data in Database
    @PostMapping("/add")
    public User addData(@RequestBody User user){
        return userService.createData(user);
    }

    //@RequestMapping(path="/add",method=RequestMethod.GET)
    //Get or Read All Data in Database
    @GetMapping("/all")
    public List<User>getAllData(){
        return userService.getAllData();
    }

    //@RequestMapping(path="/add",method=RequestMethod.GET)
    //Get Data By Id
    @GetMapping("/ById")
    public User dataById(@PathVariable Long Id){
        return userService.byIdData(Id);
    }
}
