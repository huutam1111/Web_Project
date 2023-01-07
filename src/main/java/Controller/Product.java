package Controller;

<<<<<<< HEAD
import DAO.ProductDAO;
import Model.Post;
=======
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
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
<<<<<<< HEAD
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.ArrayList;
=======
import java.sql.SQLException;
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116

@WebServlet("/product")
public class Product extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
<<<<<<< HEAD
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
            tmp.setTitle(URLEncoder.encode(tmp.getTitle(), StandardCharsets.UTF_8));
            tmp.setFuel(URLEncoder.encode(tmp.getFuel(), StandardCharsets.UTF_8));

        }
        res.getWriter().write(new Gson().toJson(products));
    }
=======
        req.getRequestDispatcher("Page/Product.jsp").forward(req, res);
    }
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
}
