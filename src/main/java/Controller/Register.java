package Controller;
<<<<<<< HEAD

import DAO.UserDAO;
import Upload.UploadImage;
import com.google.gson.Gson;
=======
import Model.RespJsonServlet;
import DAO.UserDAO;
import Upload.UploadImage;
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/register")
public class Register extends HttpServlet {
    ServletContext servletContext;
    public static String decodeURIComponent(String s, String charset) {
        if (s == null) {
            return null;
        }

        String result = null;

        try {
            result = URLDecoder.decode(s, charset);
        }

        // This exception should never occur.
        catch (UnsupportedEncodingException e) {
            result = s;
        }

        return result;
    }
    @Override
<<<<<<< HEAD
=======

>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathRoot=(this.getServletContext().getRealPath("/"));

        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("utf-8");
        String name=req.getParameter("name");
        String pass=req.getParameter("pass");
        String fullName=req.getParameter("fullName");
        fullName = decodeURIComponent(fullName,"UTF-8");
        String email= req.getParameter("email");
        String phone= req.getParameter("phone");
        String avatar= req.getParameter("avatar");
        String address= req.getParameter("address");
        address = decodeURIComponent(address,"UTF-8");
        String pathAvtUser="";
        System.out.println(name);
        System.out.println(pass);
        ArrayList<String> list= UploadImage.uploadAllFile(avatar, pathRoot, name,"User");
        for(String tmp:list){
            pathAvtUser+=tmp;
        }
        try {
            if((UserDAO.insertUser(name, pass, fullName, email, phone, address,pathAvtUser)!=0)){
                PrintWriter writer=resp.getWriter();
<<<<<<< HEAD
                writer.println(new Gson().toJson("register success"));
=======
                RespJsonServlet ex=new RespJsonServlet("register success");
                writer.println(ex.json());
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
                resp.setStatus(200);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
