package com.huluwa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/wash")
public class WashDishesController {



    @GetMapping("/who")
    public String getWhoWash(){
        List<Map<String, String>>  queue = new LinkedList<>();


        return  null;
    }

}
