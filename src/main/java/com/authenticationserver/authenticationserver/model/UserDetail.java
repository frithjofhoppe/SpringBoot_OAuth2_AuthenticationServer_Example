package com.authenticationserver.authenticationserver.model;

import com.authenticationserver.authenticationserver.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import sun.java2d.pipe.SpanShapeRenderer;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserDetail extends User implements UserDetails {

    public UserDetail(User u){
        super(u);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
      return getRoles().stream().map(role -> new SimpleGrantedAuthority("ROLE_" + role.getIdentifier())).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return super.isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return super.isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return super.isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled;
    }
}
