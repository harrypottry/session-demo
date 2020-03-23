package com.test.session;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author harrypotter
 */

@RestController
public class IndexController {


    @GetMapping("/index")
    public String index(HttpServletRequest request){
        request.getSession().setAttribute("Mic","value");
        return "success";
    }


    @GetMapping("/getValue")
    public String getValue(HttpServletRequest request){
        String str=(String)request.getSession().getAttribute("Mic");
        return str;
    }

}
