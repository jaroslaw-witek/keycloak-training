package jw.training.spring.springappkeycloaktest.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectiveEndpointsController {

//    @GetMapping("/api/hello")
//    public String getHelloMessage(){
//        return "Hello!";
//    }
//
//    @PostMapping("/api/hello")
//    public String postHelloMessage(){
//        return "Hello! posted";
//    }
//
//    @GetMapping("/api/secured/hello")
//    public String getSecuredHelloMessage(){
//        return "Secured Hello!";
//    }

    @GetMapping("/user")
    @Secured("ROLE_USER")
    public String user() {
        return "user zone!";
    }
    @PostMapping("/user")
    public String userPost() {
        return "user zone with post";
    }
    @GetMapping("/admin")
    public String admin() {
        return "admin zone!";
    }
    @GetMapping("/test")
    public String test() {
        return "test!!!";
    }
}
