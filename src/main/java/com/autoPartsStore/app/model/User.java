package com.autoPartsStore.app.model;

import lombok.Data;

import javax.persistence.*;

/**
 * The type User.
 */
@Data
@Table(name = "user", schema = "public")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
