package DAO;

import Connect.ConnectDB;
import Model.Cart;
import Model.Company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompanyDAO {
    public static ArrayList<Company> getAllCompany() throws SQLException {
        ArrayList<Company> companys = new ArrayList<>();
        Connection c = ConnectDB.getConnect();
        PreparedStatement stmt = c.prepareStatement("select  * from company");
        ResultSet rs=stmt.executeQuery();
        while (rs.next()){
            companys.add(new Company(rs.getString(1),rs.getString(2),rs.getString(3)));
        }
        return companys;
    }
}
