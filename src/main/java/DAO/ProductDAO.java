package DAO;

import Connect.ConnectDB;
import Model.Company;
import Model.Post;

import java.sql.*;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Random;
=======
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116

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
<<<<<<< HEAD
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getString(11),
                        resultSet.getFloat(12)
=======
                        resultSet.getBoolean(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getBoolean(10),
                        resultSet.getString(11),
                        resultSet.getDouble(12)
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }
<<<<<<< HEAD



    public static int insertProduct(Post product) throws SQLException {

        Statement statement = ConnectDB.getConnect().createStatement();
        PreparedStatement preparedStatement = statement.getConnection().prepareStatement("INSERT INTO product (title, content,supporttest, images, covernumber,idcompany,yearofmanufacture,status,gear,fuel,price) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1,product.getTitle());
        preparedStatement.setString(2,product.getContent());
        preparedStatement.setString(3,product.getBody());

        preparedStatement.setString(4,product.getMade());
        preparedStatement.setString(5,product.getImages());
        preparedStatement.setInt(6,product.getCoverNumber());
        preparedStatement.setInt(7,product.getIdCompany());
        preparedStatement.setInt(8,product.getYearOfManuFacture());
        preparedStatement.setInt(9,product.getStatus());
        preparedStatement.setString(10,product.getFuel());
        preparedStatement.setDouble(11,product.getPrice());

        int rs = preparedStatement.executeUpdate();
        return rs;

    }

=======
//        public static ArrayList<Post> randomProduct () throws SQLException {
//        ArrayList<Post> rs = new ArrayList<>();
//        ArrayList<Company> company = CompanyDAO.getCompany();
//        String[] arrFuel = {"Xăng", "Dầu"};
//        for(int i = 0 ; i < 200 ; i++){
//            insertProduct(new Post(i,"Product "+i,"Content "+i, new Random().nextBoolean(),"Image "+ i, new Random().nextBoolean(),  company.get(new Random().nextInt(11)).getId(), new Random().nextInt(10) + 2010 , new Random().nextBoolean(),new Random().nextBoolean(),arrFuel[new Random().nextInt(2)], new Random().nextInt(300) * 1.00));
//
//        }
//        return rs;
//    }
//    public static int insertProduct(Post product) throws SQLException {
//
//        Statement statement = ConnectDB.getConnect().createStatement();
//        PreparedStatement preparedStatement = statement.getConnection().prepareStatement("INSERT INTO product (title, content,supporttest, images, covernumber,idcompany,yearofmanufacture,status,gear,fuel,price) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
//        preparedStatement.setString(1,product.getTitle());
//        preparedStatement.setString(2,product.getContent());
//        preparedStatement.setString(3,product.getBody());
//
//        preparedStatement.setString(4,product.getMade());
//        preparedStatement.setString(5,product.getImages());
//        preparedStatement.setBoolean(6,product.isCoverNumber());
//        preparedStatement.setInt(7,product.getIdCompany());
//        preparedStatement.setInt(8,product.getYearOfManuFacture());
//        preparedStatement.setBoolean(9,product.isStatus());
//        preparedStatement.setString(10,product.getFuel());
//        preparedStatement.setDouble(11,product.getPrice());
//
//        int rs = preparedStatement.executeUpdate();
//        return rs;
//
//    }
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
    public static Post getPostById(int id){
        Post post =null;
        try {
            Statement statement = ConnectDB.getConnect().createStatement();
            PreparedStatement preparedStatement = statement.getConnection().prepareStatement("SELECT * FROM product where idpost = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
<<<<<<< HEAD

=======
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
            while (resultSet.next()) {
                post = new Post(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
<<<<<<< HEAD
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getString(11),
                        resultSet.getFloat(12)
=======
                        resultSet.getBoolean(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getBoolean(10),
                        resultSet.getString(11),
                        resultSet.getDouble(12)
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
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
<<<<<<< HEAD
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getInt(10),
                        resultSet.getString(11),
                        resultSet.getFloat(12)
=======
                        resultSet.getBoolean(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getBoolean(10),
                        resultSet.getString(11),
                        resultSet.getDouble(12)
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }
    public static int insertProduct(String title, String content,String body,String made, String images,int coverNumber,int idCompany, int year, int status,String fuel,float price,String gear) {
        ArrayList<Post> posts = new ArrayList<>();
        String query = "INSERT INTO product(title,content,body,made,images,coverNumber ,idCompany,yearofmanufacture,status,fuel,price,gear) VALUES (?,?,?,?,?,?,?,?,?,?,?,?); ";
        try {
            PreparedStatement stmt = ConnectDB.getConnect().prepareStatement(query);
            stmt.setString(1,title);
            stmt.setString(2,content);
            stmt.setString(3,body);
            stmt.setString(4,made);
            stmt.setString(5,images);
            stmt.setInt(6,coverNumber);
            stmt.setInt(7,idCompany);
            stmt.setInt(8,year);
            stmt.setInt(9,status);
            stmt.setString(10,fuel);
            stmt.setFloat(11,price);
            stmt.setString(12,gear);
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
                posts.add(new Post(rs.getInt("idPost"),rs.getString("title"),rs.getString("content"),rs.getString("body"),rs.getString("made"),rs.getString("images"),rs.getInt("covernumber"),rs.getInt("idcompany"),rs.getInt("yearofmanufacture"),rs.getInt("status"),rs.getString("fuel"),rs.getFloat("price"),rs.getString("gear")));
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


