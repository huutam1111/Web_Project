<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        <%@include file="cart.css" %>
    </style>
    <title>Cart</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<jsp:include page="../Component/header/Header.jsp"/>
<br>
<div class="ads-grid_shop container" id="cartPage">
    <div class="shop_inner_inf">
        <div class="privacy about">

            <div class="checkout-right">
                <h4 class="title-checkout-right"></h4>
                <table class="timetable_sub">
                    <thead>
                    <tr>
                        <th>No</th>
                        <th>Hình ảnh</th>
                        <th>Số lượng</th>
                        <th>Tên</th>

                        <th>Giá</th>
                        <th>Xoá</th>
                    </tr>
                    </thead>
                    <tbody id="table-item">
                    <% int count = 0; %>
                    <c:forEach items="${carts}" var="o">

                        <% count++; %>
                        <tr class="rem0" id="item-cart-${o.getPost().getIdPost()}">
                            <td class="invert"> <%=count%></td>
                            <td class="invert-image"><a href="#" ><img src="https://img1.oto.com.vn/crop/575x430/2022/10/21/20221021114014-e7ea_wm.jpeg" alt=" " class="img-responsive"></a></td>
                            <td class="invert">
                                <div class="quantity">
                                    <div class="quantity-select">
                                        <c:if test="${o.getAmount() == 1}">

                                            <div class="entry value-minus events-none" id="minus "  onclick="minus(${o.getPost().getIdPost()})">&nbsp;</div>
                                        </c:if>
                                        <c:if test="${o.getAmount() != 1}">

                                            <div class="entry value-minus" id="minus" onclick="minus(${o.getPost().getIdPost()})">&nbsp;</div>
                                        </c:if>
                                        <div class="entry value"><span class="amount">${o.getAmount()}</span></div>
                                            <div class="entry value-plus active" onclick="plus(${o.getPost().getIdPost()})">&nbsp;</div>

                                    </div>
                                </div>
                            </td>
                            <td class="invert">${o.getPost().getTitle()} </td>

                            <td class="invert price">${o.total()}</td>
                            <td class="invert">
                                <div class="rem0">
                                    <div class="closeItem closeItem0"> <i class="fas fa-times"></i> </div>
                                </div>

                            </td>
                        </tr>

                    </c:forEach>



                    </tbody>
                </table>
            </div>
            <div class="checkout-left">
                <div class=" checkout-left-basket" style="width: 100%;">
                    <div class="s1" >
                        <a href="./" style="text-decoration: none;"><h4>Xem thêm xe</h4></a>
                        <ul id="list-total1">
                            <li>Oto 1  <i>-</i> <span>$ 675.000</span></li>
                            <li>Thuế <i>-</i> <span>$55.00</span></li>
                            <hr>
                            <li>Tổng cộng <i>-</i> <span>$ 730.000</span></li></ul>
                    </div>
                </div>
                <div class="s2" style="border: 1px solid lightgray; flex: 2; padding: 10px;">

                    <h2>Thông tin đặt lịch</h2>
                    <form>

                        <div class="form-detail">
                            <div class="form-info col-md-6 col-xs-12">
                                <div class="group">
                                    <input type="date" id="date" class="control-custom"  />
                                    <label>Ngày xem xe</label>
                                </div>
                                <div class="group">
                                    <input class="control-custom" type="text">
                                    <span class="bar"></span>
                                    <label>Họ và tên</label>
                                </div>
                                <div class="group">
                                    <input class="control-custom" type="text">
                                    <span class="bar"></span>
                                    <label>Số điện thoại</label>
                                </div>
                            </div>
                            <div class="form-message col-md-6 col-xs-12">
                                <div class="group">
                                    <textarea class="control-custom" rows="10"></textarea>
                                    <span class="bar"></span>
                                    <label>Ghí chú</label>
                                </div>
                            </div>
                        </div>
                        <div class="form-button text-center">
                            <br>
                        </div>
                    </form>

                </div>





            </div>
            <div><a><input type="submit" value="HOÀN THÀNH" class="nowpay" onclick="payNow()" style="margin: 30px; text-align: center; width: 150px; height: 50px; float: right; background-color: #fb383b; border: none; color : white"></a></div>

            <div class="clearfix"></div>

        </div>
    </div>
</div>
<jsp:include page="../Component/footer/footer.jsp" />
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>

    plus = (idpost) =>{

        var request = new XMLHttpRequest();
        request.open("POST", "cart?action=plus&idpost="+idpost);
        request.onreadystatechange = function() {
            if(this.readyState === 4 && this.status === 200) {
                console.log(JSON.parse(this.responseText))
                let tr = document.querySelector("#item-cart-"+idpost);
                tr.querySelector(".amount").textContent = JSON.parse(this.responseText).amount;
                tr.querySelector(".price").textContent = JSON.parse(this.responseText).amount * JSON.parse(this.responseText).post.price;
                if(JSON.parse(this.responseText).amount > 1){
                    tr.querySelector("#minus").classList.remove("events-none")
                }
            }
        };
        // var myForm = document.getElementById("myForm");
        // var formData = new FormData(myForm);
        request.send();
    }
     minus = (idpost) =>{

        var request = new XMLHttpRequest();
        request.open("POST", "cart?action=minus&idpost="+idpost);
        request.onreadystatechange = function() {
            if(this.readyState === 4 && this.status === 200) {
                console.log(JSON.parse(this.responseText))
                let tr = document.querySelector("#item-cart-"+idpost);
                tr.querySelector(".amount").textContent = JSON.parse(this.responseText).amount;
                tr.querySelector(".price").textContent = JSON.parse(this.responseText).amount * JSON.parse(this.responseText).post.price;
                if(JSON.parse(this.responseText).amount == 1){
                    tr.querySelector("#minus").classList.add("events-none")
                }
            }
        };
        // var myForm = document.getElementById("myForm");
        // var formData = new FormData(myForm);
        request.send();
    }
    // $(document).ready(function(){
    //     $("#minus").click(function(){
    //         $.post("cart?update=10",
    //             {
    //                 name: "Donald Duck",
    //                 city: "Duckburg"
    //             },
    //             function(data,status){
    //                 alert("Data: " + data + "nStatus: " + status);
    //             });
    //     });
    // });
</script>

</html>
