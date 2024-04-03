package com.example.schoolmanagement1.model;

import jakarta.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

//@Entity
public class Logindetails implements UserDetails {
    //@Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id")
   // private int id;
    @Id
   @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

   // @Column(name="is_principal")
   // private boolean isPrincipal;

   /* public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /*  public boolean isPrincipal() {
        return isPrincipal;
    }

    public void setPrincipal(boolean principal) {
        isPrincipal = principal;
    }*/

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Return authorities for the user (e.g., roles)
        // You may need to map your roles to Spring Security GrantedAuthorities
        return null;
    }
    @Override
    public boolean isAccountNonExpired() {
        // Implement account expiration logic
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // Implement account locking logic
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // Implement credentials expiration logic
        return true;
    }

    @Override
    public boolean isEnabled() {
        // Implement user enabled/disabled logic
        return true;
    }

    public String getEmail() {
        return email;
    }

    public Logindetails(){

    }
    public Logindetails(String email,String username,String password){
        this.email=email;
        this.username=email;
        this.password=password;


    }
}
