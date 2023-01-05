<%----%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Danh sách nhân viên | Quản trị Admin</title>
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
    <!-- or -->
    <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css"
          href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css">
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

<body onload="time()" class="app sidebar-mini rtl">
<!-- Navbar-->
<header class="app-header">
    <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="#" data-toggle="sidebar"
                                    aria-label="Hide Sidebar"></a>
    <!-- Navbar Right Menu-->
    <%@ include file="/Page/Admin/doc/header.jsp" %>
</header>
<!-- Sidebar menu-->
<div class="app-sidebar__overlay" data-toggle="sidebar"></div>
<%@ include file="/Page/Admin/doc/SideBar.jsp" %>
<main class="app-content">
    <div class="row">
        <div class="col-md-12">
            <div class="app-title">
                <ul class="app-breadcrumb breadcrumb">
                    <li class="breadcrumb-item"><a href="#"><b>Bảng điều khiển</b></a></li>
                </ul>
                <div id="clock"></div>
            </div>
        </div>
    </div>
    <form class="editForm ng-pristine ng-invalid ng-touched" novalidate="">
        <div class="container postnews make-form">
            <div class="gr-heading-post"><h2 class="heading "> Thông tin xe </h2><span class="status-per per2"></span></div>
            <div class="control mt-20">
                <label class="lbl-form">Hãng xe</label>
                <input class="inp mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-valid" matinput="" placeholder="Nhập hãng xe cần bán" type="text" autocomplete="off" role="combobox" aria-autocomplete="list" aria-expanded="false" id="mat-input-0" aria-invalid="false" aria-required="false">
                <mat-autocomplete class="mat-autocomplete"><!----></mat-autocomplete><!----><!----></div><!----><!---->
            <div class="control year"><label class="lbl-form">Năm sản xuất</label>
                <div class="list-year"><span class="year-item"><input class="hide" name="radio1" type="radio" id="y2023"><label class="free-label" for="y2023">2023</label></span><span class="year-item"><input class="hide" name="radio1" type="radio" id="y2022"><label class="free-label" for="y2022">2022</label></span><span class="year-item"><input class="hide" name="radio1" type="radio" id="y2021"><label class="free-label" for="y2021">2021</label></span><span class="year-item"><input class="hide" name="radio1" type="radio" id="y2020"><label class="free-label" for="y2020">2020</label></span><span class="year-item"><input class="hide" name="radio1" type="radio" id="y2019"><label class="free-label" for="y2019">2019</label></span></div>
                <div class="clear">
                    Hiển thị thêm
                </div>
            </div>
            <div class="control"><label class="lbl-form sm-lh">Tình trạng</label>
                <ul class="status-group">
                    <li><input class="hide" id="old" name="radio2" type="radio"><label class="free-label" for="old">Đã qua
                        sử dụng</label></li>
                    <li><input class="hide" id="new" name="radio2" type="radio"><label class="free-label" for="new">Mới</label></li>
                </ul><!----></div><!---->
            <div class="control"><label class="lbl-form sm-lh">Xuất xứ</label>
                <ul class="status-group">
                    <li><input class="hide" id="old1" name="radio3" type="radio"><label class="free-label" for="old1">Trong
                        nước</label></li>
                    <li><input class="hide" id="new1" name="radio3" type="radio"><label class="free-label" for="new1">Nhập
                        khẩu</label></li>
                </ul><!----></div>
            <div class="control"><label class="lbl-form sm-lh">Hộp số</label>
                <ul class="status-group status-group-small">
                    <li><input class="hide" id="transmission1" name="transmission" type="radio"><label class="free-label" for="transmission1">Số
                        tay</label></li>
                    <li><input class="hide" id="transmission2" name="transmission" type="radio"><label class="free-label" for="transmission2">Số
                        tự động</label></li>
                    <li><input class="hide" id="transmission3" name="transmission" type="radio"><label class="free-label" for="transmission3">Số
                        hỗn hợp</label></li>
                </ul><!----></div>
            <div class="control"><label class="lbl-form sm-lh">Nhiên liệu</label>
                <ul class="status-group group-three">
                    <li><input class="hide" id="fuelType1" name="fuelType" type="radio"><label class="free-label" for="fuelType1">Xăng</label>
                    </li>
                    <li><input class="hide" id="fuelType2" name="fuelType" type="radio"><label class="free-label" for="fuelType2">Diesel</label>
                    </li>
                    <li><input class="hide" id="fuelType3" name="fuelType" type="radio"><label class="free-label" for="fuelType3">
                        Hybrid </label></li>
                    <li><input class="hide" id="fuelType4" name="fuelType" type="radio"><label class="free-label" for="fuelType4">
                        Điện </label></li>
                    <li><input class="hide" id="fuelType99" name="fuelType" type="radio"><label class="free-label" for="fuelType99">
                        Khác </label></li>
                </ul><!----></div><!---->
            <div class="control"><label class="lbl-form" for="">Giá bán</label>
                <div class="my-input-container"><input class="inp ng-pristine ng-invalid error ng-touched" formcontrolname="Price" id="Price" maxlength="12" placeholder="Nhập giá bán của xe (Đơn vị: triệu VNĐ)" style="width: 100%;" type="text"><!----><span class="tmpPrice" style="visibility: hidden;"></span>
                </div><!---->
                <div class="txt-right"><!---->
                    <div class="msg-error"><span style="display: none" class="txt">Vui lòng nhập giá xe đúng định dạng</span></div>
                </div>
            </div>
            <div class="group-bt two-bt" id="btn-postListing">
                <a href="/Page/PostStatus/Img" class="btn-back">Quay lại</a>
                <a href="../titlencontent" class="btn-send">Tiếp tục</a>
            </div>
        </div>
    </form>



