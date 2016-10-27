package com.example.db;

import javax.persistence.*;

/**
 * Created by linfar on 26.10.16.
 */
@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;

    public Registration() {
    }

    public Registration(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
