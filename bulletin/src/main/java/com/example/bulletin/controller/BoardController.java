package com.example.bulletin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boards/**") // /board/로 접근하는 url의 처리를 BoardController에서 맡음을 명시
public class BoardController {

    @GetMapping("/exmpl")
    public String Exmpl(){
        return "/boards/exmpl";
    }
}
