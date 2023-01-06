package DAO;

import Connect.ConnectDB;
import Model.Cart;
import Model.Order;
import Model.User;

import java.sql.*;
import java.util.ArrayList;

public class OrderDAO {
    static Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    public static int addOrder(Order order) throws SQLException {
        ArrayList<Cart> carts = new ArrayList<>();
        Connection c = ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("INSERT INTO `order` (`id`, `fullName`, `phone`, `address`, `productName`, `quantity`, `total`, `status`, `username`) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?,?)");
        stmt.setString(1, order.getFullName());
        stmt.setString(2, order.getPhone());
        stmt.setString(3, order.getAddress());
        stmt.setString(4,order.getProductName());
        stmt.setInt(5,order.getQuantity());
        stmt.setDouble(6,order.getTotal());
        stmt.setInt(7,order.getStatus());
        stmt.setString(8,order.getUsername());


        int resultSet = stmt.executeUpdate();

        return resultSet;
    }

    public static ArrayList<Order> getOrderByUser(String user) throws SQLException {
        ArrayList<Order> orders = new ArrayList<>();
        Connection c= ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("select * from `order` where username=?");
        stmt.setString(1,user);
        ResultSet rs= stmt.executeQuery();

        while (rs.next()){
            orders.add(new Order(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getInt(7), rs.getDouble(8), rs.getInt(9)));


        }

        return orders;
    }
}
