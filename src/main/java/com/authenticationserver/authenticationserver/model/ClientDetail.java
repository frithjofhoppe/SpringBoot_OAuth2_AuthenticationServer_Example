package com.authenticationserver.authenticationserver.model;

import javassist.compiler.ast.ASTree;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ClientDetail extends Client implements ClientDetails {

   public ClientDetail(Client c){
        super(c);
    }

    @Override
    public String getClientId() {
        return super.getClientIdName();
    }

    @Override
    public Set<String> getResourceIds() {
        return null;
    }

    @Override
    public boolean isSecretRequired() {
        return super.isSecretRequired();
    }

    @Override
    public String getClientSecret() {
        return super.getClientSecret();
    }

    @Override
    public boolean isScoped() {
        return super.isScoped();
    }

    @Override
    public Set<String> getScope() {
        return super.getScopes().stream().map(x -> x.getIdentifier()).collect(Collectors.toSet());
    }

    @Override
    public Set<String> getAuthorizedGrantTypes() {
        Set<String> temp = new HashSet<>();
        temp.add("implicit");
        return temp;
    }

    @Override
    public Set<String> getRegisteredRedirectUri() {
        return null;
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return super.getGetAuthorizedGrantTypes().stream().map(x -> new SimpleGrantedAuthority("ROLE_" + x.getIdentifier())).collect(Collectors.toList());
    }

    @Override
    public Integer getAccessTokenValiditySeconds() {
        return super.getAccessTokenValiditySeconds();
    }

    @Override
    public Integer getRefreshTokenValiditySeconds() {
        return super.getRefreshTokenValiditySeconds();
    }

    @Override
    public boolean isAutoApprove(String s) {
        return super.isAutoApprove();
    }

    @Override
    public Map<String, Object> getAdditionalInformation() {
        return null;
    }
}
