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
<<<<<<< HEAD
  <link rel="stylesheet" href="https://oto.com.vn/member/Styles/web/postnew-quick.css?v=638035266443576953">
  <link rel="stylesheet" href="https://oto.com.vn/Scripts/swiper-6.3.3/swiper-bundle.min.css">
  <link rel="stylesheet" href="https://oto.com.vn/Styles/v2.0/common.css?v=638035266443576953">
  <link rel="stylesheet" href="https://oto.com.vn/Styles/v2.0/theme.css?v=638035266443576953">
  <link rel="stylesheet" href="https://oto.com.vn/member/Styles/web/post_news.css?v=638035266443576953">
  <link rel="stylesheet" href="https://oto.com.vn/member/Styles/web/postnew-quick.css?v=638035266443576953">
  <link rel="stylesheet" href="https://oto.com.vn/node_modules/@angular/material/prebuilt-themes/indigo-pink.css">
  <style>
    <%@include file="./PostStatus/Img/index.css"%>
  </style>
=======
>>>>>>> 48c24c3c4e8d12128567d42a2ca47ef9f1a79ce2

</head>

<body onload="time()" class="app sidebar-mini rtl">
  <!-- Navbar-->
  <header class="app-header">
    <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="#" data-toggle="sidebar"
      aria-label="Hide Sidebar"></a>
    <!-- Navbar Right Menu-->
    <%@ include file="./header.jsp" %>
  </header>
  <!-- Sidebar menu-->
  <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
  <%@ include file="SideBar.jsp" %>
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
<<<<<<< HEAD
    <div class="container">
      <form class="editForm ng-valid ng-dirty ng-touched" novalidate="">
        <div class="new-form-post form-upload container postnews">
          <div class="gr-heading-post"><h2 class="heading step1"> HÌNH ẢNH <span class="note-heading"><i
                  class="icon-dot"></i>0/25 - Bạn có thể đăng tối đa 25 ảnh</span></h2><span
                  class="status-per per1"></span></div>
          <ul class="list-note">
            <li><i class="icon-ok"></i><span>Đăng ít nhất 03 hình để tin rao hiệu quả hơn.</span></li>
            <li><i class="icon-ok"></i><span>Ảnh đầu tiên sẽ là ảnh đại diện cho tin của bạn, kéo thả để sắp xếp vị trí ảnh.</span>
            </li>
          </ul>
          <div class="upload">
            <div class="swiper-container">
              <ul class="list-thumb-gallery  default-theme" id="uploadimage"><input multiple=""
                                                                                    class="fileupload input-hidden"
                                                                                    type="file">
                <li class="upload-item working-upload-item add"><a href="javascript:void(0)" class="add-img"><i
                        class="icon-plus"></i><span class="txt-add">Thêm ảnh</span></a></li>
              </ul>
              <div class="swiper-scrollbar"></div>
            </div>
          </div>
          <div class="control control-last"><label class="lbl-form sm-lh" for="mat-slide-toggle-1-input">Che biển số</label><span
                  class="flag-toogle"><mat-slide-toggle
                  class="mat-slide-toggle mat-accent _mat-animation-noopable ng-untouched ng-pristine ng-valid"
                  formcontrolname="IsNumberPlateBlur" id="mat-slide-toggle-1"><label class="mat-slide-toggle-label"><div
                  class="mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin"><input
                  class="mat-slide-toggle-input cdk-visually-hidden" type="checkbox" id="mat-slide-toggle-1-input"
                  tabindex="0"><div class="mat-slide-toggle-thumb-container"><div
                  class="mat-slide-toggle-thumb"></div><div
                  class="mat-slide-toggle-ripple mat-ripple" mat-ripple=""></div></div></div><span
                  class="mat-slide-toggle-content"></span></label></mat-slide-toggle></span></div>
          <div class="control"><label class="lbl-form" for="inputVideo">Video</label><input id="inputVideo"
                                                                                            class="inp ng-untouched ng-pristine ng-valid"
                                                                                            formcontrolname="VideoEmbed"
                                                                                            name="VideoEmbed"
                                                                                            placeholder="Bạn hãy nhập link video Youtube hoặc link video Facebook vào đây"
                                                                                            type="text"><!---->
            <div class="txt-right"><!----></div>
          </div>
          <div class="control control-last"><label class="lbl-form sm-lh" for="mat-slide-toggle-2-input">Nhận ưu đãi tin chính
            chủ</label><span
                  class="flag-toogle"><mat-slide-toggle
                  class="mat-slide-toggle mat-accent _mat-animation-noopable ng-valid ng-dirty ng-touched"
                  formcontrolname="RegisterForPreferential" id="mat-slide-toggle-2"><label
                  class="mat-slide-toggle-label"><div
                  class="mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin"><input
                  class="mat-slide-toggle-input cdk-visually-hidden" type="checkbox" id="mat-slide-toggle-2-input"
                  tabindex="0"><div class="mat-slide-toggle-thumb-container"><div
                  class="mat-slide-toggle-thumb"></div><div
                  class="mat-slide-toggle-ripple mat-ripple" mat-ripple=""></div></div></div><span
                  class="mat-slide-toggle-content"></span></label></mat-slide-toggle></span></div>
          <div class="control center"><a href="https://oto.com.vn/landingpage/xe-chinh-chu" target="_blank"><img
                  src="https://img1.oto.com.vn/Static/Images/Promotion/OwnerListing/750x130.jpg"></a></div>
          <div class="group-bt two-bt" id="btn-postListing">
            <a href="./PostStatus/make" class="btn-send"> Tiếp tục</a></div>

        </div>
      </form>

    </div>


