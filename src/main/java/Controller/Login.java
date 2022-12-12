package Controller;

import Model.RespJsonServlet;
import Model.User;
import Service.UserService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw;
        String name= req.getParameter("username");
        String pass= req.getParameter("password");
        Gson gson=new Gson();
        try {
            if(UserService.checkLogin(name,pass)){
                User user=UserService.getUserByName(name);
                String userResp=gson.toJson(user);
                System.out.println(userResp);
                Cookie cookie=new Cookie("user", name);
                Cookie img=new Cookie("imgUser",user.getAvatar());
                resp.addCookie(cookie);
                resp.addCookie(img);
                pw=resp.getWriter();
                pw.println(new RespJsonServlet("ok").json());
                pw.close();
            }else {
                resp.getWriter().println(new RespJsonServlet("not ok").json());
                resp.setStatus(200);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
