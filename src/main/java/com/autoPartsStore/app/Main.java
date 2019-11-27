/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2019. @author Dzmitry Furmanau. All rights reserved.
 */

package com.autoPartsStore.app;

import com.autoPartsStore.app.config.AppConfiguration;
import com.autoPartsStore.app.model.User;
import com.autoPartsStore.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * The type Main.
 */
@Component
public class Main {

    @Autowired
    private UserRepository userRepository;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotatedClassApplicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Main main = annotatedClassApplicationContext.getBean("main", Main.class);
        Optional<User> one = main.getUserRepository().findById(1L);
        one.ifPresent(System.out::println);
//
//        one.ifPresent(main.getUserRepository()::delete);
//        one = main.getUserRepository().findById(1L);
//        System.out.println(one.isPresent());
//
//        User user = new User();
//        user.setName("TESTA");
//        main.getUserRepository().save(user);
//        Optional<User> three = main.getUserRepository().findById(3L);
//        three.ifPresent(System.out::println);
//
//        user.setName("TESTB");
//        main.getUserRepository().saveAndFlush(user);
//        three = main.getUserRepository().findById(3L);
//        three.ifPresent(System.out::println);
    }

    /**
     * Gets user repository.
     *
     * @return the user repository
     */
    public UserRepository getUserRepository() {
        return userRepository;
    }

    /**
     * Sets user repository.
     *
     * @param userRepository the user repository
     */
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}