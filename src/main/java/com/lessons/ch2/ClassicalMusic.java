package com.lessons.ch2;

import org.springframework.stereotype.Component;

@Component("classicalBean")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
