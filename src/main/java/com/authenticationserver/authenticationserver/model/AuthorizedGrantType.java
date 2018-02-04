package com.authenticationserver.authenticationserver.model;

import javax.persistence.*;

@Entity
@Table(name = "authorizedGrantType")
public class AuthorizedGrantType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "grant_type_id")
    long id;
    String identifier;

    public AuthorizedGrantType() {
    }

    public AuthorizedGrantType(String identifier) {
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
