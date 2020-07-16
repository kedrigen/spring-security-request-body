package com.examle.sercurity.requestbody.demo.security;

import org.springframework.stereotype.Service;

@Service
public class SecurityChecker {
    public boolean check(Foo foo) {
        return foo != null;
    }
}
