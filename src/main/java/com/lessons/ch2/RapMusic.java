package com.lessons.ch2;

import org.springframework.stereotype.Component;

@Component("rapBean")
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Without me";
    }
}
