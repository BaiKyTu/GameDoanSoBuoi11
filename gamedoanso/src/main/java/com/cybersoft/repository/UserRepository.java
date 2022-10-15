package com.cybersoft.repository;

import com.cybersoft.config.MySqlConnection;
import com.cybersoft.model.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<UserModel> getAccountByUsernameAndPassword(String username, String password) {
        List<UserModel> list = new ArrayList<>();

        try {
            String query = "select * from account a where a.username = ? and a.password = ?";
            Connection connection = MySqlConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                UserModel userModel = new UserModel();
                userModel.setUsername(resultSet.getString("username"));
                userModel.setPassword(resultSet.getString("password"));

                list.add(userModel);
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error get user by username and password" + e.getMessage());
        }
        return list;
    }

}
