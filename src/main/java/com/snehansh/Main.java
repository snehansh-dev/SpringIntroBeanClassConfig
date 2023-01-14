package com.snehansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        User user = context.getBean(User.class);
        user.setQualification("Graduate");
        user.createUserMessage();
        System.out.println(user.toString());
        User user1 = context.getBean(User.class);
        user1.createUserMessage();
        System.out.println(user1.toString());
        Staff staff = context.getBean(Staff.class);
        staff.createUserMessage();
    }
}