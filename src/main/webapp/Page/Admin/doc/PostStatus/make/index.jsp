<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://oto.com.vn/member/Styles/web/postnew-quick.css?v=638035266443576953">
    <link rel="stylesheet" href="https://oto.com.vn/Scripts/swiper-6.3.3/swiper-bundle.min.css">
    <link rel="stylesheet" href="https://oto.com.vn/Styles/v2.0/common.css?v=638035266443576953">
    <link rel="stylesheet" href="https://oto.com.vn/Styles/v2.0/theme.css?v=638035266443576953">
    <link rel="stylesheet" href="https://oto.com.vn/member/Styles/web/post_news.css?v=638035266443576953">
    <link rel="stylesheet" href="https://oto.com.vn/member/Styles/web/postnew-quick.css?v=638035266443576953">
    <link rel="stylesheet" href="https://oto.com.vn/node_modules/@angular/material/prebuilt-themes/indigo-pink.css">
    <style>
        <%@include file="index.css"%>
    </style>

</head>
<body>
    <form class="editForm ng-pristine ng-invalid ng-touched" novalidate="">
        <div class="container postnews make-form">
            <div class="gr-heading-post"><h2 class="heading "> Thông tin xe </h2><span class="status-per per2"></span>
            </div>
            <div class="control mt-20" style="margin-top: 20px">
                <label class="lbl-form">Hãng xe</label>
                <select class="form-select" aria-label="Default select example">
                    <c:forEach items="${listCompany}" var="item">
                        <option>${item.name}</option>
                    </c:forEach>
                    <%System.out.println(request.getSession().getAttribute("listCompany"));%>
                </select>


                <mat-autocomplete class="mat-autocomplete"><!----></mat-autocomplete><!----><!----></div><!----><!---->
            <div class="control year"><label class="lbl-form">Năm sản xuất</label>
                <div class="list-year"><!---->

                </div>
                <div class="clear">
                    Hiển thị thêm
                </div>
            </div>
            <div class="control"><label class="lbl-form sm-lh">Xuất xứ</label>
                <ul class="status-group">
                    <li><input class="hide" id="old1" name="radio3" type="radio"><label class="free-label" for="old1">Trong nước</label></li>
                    <li><input class="hide" id="new1" name="radio3" type="radio"><label class="free-label" for="new1">Nhập khẩu</label></li>
                </ul><!----></div>
            <div class="control"><label class="lbl-form sm-lh">Hộp số</label>
                <ul class="status-group status-group-small">
                    <li><input class="hide" id="transmission1" name="transmission" type="radio"><label
                            class="free-label" for="transmission1">Số tay</label></li>
                    <li><input class="hide" id="transmission2" name="transmission" type="radio"><label
                            class="free-label" for="transmission2">Số tự động</label></li>
                    <li><input class="hide" id="transmission3" name="transmission" type="radio"><label
                            class="free-label" for="transmission3">Số hỗn hợp</label></li>
                </ul><!----></div>
            <div class="control"><label class="lbl-form sm-lh">Nhiên liệu</label>
                <ul class="status-group group-three">
                    <li><input class="hide" id="fuelType1" name="fuelType" type="radio"><label class="free-label"
                                                                                               for="fuelType1">Xăng</label>
                    </li>
                    <li><input class="hide" id="fuelType2" name="fuelType" type="radio"><label class="free-label"
                                                                                               for="fuelType2">Diesel</label>
                    </li>
                    <li><input class="hide" id="fuelType3" name="fuelType" type="radio"><label class="free-label"
                                                                                               for="fuelType3">
                        Hybrid </label></li>
                    <li><input class="hide" id="fuelType4" name="fuelType" type="radio"><label class="free-label"
                                                                                               for="fuelType4">
                        Điện </label></li>
                    <li><input class="hide" id="fuelType99" name="fuelType" type="radio"><label class="free-label"
                                                                                                for="fuelType99">
                        Khác </label></li>
                </ul><!----></div><!---->
            <div class="control"><label class="lbl-form sm-lh">Tình trạng</label>
                <ul class="status-group">
                    <li><input class="hide" id="old" name="radio2" type="radio"><label class="free-label" for="old">Đã qua sử dụng</label></li>
                    <li><input class="hide" id="new" name="radio2" type="radio"><label class="free-label"
                                                                                       for="new">Mới</label></li>
                </ul><!----></div><!---->
            <div class="control"><label class="lbl-form" for="">Giá bán</label>
                <div class="my-input-container"><input class="inp ng-pristine ng-invalid error ng-touched"
                                                       formcontrolname="Price" id="Price" maxlength="12"
                                                       placeholder="Nhập giá bán của xe (Đơn vị: triệu VNĐ)"
                                                       style="width: 100%;" type="text"><!----><span class="tmpPrice"
                                                                                                     style="visibility: hidden;"></span>
                </div><!---->
                <div class="control"><label class="lbl-form" for="">Kiểu dáng</label>
                    <div class="my-input-container"><input class="inp ng-pristine ng-invalid error ng-touched"
                                                           formcontrolname="Price" id="body" maxlength="12"
                                                           placeholder="Nhập kiểu dáng xe"
                                                           style="width: 100%;" type="text"><!----><span
                            class="tmpPrice"
                            style="visibility: hidden;"></span>
                    </div><!---->
                    <div class="txt-right"><!---->
                        <div class="msg-error"><span style="display: none"
                                                     class="txt">Vui lòng nhập giá xe đúng định dạng</span></div>
                    </div>
                </div>
            </div>
        </div>
    </form>
</body>
<script type="application/javascript">
    var html = "";
    var temp = 5;
    const date = new Date();
    const listYear = document.querySelector(".list-year");
    document.querySelector(".clear").addEventListener("click", (e) => {
        temp += 5;
        renderListYear(temp);
    })
    var renderListYear = (tempYear) => {
        html = "";
        for (let i = 0; i < temp; i++) {
            console.log(date.getUTCFullYear())
            var jump = date.getUTCFullYear() - i;
            console.log(`\${jump}`)
            html += `<span
            class="year-item"><input class="hide" name="radio1" type="radio" id="y\${jump}"><label
            class="free-label" for="y\${jump}">\${jump}</label></span>`
        }
        console.log(html)
        listYear.innerHTML = html;
    }
    renderListYear(temp);
</script>
</html>