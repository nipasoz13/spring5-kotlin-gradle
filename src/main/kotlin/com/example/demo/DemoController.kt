package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class Hello(val message: String)

@RestController
class DemoController {
    @GetMapping("/")
    fun hello() = Hello("Hello World !")
}