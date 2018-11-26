package com.nf147.contact.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class CORSController {
    @RequestMapping("/aaa")
    public String cors (@RequestParam(defaultValue = "callback") String callback, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "http://169.254.168.126:8080");
        return  "woshiyiduanzifuchuan";
    }
    @RequestMapping("/rrr")
    public String rrr (@RequestParam(defaultValue = "callback") String callback) {
        return callback + "('rrr')";
    }

}
