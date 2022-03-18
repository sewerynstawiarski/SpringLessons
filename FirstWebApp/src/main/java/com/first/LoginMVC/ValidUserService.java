package com.first.LoginMVC;


import org.springframework.stereotype.Service;

@Service
public class ValidUserService {
    public boolean isUserValid(String user, String password) {
        if (user.equals("Seweryn") && password.equals("lalala")){
            return true;
        }
        return false;
    }
}
