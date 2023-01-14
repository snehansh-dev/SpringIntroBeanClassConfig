package com.snehansh;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(scopeName = "prototype") //scope value by default is singleton and can be change to prototype|Request|Session|Global Session
@Getter
@Setter
@ToString
public class User implements UserInterface {
    private String qualification;
    @Override
    public void createUserMessage() {
        System.out.println("Hey User!, Welcome to the new world");
    }
}
