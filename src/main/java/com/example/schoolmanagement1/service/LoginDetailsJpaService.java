package com.example.schoolmanagement1.service;


import com.example.schoolmanagement1.model.Logindetails;
import com.example.schoolmanagement1.repository.LogindetailsJpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginDetailsJpaService implements UserDetailsService {

    private final LogindetailsJpaRepository logindetailsJpaRepository;

    public LoginDetailsJpaService(LogindetailsJpaRepository logindetailsJpaRepository) {
        this.logindetailsJpaRepository = logindetailsJpaRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Logindetails logindetails = logindetailsJpaRepository.findByEmail(email);
        if (logindetails == null) {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }
        return logindetails;
    }
    public void saveLogindetails(Logindetails loginDetails) {
        logindetailsJpaRepository.save(loginDetails);
    }
    public Logindetails findByEmail(String email){
        return logindetailsJpaRepository.findByEmail(email);
    }

}