=======
    <div class="row">
      <!--Left-->
      <div class="col-md-12 col-lg-6">
        <div class="row">
       <!-- col-6 -->
       <div class="col-md-6">
        <div class="widget-small primary coloured-icon"><i class='icon bx bxs-user-account fa-3x'></i>
          <div class="info">
            <h4>Tổng khách hàng</h4>
            <p><b>56 khách hàng</b></p>
            <p class="info-tong">Tổng số khách hàng được quản lý.</p>
          </div>
        </div>
      </div>
       <!-- col-6 -->
          <div class="col-md-6">
            <div class="widget-small info coloured-icon"><i class='icon bx bxs-data fa-3x'></i>
              <div class="info">
                <h4>Tổng sản phẩm</h4>
                <p><b>1850 sản phẩm</b></p>
                <p class="info-tong">Tổng số sản phẩm được quản lý.</p>
              </div>
            </div>
          </div>
           <!-- col-6 -->
          <div class="col-md-6">
            <div class="widget-small warning coloured-icon"><i class='icon bx bxs-shopping-bags fa-3x'></i>
              <div class="info">
                <h4>Tổng đơn hàng</h4>
                <p><b>247 đơn hàng</b></p>
                <p class="info-tong">Tổng số hóa đơn bán hàng trong tháng.</p>
              </div>
            </div>
          </div>
           <!-- col-6 -->
          <div class="col-md-6">
            <div class="widget-small danger coloured-icon"><i class='icon bx bxs-error-alt fa-3x'></i>
              <div class="info">
                <h4>Sắp hết hàng</h4>
                <p><b>4 sản phẩm</b></p>
                <p class="info-tong">Số sản phẩm cảnh báo hết cần nhập thêm.</p>
              </div>
            </div>
          </div>
           <!-- col-12 -->
           <div class="col-md-12">
            <div class="tile">
                <h3 class="tile-title">Tình trạng đơn hàng</h3>
              <div>
                <table class="table table-bordered">
                  <thead>
                    <tr>
                      <th>ID đơn hàng</th>
                      <th>Tên khách hàng</th>
                      <th>Tổng tiền</th>
                      <th>Trạng thái</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>AL3947</td>
                      <td>Phạm Thị Ngọc</td>
                      <td>
                        19.770.000 đ
                      </td>
                      <td><span class="badge bg-info">Chờ xử lý</span></td>
                    </tr>
                    <tr>
                      <td>ER3835</td>
                      <td>Nguyễn Thị Mỹ Yến</td>
                      <td>
                        16.770.000 đ	
                      </td>
                      <td><span class="badge bg-warning">Đang vận chuyển</span></td>
                    </tr>
                    <tr>
                      <td>MD0837</td>
                      <td>Triệu Thanh Phú</td>
                      <td>
                        9.400.000 đ	
                      </td>
                      <td><span class="badge bg-success">Đã hoàn thành</span></td>
                    </tr>
                    <tr>
                      <td>MT9835</td>
                      <td>Đặng Hoàng Phúc	</td>
                      <td>
                        40.650.000 đ	
                      </td>
                      <td><span class="badge bg-danger">Đã hủy	</span></td>
                    </tr>
                  </tbody>
                </table>
              </div>
              <!-- / div trống-->
            </div>
           </div>
            <!-- / col-12 -->
             <!-- col-12 -->
            <div class="col-md-12">
                <div class="tile">
                  <h3 class="tile-title">Khách hàng mới</h3>
                <div>
                  <table class="table table-hover">
                    <thead>
                      <tr>
                        <th>ID</th>
                        <th>Tên khách hàng</th>
                        <th>Ngày sinh</th>
                        <th>Số điện thoại</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>#183</td>
                        <td>Hột vịt muối</td>
                        <td>21/7/1992</td>
                        <td><span class="tag tag-success">0921387221</span></td>
                      </tr>
                      <tr>
                        <td>#219</td>
                        <td>Bánh tráng trộn</td>
                        <td>30/4/1975</td>
                        <td><span class="tag tag-warning">0912376352</span></td>
                      </tr>
                      <tr>
                        <td>#627</td>
                        <td>Cút rang bơ</td>
                        <td>12/3/1999</td>
                        <td><span class="tag tag-primary">01287326654</span></td>
                      </tr>
                      <tr>
                        <td>#175</td>
                        <td>Hủ tiếu nam vang</td>
                        <td>4/12/20000</td>
                        <td><span class="tag tag-danger">0912376763</span></td>
                      </tr>
                    </tbody>
                  </table>
                </div>

              </div>
            </div>
             <!-- / col-12 -->
        </div>
      </div>
      <!--END left-->
      <!--Right-->
      <div class="col-md-12 col-lg-6">
        <div class="row">
          <div class="col-md-12">
            <div class="tile">
              <h3 class="tile-title">Dữ liệu 6 tháng đầu vào</h3>
              <div class="embed-responsive embed-responsive-16by9">
                <canvas class="embed-responsive-item" id="lineChartDemo"></canvas>
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="tile">
              <h3 class="tile-title">Thống kê 6 tháng doanh thu</h3>
              <div class="embed-responsive embed-responsive-16by9">
                <canvas class="embed-responsive-item" id="barChartDemo"></canvas>
              </div>
            </div>
          </div>
        </div>

      </div>
      <!--END right-->
    </div>


    <div class="text-center" style="font-size: 13px">
      <p><b>Copyright
          <script type="text/javascript">
            document.write(new Date().getFullYear());
          </script> Phần mềm quản lý bán hàng | Dev By Trường
        </b></p>
    </div>
>>>>>>> 48c24c3c4e8d12128567d42a2ca47ef9f1a79ce2
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
<<<<<<< HEAD

=======
>>>>>>> 48c24c3c4e8d12128567d42a2ca47ef9f1a79ce2
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
<<<<<<< HEAD
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
=======
>>>>>>> 48c24c3c4e8d12128567d42a2ca47ef9f1a79ce2

</html>