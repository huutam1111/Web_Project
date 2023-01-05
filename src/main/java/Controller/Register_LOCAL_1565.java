package Controller;
import Model.RespJsonServlet;
import Service.UserService;
import Upload.UploadImage;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/register")
public class Register extends HttpServlet {
    ServletContext servletContext;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathRoot=(this.getServletContext().getRealPath("/"));
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        String name=req.getParameter("name");
        String pass=req.getParameter("pass");
        String fullName=req.getParameter("fullName");
        String email= req.getParameter("email");
        String phone= req.getParameter("phone");
        String avatar= req.getParameter("avatar");
        String pathAvtUser="";
        ArrayList<String> list= UploadImage.uploadAllFile(avatar, pathRoot);
        for(String tmp:list){
            pathAvtUser+=tmp;
        }
        try {
            if((UserService.insertUser(name, pass, fullName, email, phone,pathAvtUser)!=0)){
                PrintWriter writer=resp.getWriter();
                RespJsonServlet ex=new RespJsonServlet("register success");
                writer.println(ex.json());
                resp.setStatus(200);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
