package Controller;


import Model.Cart;
import Service.CartService;
import Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.System;
import java.sql.SQLException;
import java.util.ArrayList;


@WebServlet(name = "CartControl", value = "/cart")
public class CartControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = null;
        for (int i = 0; i < request.getCookies().length; i++) {
            System.out.println();
            if(request.getCookies()[i].getName().equals("user")){
                user = request.getCookies()[i].getValue();
                break;
            }
        }
        System.out.println(user);
        if(user != null){
            ArrayList<Cart> carts = new ArrayList<>();
            try {
                CartService cs = new CartService();
                carts = cs.getAllCartByUser(user);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println(carts.size());
            request.setAttribute("carts", carts);

            request.getRequestDispatcher("Page/Cart.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("/Page/Login_Register.jsp").forward(request, response);

        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
