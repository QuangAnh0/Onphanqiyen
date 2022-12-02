package com.example.ontapphanquyen.controller;

import com.example.ontapphanquyen.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.soap.SOAPBinding;

//@Controller
@RestController
@CrossOrigin("*")
public class LoginController {

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/user")
    public String get(){
        User user=new User();
        user.getUsername();
        return null;
    }

    public static void main(String[] args) {
        User user=new User();
        System.out.println(user.number);
    }
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String admin(){
        return "Admin day";
    }
//
//    @GetMapping("/user")
//    public ModelAndView user(User user) {
//        // Get authenticated user name from Principal
//        System.out.println(user.getUsername());
//        return new ModelAndView("/user");
//    }
//
//    @GetMapping("/admin")
//    public ModelAndView admin() {
//        // Get authenticated user name from SecurityContext
//        SecurityContext context = SecurityContextHolder.getContext();
//        System.out.println(context.getAuthentication().getName());
//        return new ModelAndView("/admin");
//    }
}
