package Service;

import Connect.ConnectDB;
import Model.Cart;
import Model.Post;
import Model.User;

import java.sql.*;
import java.util.ArrayList;

public class CartService {
    static Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    public  ArrayList<Cart> getAllCartByUser(String username) throws SQLException {
        ArrayList<Cart> carts = new ArrayList<>();
        Connection c = ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("SELECT cart.*, post.title FROM cart, post where cart.username = ? and cart.idpost = post.idpost");
        stmt.setString(1,username);
        ResultSet resultSet = stmt.executeQuery();
        ProductService ps = new ProductService();
        while (resultSet.next()) {
            Cart cart = new Cart();
            cart.setUsername(resultSet.getString(1));
            Post post = ps.getPostById(resultSet.getInt(2));
            cart.setPost(post);
            cart.setAmount( resultSet.getInt(3));
            carts.add(cart);
        }
        return carts;
    }

}
