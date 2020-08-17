package com.spring.boot.rest.springrest;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class WelcomeController {

    @RequestMapping(value="/welcome")
   public static String greeting(){
        return "index";
    }
   /* @RequestMapping(value = "/context", method = RequestMethod.GET)
    public String home(HttpServletRequest request) throws IOException {
        System.out.println("Context path" +request.getContextPath());
        return "home";
    }*/
}
