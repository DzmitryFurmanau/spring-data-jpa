/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2019. @author Dzmitry Furmanau. All rights reserved.
 */

package com.autoPartsStore.app.repository;

import com.autoPartsStore.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * The interface User repository.
 */
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("SELECT u FROM User u WHERE LOWER(u.name) LIKE LOWER(CONCAT('%',:name))")
//    List<User> findByNameStartsWithParam1(@Param("name") String name);

    /**
     * Find by name starts with param 2 list.
     *
     * @param name the name
     * @return the list
     */
    @Query("SELECT u FROM User u WHERE LOWER(u.name) LIKE LOWER(CONCAT('%',?1))")
    List<User> findByNameStartsWithParam2(String name);

//    List<User> findByNameStartsWith(String name);

    /**
     * Find by name starts with stream.
     *
     * @param name the name
     * @return the stream
     */
    Stream<User> findByNameStartsWith(String name);

//    User findByName(String name);

    /**
     * Find by name optional.
     *
     * @param name the name
     * @return the optional
     */
    Optional<User> findByName(String name);
}