</main>
<script src="js/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="js/popper.min.js"></script>
<script src="https://unpkg.com/boxicons@latest/dist/boxicons.js"></script>
<!--===============================================================================================-->
<script src="js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="js/main.js"></script>
<!--===============================================================================================-->
<script src="js/plugins/pace.min.js"></script>
<!--===============================================================================================-->
<script type="text/javascript" src="js/plugins/chart.js"></script>
<!--===============================================================================================-->
<script type="text/javascript">
    var data = {
        labels: ["Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6"],
        datasets: [{
            label: "Dữ liệu đầu tiên",
            fillColor: "rgba(255, 213, 59, 0.767), 212, 59)",
            strokeColor: "rgb(255, 212, 59)",
            pointColor: "rgb(255, 212, 59)",
            pointStrokeColor: "rgb(255, 212, 59)",
            pointHighlightFill: "rgb(255, 212, 59)",
            pointHighlightStroke: "rgb(255, 212, 59)",
            data: [20, 59, 90, 51, 56, 100]
        },
            {
                label: "Dữ liệu kế tiếp",
                fillColor: "rgba(9, 109, 239, 0.651)  ",
                pointColor: "rgb(9, 109, 239)",
                strokeColor: "rgb(9, 109, 239)",
                pointStrokeColor: "rgb(9, 109, 239)",
                pointHighlightFill: "rgb(9, 109, 239)",
                pointHighlightStroke: "rgb(9, 109, 239)",
                data: [48, 48, 49, 39, 86, 10]
            }
        ]
    };

    var ctxl = $("#lineChartDemo").get(0).getContext("2d");
    var lineChart = new Chart(ctxl).Line(data);

    var ctxb = $("#barChartDemo").get(0).getContext("2d");
    var barChart = new Chart(ctxb).Bar(data);
</script>
<script type="text/javascript">
    //Thời Gian
    function time() {
        var today = new Date();
        var weekday = new Array(7);
        weekday[0] = "Chủ Nhật";
        weekday[1] = "Thứ Hai";
        weekday[2] = "Thứ Ba";
        weekday[3] = "Thứ Tư";
        weekday[4] = "Thứ Năm";
        weekday[5] = "Thứ Sáu";
        weekday[6] = "Thứ Bảy";
        var day = weekday[today.getDay()];
        var dd = today.getDate();
        var mm = today.getMonth() + 1;
        var yyyy = today.getFullYear();
        var h = today.getHours();
        var m = today.getMinutes();
        var s = today.getSeconds();
        m = checkTime(m);
        s = checkTime(s);
        nowTime = h + " giờ " + m + " phút " + s + " giây";
        if (dd < 10) {
            dd = '0' + dd
        }
        if (mm < 10) {
            mm = '0' + mm
        }
        today = day + ', ' + dd + '/' + mm + '/' + yyyy;
        tmp = '<span class="date"> ' + today + ' - ' + nowTime +
            '</span>';
        document.getElementById("clock").innerHTML = tmp;
        clocktime = setTimeout("time()", "1000", "Javascript");

        function checkTime(i) {
            if (i < 10) {
                i = "0" + i;
            }
            return i;
        }
    }
