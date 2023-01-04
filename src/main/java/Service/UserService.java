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
        System.out.println(rs.getRow());
        rs.next();
        String userName=rs.getString("username");
        String fullName=rs.getString("fullname");
        String email=rs.getString("email");
        String phone = rs.getString("phone");
        String avatar = rs.getString("avatar");
        return new User(userName, null, fullName, email, phone, avatar);
    }
    public static boolean checkUser(String username, String email) throws SQLException, ClassNotFoundException {
        Connection c=ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("select * from user where username=? or email=?");
        stmt.setString(1,username);
        stmt.setString(2,email);
        ResultSet rs= stmt.executeQuery();
        return rs.next();
    }

    public static int insertUser(String name, String pass, String fullname, String email, String phone, String avatar ) throws SQLException, ClassNotFoundException {
        Connection c=ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("insert into user value(?,?,?,?,?,?,?)");
        stmt.setString(1,name);
        stmt.setString(2,pass);
        stmt.setString(3,fullname);
        stmt.setString(4,email);
        stmt.setString(5,phone);
        stmt.setString(6,avatar);
        stmt.setInt(7,0);
        int rs= stmt.executeUpdate();
        return rs;
    }
    public static boolean checkAdmin(String name) throws SQLException {
        Connection c=ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("select * from user where username=?");
        stmt.setString(1,name);
        ResultSet rs= stmt.executeQuery();
        if(rs.next()&&rs.getInt("iAdmin")!=0){
            return true;
        }
        return false;

    }

    public static void main(String[] args) throws SQLException {
        System.out.println(checkAdmin("hau"));
    }
}
