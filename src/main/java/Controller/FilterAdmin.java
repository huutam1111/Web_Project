package Controller;

<<<<<<< HEAD
import DAO.UserDAO;
import Model.RespJsonServlet;
=======
import Model.RespJsonServlet;
import Service.UserService;
>>>>>>> 48c24c3c4e8d12128567d42a2ca47ef9f1a79ce2

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
@WebServlet("/checkAdmin")
public class FilterAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
<<<<<<< HEAD
        String redirect=req.getParameter("redirect");
=======
        String redirect="index";
>>>>>>> 48c24c3c4e8d12128567d42a2ca47ef9f1a79ce2
        System.out.println(redirect);
        Cookie[] cookies= req.getCookies();
        String name="";
        for(Cookie tmp:cookies){
            if(tmp.getName().equals("user")){
                name=tmp.getValue();
                try {
<<<<<<< HEAD
                    if(UserDAO.checkAdmin(name)){
=======
                    if(UserService.checkAdmin(name)){
>>>>>>> 48c24c3c4e8d12128567d42a2ca47ef9f1a79ce2
                        resp.sendRedirect("/Page/Admin/doc/"+redirect+".jsp");
                        resp.setStatus(200);
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        System.out.println(name);
        if(name.equalsIgnoreCase("")){
            resp.sendRedirect("/Page/Login_Register.jsp");
            resp.setStatus(200);
        }
    }
    }

