package Controller;

import DAO.CommentDAO;
import Model.Comment;
import Model.RespJsonServlet;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

@WebServlet("/postComment")
public class CommentControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        ArrayList<Comment> cmts = new ArrayList<>();
        if(id != null){
            try {
                cmts = (ArrayList<Comment>) CommentDAO.getListComment(Integer.valueOf(id));
                resp.getWriter().write(new Gson().toJson(cmts));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String content= URLDecoder.decode(req.getParameter("content"), "UTF-8");
        resp.setContentType("application/json");
        long miliSeconds = System.currentTimeMillis();
        int idPost =Integer.valueOf(req.getParameter("idPost"));
        float star=Float.valueOf(req.getParameter("star"));
        // cach 2

        Date date2 = new Date(miliSeconds);
        String userName="";
        System.out.println(date2);
        System.out.println(star);
        System.out.println(content);
        System.out.println(idPost);
        Cookie[] cookies = req.getCookies();
        for (Cookie tmp : cookies) {
            if (tmp.getName().equals("user")) {
                userName = tmp.getValue();
            }

        }
        try {
            if((CommentDAO.insertComment(userName, new java.sql.Date(date2.getTime()),star,content,idPost)!=0)){
                resp.getWriter().println(new RespJsonServlet("ok").json());
            }else {
                resp.getWriter().println(new RespJsonServlet("not ok").json());
                resp.sendError(500);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
