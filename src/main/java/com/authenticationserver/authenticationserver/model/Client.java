package com.authenticationserver.authenticationserver.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
    Long id;
    String clientIdName;
    String clientSecret;
    Integer accessTokenValiditySeconds;
    Integer refreshTokenValiditySeconds;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "client_grant_type", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "grant_type_id"))
    Set<AuthorizedGrantType> getAuthorizedGrantTypes;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "client_scope", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "scope_id"))
    Set<Scope> scopes;
    boolean isAutoApprove;
    boolean isScoped;
    boolean isSecretRequired;

    public Client() {
    }

    public Client(Client c){
        this.clientIdName = c.clientIdName;
        this.clientSecret =  c.clientSecret;
        this.accessTokenValiditySeconds =  c.accessTokenValiditySeconds;
        this.refreshTokenValiditySeconds =  c.refreshTokenValiditySeconds;
        this.getAuthorizedGrantTypes =  c.getAuthorizedGrantTypes;
        this.scopes =  c.scopes;
        this.isAutoApprove =  c.isAutoApprove;
        this.isScoped =  c.isScoped;
        this.isSecretRequired =  c.isSecretRequired;
    }

    public Client(String clientIdName, String clientSecret, Integer accessTokenValiditySeconds, Integer refreshTokenValiditySeconds, Set<AuthorizedGrantType> getAuthorizedGrantTypes, Set<Scope> scopes, boolean isAutoApprove, boolean isScoped, boolean isSecretRequired) {
        this.clientIdName = clientIdName;
        this.clientSecret = clientSecret;
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
        this.getAuthorizedGrantTypes = getAuthorizedGrantTypes;
        this.scopes = scopes;
        this.isAutoApprove = isAutoApprove;
        this.isScoped = isScoped;
        this.isSecretRequired = isSecretRequired;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientIdName() {
        return clientIdName;
    }

    public void setClientIdName(String clientIdName) {
        this.clientIdName = clientIdName;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Integer getAccessTokenValiditySeconds() {
        return accessTokenValiditySeconds;
    }

    public void setAccessTokenValiditySeconds(int accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    public Integer getRefreshTokenValiditySeconds() {
        return refreshTokenValiditySeconds;
    }

    public void setRefreshTokenValiditySeconds(int refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    public Set<AuthorizedGrantType> getGetAuthorizedGrantTypes() {
        return getAuthorizedGrantTypes;
    }

    public void setGetAuthorizedGrantTypes(Set<AuthorizedGrantType> getAuthorizedGrantTypes) {
        this.getAuthorizedGrantTypes = getAuthorizedGrantTypes;
    }

    public Set<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(Set<Scope> scopes) {
        this.scopes = scopes;
    }

    public boolean isAutoApprove() {
        return isAutoApprove;
    }

    public void setAutoApprove(boolean autoApprove) {
        isAutoApprove = autoApprove;
    }

    public boolean isScoped() {
        return isScoped;
    }

    public void setScoped(boolean scoped) {
        isScoped = scoped;
    }

    public boolean isSecretRequired() {
        return isSecretRequired;
    }

    public void setSecretRequired(boolean secretRequired) {
        isSecretRequired = secretRequired;
    }
}
