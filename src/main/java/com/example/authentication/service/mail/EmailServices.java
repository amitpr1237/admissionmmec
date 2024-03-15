package com.example.authentication.service.mail;

public interface EmailServices {
    // Method
    // To send a simple email
    public String sendSimpleMail(EmailDetails details);
 
    // Method
    // To send an email with attachment
    public String sendMailWithAttachment(EmailDetails details);
}
