package com.example.springboot.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/hi")
public class RestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Bridgelabz";
    }

    @GetMapping("/web")
    public String index(){
        return "Homepage";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello good morning"+name;
    }

    @GetMapping("/param/{name}")
    public  String sayHelloParam(@PathVariable String name){
        return "Hello"+ name+ "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello"+user.getFullName()+" "+user.getUsername();
    }
}