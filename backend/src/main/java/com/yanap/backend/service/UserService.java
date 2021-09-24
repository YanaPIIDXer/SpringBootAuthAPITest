package com.yanap.backend.service;

import com.yanap.backend.auth.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    private User user = new User();

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        if (!user.getUsername().equals(name)) { throw new UsernameNotFoundException("Error"); }
        return user;
    }
    
}
