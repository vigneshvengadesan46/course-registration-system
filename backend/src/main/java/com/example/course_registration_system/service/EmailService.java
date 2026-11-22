package com.example.course_registration_system.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender mailSender;

    @Async
    public void sendVerificationEmail(String to, String otp) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(to);
            message.setSubject("Course Registration - Email Verification");

            message.setText(
                    "Hello,\n\n" +
                            "Your email verification OTP is: " + otp + "\n\n" +
                            "This OTP will expire in 10 minutes.\n\n" +
                            "Please do not share this OTP with anyone."
            );

            mailSender.send(message);
        } catch (Exception e) {
            logger.error("Failed to send verification email to {}: {}", to, e.getMessage());
        }
    }

    @Async
    public void sendRegistrationConfirmation(
            String to,
            String courseName) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(to);

            message.setSubject("Course Registration Successful");

            message.setText(
                    "Hello,\n\n" +
                            "Your course registration was successful.\n\n" +
                            "Course: " + courseName + "\n\n" +
                            "You have been successfully registered for this course.\n\n" +
                            "Thank you."
            );

            mailSender.send(message);
        } catch (Exception e) {
            logger.error("Failed to send registration confirmation to {}: {}", to, e.getMessage());
        }
    }

    @Async
    public void sendCourseDropEmail(
            String to,
            String courseName) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(to);

            message.setSubject("Course Dropped Successfully");

            message.setText(
                    "Hello,\n\n" +
                            "Your course has been dropped successfully.\n\n" +
                            "Course: " + courseName + "\n\n" +
                            "You are no longer registered for this course.\n\n" +
                            "Thank you."
            );

            mailSender.send(message);
        } catch (Exception e) {
            logger.error("Failed to send course drop email to {}: {}", to, e.getMessage());
        }
    }

    @Async
    public void sendAdminRegistrationNotification(
            String adminEmail,
            String studentName,
            String studentEmail,
            String courseName) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(adminEmail);

            message.setSubject("New Course Registration");

            message.setText(
                    "Hello Admin,\n\n" +
                            "A new student has registered for a course.\n\n" +
                            "Student Name: " + studentName + "\n" +
                            "Student Email: " + studentEmail + "\n" +
                            "Course: " + courseName + "\n\n" +
                            "Please check the registration system for more details."
            );

            mailSender.send(message);
        } catch (Exception e) {
            logger.error("Failed to send admin notification to {}: {}", adminEmail, e.getMessage());
        }
    }
}