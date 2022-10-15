package com.cybersoft.service;

import com.cybersoft.model.UserModel;
import com.cybersoft.repository.UserRepository;

import java.util.List;

public class LoginService {
    UserRepository usersRepository = new UserRepository();

    public boolean checkLogin(String username, String password){
        List<UserModel> list = usersRepository.getAccountByUsernameAndPassword(username, password);

        if (list.size()>0){
            return true;
        }else {
            return false;
        }
    }
}
