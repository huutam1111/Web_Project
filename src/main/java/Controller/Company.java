package Controller;

import DAO.CompanyDAO;
import Mail.SendEmail;
import Model.RespJsonServlet;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/company")
public class Company extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            res.getWriter().write(new Gson().toJson(CompanyDAO.getCompany()));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
