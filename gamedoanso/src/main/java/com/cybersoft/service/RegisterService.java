package com.cybersoft.service;

import com.cybersoft.model.UserModel;
import com.cybersoft.repository.RegisterRepository;
import com.cybersoft.repository.UserRepository;

import java.util.List;

public class RegisterService {
    RegisterRepository registerRepository = new RegisterRepository();
    public boolean checkRegister(String username, String password){
        int result = registerRepository.addUserByUsernameAndPassword(username,password);
        return result > 0 ? true : false;
    }
}
