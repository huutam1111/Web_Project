package Controller;

import DAO.CompanyDAO;
import DAO.ProductDAO;
import Upload.UploadImage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/postProduct")
public class PostProduct extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathRoot=(this.getServletContext().getRealPath("/"));
<<<<<<< HEAD
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("utf-8");
=======
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
        try {
            String status=req.getParameter("status");
            int statusMain=1;
            if(status.equalsIgnoreCase("Sản phẩm đã qua sử dụng")){
                statusMain=0;
            }
            String title=req.getParameter("title");
            String content=req.getParameter("content");
            String images=req.getParameter("images");
            int coverNumber=Integer.parseInt(req.getParameter("covernumber"));
            int idCompany=CompanyDAO.getIdByName(req.getParameter("nameCompany"));
            int year=Integer.parseInt(req.getParameter("yearofmanufacture"));
            ArrayList<String> listimgs=UploadImage.uploadAllFile(images,pathRoot,"post"+String.valueOf(idCompany),"Product");
            String rsImg="";
            for (String tmp : listimgs) {
                rsImg+=tmp+"||";
            }
            System.out.println(rsImg);
            String gear=req.getParameter("gear");
            String fuel=req.getParameter("fuel");
            Float price=Float.parseFloat(req.getParameter("price"));
            String body=req.getParameter("body");
            String made=req.getParameter("made");
            int rs=ProductDAO.insertProduct(title,content,body,made,rsImg,coverNumber,idCompany,year,statusMain,fuel,price,gear);
            System.out.println(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
