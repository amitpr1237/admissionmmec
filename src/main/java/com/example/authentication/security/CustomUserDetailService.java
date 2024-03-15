package com.example.authentication.security;

import com.example.authentication.model.user.Admin;
import com.example.authentication.model.user.User;
import com.example.authentication.repo.user.AdminRepo;
import com.example.authentication.repo.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private AdminRepo adminRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // loading user from database by email
        User user = this.userRepo.findByEmail(username);
        if(user == null){
            Admin admin = this.adminRepo.findByEmail(username);
            return admin;
        }
        return user;
    }
}
