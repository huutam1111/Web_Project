<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://staticfile.oto.com.vn/dist/web/styles/theme.min.css.gz?v=638031797131449271">
    <link rel="stylesheet" href="https://staticfile.oto.com.vn/dist/web/styles/theme.min.css.gz?v=638031797131449271">
    <link rel="stylesheet"
          href="https://staticfile.oto.com.vn/dist/web/styles/listtinrao.min.css.gz?v=638031797131449271">
    <link rel="stylesheet" href="https://staticfile.oto.com.vn/dist/web/styles/fillte.min.css.gz?v=638031797131449271">
    <link rel="stylesheet" href="https://staticfile.oto.com.vn/dist/web/styles/footer.min.css.gz?v=638031797131449271">
    <link rel="stylesheet"
          href="https://staticfile.oto.com.vn/dist/web/styles/css-boxright.min.css.gz?v=638031797131449271">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
    <style>
        <%@include file="product.css" %>
    </style>
</head>
<body>
<jsp:include page="../Component/header/Header.jsp"/>
<div class="container">
    <jsp:include page="/Component/header/FilterHeader.jsp"/>
    <div class="container-content">
        <div class="Container-right">
            <jsp:include page="/Component/filter/Filter.jsp"/>

        </div>
        <div class="Container-left">
            <h1 class="heading mb-10" style="margin-top: 20px; margin-left: 20px">Mua bán xe ô tô mới</h1>

            <%--            ListItem--%>
            <div class="box-list-car" id="box-list-car">



            </div>
            <div class="pagination">

            </div>
        </div>

    </div>
</div>




<jsp:include page="../Component/footer/footer.jsp"/>
</body>
<script>
    $(document).ready(function () {
        $("#myInput").on("keyup", function () {
            var value = $(this).val().toLowerCase();
            $("#myList li").filter(function () {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });
    });

</script>
<script src="../EventJs/ReloadListitem.js">
</script>
<script src="../EventJs/FilterBrand.js">
</script>
<script src="../javascrip/product.js"></script>
</html>