</script>
</body>
<%--uploadfile--%>
<script>
    document.querySelector(".btn-send").addEventListener("click", (e) => {
        e.preventDefault();
    })
    document.querySelector(".upload-item").addEventListener("click", (e) => {
        document.querySelector(".fileupload").click()
    })
</script>
<script>
    document.querySelector(".btn-send").addEventListener("click", (e) => {
        e.preventDefault();
    })
    document.querySelector(".upload-item").addEventListener("click", (e) => {
        document.querySelector(".fileupload").click()
    })
</script>

</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <%--    --%>

    <style>
        <%@include file="index.css"%>
    </style>

</head>
<body>
<form class="editForm ng-pristine ng-invalid ng-touched" novalidate="">
    <div class="container postnews make-form">
        <div class="gr-heading-post"><h2 class="heading "> Thông tin xe </h2><span class="status-per per2"></span></div>
        <div class="control mt-20">
            <label class="lbl-form">Hãng xe</label>
            <input
                    class="inp mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-valid"
                    matinput="" placeholder="Nhập hãng xe cần bán" type="text" autocomplete="off" role="combobox"
                    aria-autocomplete="list" aria-expanded="false" id="mat-input-0" aria-invalid="false"
                    aria-required="false">
            <mat-autocomplete class="mat-autocomplete"><!----></mat-autocomplete><!----><!----></div><!----><!---->
        <div class="control year"><label class="lbl-form">Năm sản xuất</label>
            <div class="list-year"><!---->

            </div>
            <div class="clear">
                Hiển thị thêm
            </div>
        </div>
        <div class="control"><label class="lbl-form sm-lh">Tình trạng</label>
            <ul class="status-group">
                <li><input class="hide" id="old" name="radio2" type="radio"><label class="free-label" for="old">Đã qua
                    sử dụng</label></li>
                <li><input class="hide" id="new" name="radio2" type="radio"><label class="free-label"
                                                                                   for="new">Mới</label></li>
            </ul><!----></div><!---->
        <div class="control"><label class="lbl-form sm-lh">Xuất xứ</label>
            <ul class="status-group">
                <li><input class="hide" id="old1" name="radio3" type="radio"><label class="free-label" for="old1">Trong
                    nước</label></li>
                <li><input class="hide" id="new1" name="radio3" type="radio"><label class="free-label" for="new1">Nhập
                    khẩu</label></li>
            </ul><!----></div>
        <div class="control"><label class="lbl-form sm-lh">Hộp số</label>
            <ul class="status-group status-group-small">
                <li><input class="hide" id="transmission1" name="transmission" type="radio"><label class="free-label"
                                                                                                   for="transmission1">Số
                    tay</label></li>
                <li><input class="hide" id="transmission2" name="transmission" type="radio"><label class="free-label"
                                                                                                   for="transmission2">Số
                    tự động</label></li>
                <li><input class="hide" id="transmission3" name="transmission" type="radio"><label class="free-label"
                                                                                                   for="transmission3">Số
                    hỗn hợp</label></li>
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
        <div class="control"><label class="lbl-form" for="">Giá bán</label>
            <div class="my-input-container"><input class="inp ng-pristine ng-invalid error ng-touched"
                                                   formcontrolname="Price" id="Price" maxlength="12"
                                                   placeholder="Nhập giá bán của xe (Đơn vị: triệu VNĐ)"
                                                   style="width: 100%;" type="text"><!----><span class="tmpPrice"
                                                                                                 style="visibility: hidden;"></span>
            </div><!---->
            <div class="txt-right"><!---->
                <div class="msg-error"><span style="display: none"
                                             class="txt">Vui lòng nhập giá xe đúng định dạng</span></div>
            </div>
        </div>
        <div class="group-bt two-bt" id="btn-postListing">
            <a href="/Page/PostStatus/Img" class="btn-back">Quay lại</a>
            <a href="../titlencontent" class="btn-send">Tiếp tục</a>
        </div>
    </div>
</form>
</body>
<script src="index.js">
</script>
</html>
