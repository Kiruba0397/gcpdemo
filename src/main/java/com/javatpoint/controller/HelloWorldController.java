package com.javatpoint.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@GetMapping("/boot")
public String hello() 
{
return "Hello javaTpoint";
}
}
