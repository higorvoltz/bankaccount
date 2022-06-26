package com.example.bankaccount.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class HelloControler {

    @GetMapping("/")
    fun hello(): String{
        return "hello kotlin"
    }
}