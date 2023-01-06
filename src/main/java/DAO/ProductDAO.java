package DAO;

import Connect.ConnectDB;
import Model.Company;
import Model.Post;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
                        resultSet.getBoolean(4),
                        resultSet.getString(5),
                        resultSet.getBoolean(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getBoolean(9),
                        resultSet.getBoolean(10),
                        resultSet.getString(11),
                        resultSet.getDouble(12)
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }
    public static ArrayList<Post> randomProduct () throws SQLException {
        ArrayList<Post> rs = new ArrayList<>();
        ArrayList<Company> company = CompanyDAO.getCompany();
        String[] arrFuel = {"Xăng", "Dầu"};
        for(int i = 0 ; i < 200 ; i++){
            insertProduct(new Post(i,"Product "+i,"Content "+i, new Random().nextBoolean(),"Image "+ i, new Random().nextBoolean(),  company.get(new Random().nextInt(11)).getId(), new Random().nextInt(10) + 2010 , new Random().nextBoolean(),new Random().nextBoolean(),arrFuel[new Random().nextInt(2)], new Random().nextInt(300) * 1.00));

        }
        return rs;
    }
    public static int insertProduct(Post product) throws SQLException {

        Statement statement = ConnectDB.getConnect().createStatement();
        PreparedStatement preparedStatement = statement.getConnection().prepareStatement("INSERT INTO product (title, content,supporttest, images, covernumber,idcompany,yearofmanufacture,status,gear,fuel,price) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1,product.getTitle());
        preparedStatement.setString(2,product.getContent());
        preparedStatement.setBoolean(3,product.isSupportTest());

        preparedStatement.setString(4,product.getImages());
        preparedStatement.setBoolean(5,product.isCoverNumber());
        preparedStatement.setInt(6,product.getIdCompany());
        preparedStatement.setInt(7,product.getYearOfManuFacture());
        preparedStatement.setBoolean(8,product.isStatus());
        preparedStatement.setBoolean(9,product.isGear());
        preparedStatement.setString(10,product.getFuel());
        preparedStatement.setDouble(11,product.getPrice());

        int rs = preparedStatement.executeUpdate();
        return rs;

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
                        resultSet.getBoolean(4),
                        resultSet.getString(5),
                        resultSet.getBoolean(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getBoolean(9),
                        resultSet.getBoolean(10),
                        resultSet.getString(11),
                        resultSet.getDouble(12)
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


    public static void main(String[] args) throws SQLException {
        ProductDAO.randomProduct();
    }
}