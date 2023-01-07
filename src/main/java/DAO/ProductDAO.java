package DAO;

import Connect.ConnectDB;
import Model.Company;
import Model.Post;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class ProductDAO {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public static ArrayList<Post> getProduct() {
        ArrayList<Post> posts = new ArrayList<>();
        String query = "SELECT * FROM product ";
        try {
            Statement statement = ConnectDB.getConnect().createStatement();
            PreparedStatement preparedStatement = statement.getConnection().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                posts.add(new Post(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getString(11),
                        resultSet.getFloat(12)
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }




    public static Post getPostById(int id){
        Post post =null;
        try {
            Statement statement = ConnectDB.getConnect().createStatement();
            PreparedStatement preparedStatement = statement.getConnection().prepareStatement("SELECT * FROM product where idpost = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                post = new Post(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getString(11),
                        resultSet.getFloat(12)
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
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getString(11),
                        resultSet.getFloat(12)
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }
    public static int insertProduct(String title, String content,String body,String made, String images,int gear,int idCompany, int year, int status,String fuel,float price) {
        String query = "INSERT INTO product(title,content,body,made,images,gear ,idCompany,yearofmanufacture,status,fuel,price) VALUES (?,?,?,?,?,?,?,?,?,?,?); ";
        try {
            PreparedStatement stmt = ConnectDB.getConnect().prepareStatement(query);
            stmt.setString(1,title);
            stmt.setString(2,content);
            stmt.setString(3,body);
            stmt.setString(4,made);
            stmt.setString(5,images);
            stmt.setInt(6,gear);
            stmt.setInt(7,idCompany);
            stmt.setInt(8,year);
            stmt.setInt(9,status);
            stmt.setString(10,fuel);
            stmt.setFloat(11,price);
            int resultSet = stmt.executeUpdate();
            return resultSet;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static ArrayList<Post> getAllProduct(){
        ArrayList<Post> posts = new ArrayList<>();
        String query = "select * from product ";
        try {
            PreparedStatement stmt = ConnectDB.getConnect().prepareStatement(query);
            ResultSet rs= stmt.executeQuery();

            while (rs.next()){
                posts.add(new Post(rs.getInt("idPost"),rs.getString("title"),rs.getString("content"),rs.getString("body"),rs.getString("made"),rs.getString("images"),rs.getInt("gear"),rs.getInt("idcompany"),rs.getInt("yearofmanufacture"),rs.getInt("status"),rs.getString("fuel"),rs.getFloat("price")));
            }

            return posts;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) throws SQLException {
//        ProductDAO.randomProduct();
    }
}


