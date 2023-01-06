package Controller;

import DAO.CompanyDAO;
import DAO.UserDAO;
import Model.Company;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/checkAdmin")
public class FilterAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        String redirect = req.getParameter("redirect");
        System.out.println(redirect);
        Cookie[] cookies = req.getCookies();
        String name = "";
        for (Cookie tmp : cookies) {
            if (tmp.getName().equals("user")) {
                name = tmp.getValue();
                try {
                    if (UserDAO.checkAdmin(name)) {
                        ArrayList<Company> list = CompanyDAO.getAllCompany();
                        req.getSession().setAttribute("listCompany", list);
                        resp.sendRedirect("/Page/Admin/doc/index.jsp");
                        resp.setStatus(200);
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        System.out.println(name);
        if (name.equalsIgnoreCase("")) {
            resp.sendRedirect("/Page/Login_Register.jsp");
            resp.setStatus(200);
        }
    }
}

