package Controller;


import Model.Cart;
import Service.CartService;
import Service.UserService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
        response.setContentType("text/html");
        String user = null;
        System.out.println("cx");

        for (int i = 0; i < request.getCookies().length; i++) {
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
            request.getSession().setAttribute("carts", carts);

            request.getRequestDispatcher("Page/Cart.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("/Page/Login_Register.jsp").forward(request, response);

        }
    }
    protected void minusQuantity(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("idpost");
        Cookie[] arrCookie = request.getCookies();
        String user = null;
        for(Cookie tmp: arrCookie){
            if(tmp.getName().equals("user")){
                user = tmp.getValue();
                break;
            }
        }
        ArrayList<Cart> carts= (ArrayList<Cart>) request.getSession().getAttribute("carts");
        for(Cart tmp: carts){
            if(tmp.getUsername().equals(user) && tmp.getPost().getIdPost() == Integer.valueOf(id)){
                try {
                   Cart cart = CartService.updateQuantityCart(tmp.getUsername(), tmp.getPost().getIdPost(), tmp.getAmount() - 1);
                   Gson gson = new Gson();
                    tmp.setAmount(cart.getAmount());
                    request.getSession().setAttribute("carts", carts);
                   response.getWriter().write( gson.toJson(cart));
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
    protected void plusQuantity(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("idpost");
        Cookie[] arrCookie = request.getCookies();
        String user = null;
        for(Cookie tmp: arrCookie){
            if(tmp.getName().equals("user")){
                user = tmp.getValue();
                break;
            }
        }
        ArrayList<Cart> carts= (ArrayList<Cart>) request.getSession().getAttribute("carts");
        for(Cart tmp: carts){
            if(tmp.getUsername().equals(user) && tmp.getPost().getIdPost() == Integer.valueOf(id)){
                try {
                    Cart cart = CartService.updateQuantityCart(tmp.getUsername(), tmp.getPost().getIdPost(), tmp.getAmount() + 1);
                    Gson gson = new Gson();
                    tmp.setAmount(cart.getAmount());
                    request.getSession().setAttribute("carts", carts);
                    response.getWriter().write( gson.toJson(cart));
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){

        }else{
            if(action.equalsIgnoreCase("minus")){
                minusQuantity(request,response);
            }
            if(action.equalsIgnoreCase("plus")){
                plusQuantity(request,response);
            }
        }

    }
}
