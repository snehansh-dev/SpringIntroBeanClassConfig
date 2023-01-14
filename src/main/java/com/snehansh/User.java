package com.snehansh;

import org.springframework.stereotype.Component;

@Component
public class User implements UserInterface {

    @Override
    public void createUserMessage() {
        System.out.println("Hey User!, Welcome to the new world");
    }
}
