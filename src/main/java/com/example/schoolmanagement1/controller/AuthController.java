package com.example.schoolmanagement1.controller;
import com.example.schoolmanagement1.model.Logindetails;
import com.example.schoolmanagement1.service.LoginDetailsJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final LoginDetailsJpaService loginDetailsJpaService;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AuthController(LoginDetailsJpaService loginDetailsJpaService, PasswordEncoder passwordEncoder) {
        this.loginDetailsJpaService = loginDetailsJpaService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/logindetails")
    public ResponseEntity<?> createLoginDetails(@RequestBody Logindetails loginDetails) {
        // Encode password before saving
        loginDetails.setPassword(passwordEncoder.encode(loginDetails.getPassword()));

        // Save user details to the database
        loginDetailsJpaService.saveLogindetails(loginDetails);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Logindetails user) {
        Logindetails existingUser = loginDetailsJpaService.findByEmail(user.getEmail());
        if (existingUser != null && passwordEncoder.matches(user.getPassword(), existingUser.getPassword())) {
            // Authentication successful
            return ResponseEntity.ok().build();
        } else {
            // Authentication failed
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}


