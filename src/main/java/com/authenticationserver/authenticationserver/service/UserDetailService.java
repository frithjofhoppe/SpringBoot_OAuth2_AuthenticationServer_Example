package com.authenticationserver.authenticationserver.service;

import com.authenticationserver.authenticationserver.model.User;
import com.authenticationserver.authenticationserver.model.UserDetail;
import com.authenticationserver.authenticationserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User u = userRepository.findUserByUsername(s);
        if(u == null){
            throw new UsernameNotFoundException("User with the credentias could not be found");
        }
        return new UserDetail(u);
    }
}
