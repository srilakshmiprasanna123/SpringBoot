package com.example.springboot.controller;


import org.springframework.web.bind.annotation.*;
@org.springframework.web.bind.annotation.RestController


    public class RestController {
        @GetMapping("/hello")
        public String sayHello() {
            return "Hello World";
        }

    @GetMapping("/web")
    public String index(){
        return "Homepage";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello good morning"+name;
    }

}
