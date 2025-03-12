package boot.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {


    @GetMapping(value="/helloWorld")
    public String helloWorld(){
        System.out.println("LOG: HelloWorld");
        return "Hello World";
    }

}
