package Service;

import Connect.ConnectDB;
import Model.Post;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public ArrayList<Post> getProduct() {
        ArrayList<Post> posts = new ArrayList<>();
        String query = "SELECT * FROM post";
        try {
            statement = ConnectDB.getConnect().createStatement();
            preparedStatement = statement.getConnection().prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                posts.add(new Post(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getBoolean(5),
                        resultSet.getString(6),
                        resultSet.getBoolean(7),
                        resultSet.getString(8),
                        resultSet.getInt(9),
                        resultSet.getBoolean(10),
                        resultSet.getBoolean(11),
                        resultSet.getString(12),
                        resultSet.getDouble(13)
                        ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }


    public Post getPostById(int id){
        Post post =null;
        try {
            statement = ConnectDB.getConnect().createStatement();
            preparedStatement = statement.getConnection().prepareStatement("SELECT * FROM post where idpost = ?");
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                post = new Post(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getBoolean(5),
                        resultSet.getString(6),
                        resultSet.getBoolean(7),
                        resultSet.getString(8),
                        resultSet.getInt(9),
                        resultSet.getBoolean(10),
                        resultSet.getBoolean(11),
                        resultSet.getString(12),
                        resultSet.getDouble(13)
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(post.toString());
        return post;
    }
    public ArrayList<Post> getPostUnComfirm() {
        ArrayList<Post> posts = new ArrayList<>();
        String query = "SELECT * FROM post where Comfirm=0";
        try {
            statement = ConnectDB.getConnect().createStatement();
            preparedStatement = statement.getConnection().prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                posts.add(new Post(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getBoolean(5),
                        resultSet.getString(6),
                        resultSet.getBoolean(7),
                        resultSet.getString(8),
                        resultSet.getInt(9),
                        resultSet.getBoolean(10),
                        resultSet.getBoolean(11),
                        resultSet.getString(12),
                        resultSet.getDouble(13)
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }



}
