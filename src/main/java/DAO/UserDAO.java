package DAO;
import Connect.ConnectDB;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
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
        String address = rs.getString("address");
        return new User(userName, null, fullName, email, phone, avatar,address);
    }
    public static boolean checkUser(String username, String email) throws SQLException, ClassNotFoundException {
        Connection c=ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("select * from user where username=? or email=?");
        stmt.setString(1,username);
        stmt.setString(2,email);
        ResultSet rs= stmt.executeQuery();
        return rs.next();
    }
    public static int insertUser(String name, String pass, String fullname, String email, String phone, String address, String avatar ) throws SQLException, ClassNotFoundException {
        Connection c=ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("insert into user value(?,?,?,?,?,?,?,?)");
        stmt.setString(1,name);
        stmt.setString(2,pass);
        stmt.setString(3,fullname);
        stmt.setString(4,email);
        stmt.setString(5,phone);
        stmt.setString(6,avatar);
        stmt.setInt(7,0);
        stmt.setString(8,address);
        int rs= stmt.executeUpdate();
        return rs;
    }
    public static int updateUser(String username, String fullname, String email, String phone, String address) throws SQLException, ClassNotFoundException {
        Connection c=ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("UPDATE user\n" +
                "SET  fullname = ?,email = ?, phone = ?, address = ?\n" +
                "WHERE username = ?");

        stmt.setString(1,fullname);
        stmt.setString(2,email);
        stmt.setString(3,phone);
        stmt.setString(4,address);
        stmt.setString(5,username);
        int rs= stmt.executeUpdate();
        return rs;
    }

    public static int updateUser(String username, String pass, String fullname, String email, String phone, String address) throws SQLException, ClassNotFoundException {
        Connection c=ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("UPDATE user\n" +
                "SET password = ?, fullname = ?,email = ?, phone = ?, address = ?\n" +
                "WHERE username = ?");
        stmt.setString(1,pass);
        stmt.setString(2,fullname);
        stmt.setString(3,email);
        stmt.setString(4,phone);
        stmt.setString(5,address);
        stmt.setString(6,username);
        int rs= stmt.executeUpdate();
        return rs;
    }
    public static boolean checkAdmin(String name) throws SQLException {
        Connection c=ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("select * from user where username=?");
        stmt.setString(1,name);
        ResultSet rs= stmt.executeQuery();
        if(rs.next()&&rs.getInt("iAdmin")!=1){
            return true;
        }
        return false;

    }

    public static void main(String[] args) throws SQLException {
        System.out.println(checkAdmin("hau"));
    }
}
