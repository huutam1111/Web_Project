package DAO;

import Connect.ConnectDB;
import Model.Cart;
import Model.Order;

import java.sql.*;
import java.util.ArrayList;

public class OrderDAO {
    static Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    public static int addOrder(Order order) throws SQLException {
        ArrayList<Cart> carts = new ArrayList<>();
        Connection c = ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("INSERT INTO `order` (`id`, `fullName`, `phone`, `address`, `productName`, `quantity`, `total`, `status`) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?)");
        stmt.setString(1, order.getFullName());
        stmt.setString(2, order.getPhone());
        stmt.setString(3, order.getAddress());
        stmt.setString(4,order.getProductName());
        stmt.setInt(5,order.getQuantity());
        stmt.setDouble(6,order.getTotal());
        stmt.setInt(7,order.getStatus());


        int resultSet = stmt.executeUpdate();

        return resultSet;
    }
}
