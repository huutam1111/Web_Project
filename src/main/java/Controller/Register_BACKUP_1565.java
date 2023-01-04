package Controller;
import Model.RespJsonServlet;
import DAO.UserDAO;
import Upload.UploadImage;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
<<<<<<< HEAD
import java.nio.file.Path;
=======
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
>>>>>>> 623fd91ad75cef09889378b07ed5a66796159242
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
        ArrayList<String> list= UploadImage.uploadAllFile(avatar, pathRoot);
        for(String tmp:list){
            pathAvtUser+=tmp;
        }
        try {
            if((UserDAO.insertUser(name, pass, fullName, email, phone, address,pathAvtUser)!=0)){
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
