package com.examle.sercurity.requestbody.demo.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
    @RequestMapping("/foo")
    public String foo(Foo foo) {
        return foo.getBar();
    }
}
