<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <title>Document</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
</head>
<body>
<c:forEach items="${listProduct}" var="item" begin = "1" end = "8">
<div class="col-3">
    <div class="item box-list-car-item box-item-home">
        <div class="photo" style="height: 196px;"><a
                href="/Page/Detail.jsp"
                class="rt pdt-per-74"> <img
                title="Giảm nhiều tiền mặt, tặng thẻ chăm xe 1 năm, trả góp lãi suất thấp"
            <%--          img--%>
<%--                conme--%>



<%--                src="${item.getSrcFirst()}"&ndash;%&gt;--%>
<<<<<<< HEAD
                src="${item.getImg()}"
=======
                src="../Img/20221102175254-53b3_wm.jpg"
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
                alt="Giảm nhiều tiền mặt, tặng thẻ chăm xe 1 năm, trả góp lãi suất thấp"
                style="position: absolute; inset: 0px; margin: auto;"> </a>
        </div>
        <div class="info"><h3 class="title"><a
                title="Giảm nhiều tiền mặt, tặng thẻ chăm xe 1 năm, trả góp lãi suất thấp"
                href="/Page/Detail.jsp">${item.title}</a></h3>
            <p class="price">${item.price} triệu</p>
            <ul class="list">
                <li><i class="fa-sharp fa-solid fa-calendar-days"></i></i>${item.yearOfManuFacture}</li>
                <li><i class="icon-type-number"></i>${item.gear}</li>
                <li><i class="fa-solid fa-flag-checkered"></i>${item.made}</li>
                <li><i class="fa-solid fa-gas-pump"></i>${item.fuel}</li>
            </ul>
        </div>
        <div class="clearboth"></div>
        <div class="box-neo">
            <div><a style="width: 100%" href="javascript:void(0)"
                    data-call="Kia.Soluto.Mới.Trong nước.2022.424 triệu...F0.V3.22661608."
                    data-listtype="F0" data-viptype="V3"
                    class="mobile btn-call datalayer-call"
                    datalayer-json="{&quot;Event&quot;:&quot;action&quot;,&quot;Action&quot;:&quot;&quot;,&quot;ProductId&quot;:22661608,&quot;SellerId&quot;:130219,&quot;VipType&quot;:&quot;Vip 3&quot;,&quot;UserId&quot;:0,&quot;PageType&quot;:&quot;Orthers&quot;}"
                    data-phone="0965703841" onclick="viewMobile(this)"
                    rel="nofollow"><i class="icon-phone"
                                      data-call="Kia.Soluto.Mới.Trong nước.2022.424 triệu...F0.V3.22661608."></i>0965
                7** ***</a></div>
        </div>
    </div>
</div>
</c:forEach>


</body>
</html>
