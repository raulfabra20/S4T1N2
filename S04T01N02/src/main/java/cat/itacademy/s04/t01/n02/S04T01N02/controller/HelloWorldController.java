package cat.itacademy.s04.t01.n02.S04T01N02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String greet(@RequestParam(name = "name", defaultValue = "UNKNOWN") String name){
        return "Hi, "+name+". You're executing a Gradle project.";
    }

    @GetMapping("/HelloWorld2/{name}")
    public String greet2(@PathVariable(name = "name") String name){
        if(name!= null) {
            return "Hi, " + name + ". You're executing a Gradle project.";
        } else {
            return "Hi, you're executing a Maven project.";
        }
    }
}
