package com.example.authentication.service.user;

import com.example.authentication.exception.ResourceNotFoundException;
import com.example.authentication.model.user.Admin;
import com.example.authentication.model.user.User;
import com.example.authentication.repo.user.AdminRepo;
import com.example.authentication.repo.user.UserRepo;
import com.example.authentication.service.mail.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminService {

    @Autowired
    private AdminRepo userRepo;

    @Autowired
    private EmailServiceImpl emailService;

    public Admin save(Admin user){
        return userRepo.save(user);
    }

    public String sendOtp(String email){
        return emailService.sendOtp(email);
    }

    public Admin findByEmail(String email){
        return userRepo.findByEmail(email);
    }

    public Admin findById(Long id){
        return userRepo
                .findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("user with given id is not found"));
    }

}
