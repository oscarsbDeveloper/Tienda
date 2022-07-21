package com.tienda2.controller;
//Oscar Sanchez Boza

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String index(){
        return "/login";
    }
}
