package Service;

import Connect.ConnectDB;
import Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
    public static boolean checkLogin(String username, String pass) throws SQLException {
        Connection c= ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("select * from user where username=? and password=?");
        stmt.setString(1,username);
        stmt.setString(2,pass);
        ResultSet rs= stmt.executeQuery();
        return rs.next();
    }
    public static User getUserByName(String name) throws SQLException {
        Connection c= ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("select * from user where username=?");
        stmt.setString(1,name);
        ResultSet rs= stmt.executeQuery();
        rs.next();
        String userName=rs.getString("username");
        String fullName=rs.getString("fullname");
        String email=rs.getString("email");
        String phone = rs.getString("phone");
        String avatar = rs.getString("avatar");
        return new User(userName, null, fullName, email, phone, avatar);
    }
}
