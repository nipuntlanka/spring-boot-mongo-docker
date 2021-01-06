package com.mt.springmongo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/starlink/")
public class RestApis {

    @RequestMapping(value = "testget", method = RequestMethod.GET)
    public String testget(){
        return "Hello";
    }
}
