package com.cybersoft.repository;

import com.cybersoft.config.MySqlConnection;
import com.cybersoft.model.UserModel;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegisterRepository {

    public int addUserByUsernameAndPassword(String username, String password) {
        int result = 0;
        try {
            String query = "insert into account(username, password) values (?,?)";
            Connection connection = MySqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            result = preparedStatement.executeUpdate();

            connection.close();

        } catch (SQLException e) {
            System.out.println("Error AddUsersByEmailAndPassword" + e.getMessage());

        }
        return result;
    }

}


