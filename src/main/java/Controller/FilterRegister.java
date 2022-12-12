package Controller;

import Model.RespJsonServlet;
import Service.UserService;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebFilter("/register")
public class FilterRegister implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.setContentType("application/json");
        try {
            if(!(UserService.checkUser(request.getParameter("name"), request.getParameter("email")))){
                chain.doFilter(request,response);
            }else {
                RespJsonServlet ex=new RespJsonServlet("username or email is exist");
                HttpServletResponse resp=(HttpServletResponse)response;
                resp.getWriter().println(ex.json());
                resp.setStatus(200);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void destroy() {

    }
}
