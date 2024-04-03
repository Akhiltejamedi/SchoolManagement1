package com.example.schoolmanagement1.repository;

import com.example.schoolmanagement1.model.Logindetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface LogindetailsRepository  {
    ArrayList<Logindetails> getLogindetails();
}
