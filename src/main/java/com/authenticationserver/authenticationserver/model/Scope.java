package com.authenticationserver.authenticationserver.model;

import javax.persistence.*;

@Entity
public class Scope {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "scope_id")
    long id;
    String identifier;

    public Scope() {
    }

    public Scope(String identifier) {
        this.identifier = identifier;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
