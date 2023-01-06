package DAO;

import Connect.ConnectDB;
import Model.Cart;
import Model.Company;
import Model.Order;
import Model.Post;

import java.sql.*;
import java.util.ArrayList;

public class CompanyDAO {
    static Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    public static ArrayList<Company> getCompany() throws SQLException {
        ArrayList<Company> rs = new ArrayList<>();
        Connection c = ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("select * from company");



        ResultSet resultSet = stmt.executeQuery();
        while (resultSet.next()){
            rs.add(new Company(resultSet.getInt(1), resultSet.getString(2)));
        }
        return rs;
    }
}
