package Controller;

import DAO.ProductDAO;
import Model.Post;
import Model.RespJsonServlet;
import Model.User;
import DAO.UserDAO;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/product")
public class Product extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action != null && action.equals("getlistproduct")){
            try {
                getListProduct(req,res);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return;
        }
        req.getRequestDispatcher("Page/Product.jsp").forward(req, res);
    }
    protected void getListProduct(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException, SQLException {
        ArrayList<Post> products = ProductDAO.getProduct();
        for(Post tmp :products ){
            tmp.setContent(URLEncoder.encode(tmp.getContent(), StandardCharsets.UTF_8));
            tmp.setTitle(tmp.getTitle());
            System.out.println(tmp.getTitle());
            tmp.setFuel(URLEncoder.encode(tmp.getFuel(), StandardCharsets.UTF_8));

        }
        res.getWriter().write(new Gson().toJson(products));
    }
}
