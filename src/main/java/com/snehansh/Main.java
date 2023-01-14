package com.snehansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        User user = context.getBean(User.class);
        user.createUserMessage();
        Staff staff = context.getBean(Staff.class);
        staff.createUserMessage();
    }
}