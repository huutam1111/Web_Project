<%@ page import="java.util.ArrayList" %>
<%@ page import="Model.User" %><%--
  Created by IntelliJ IDEA.
  User: 84348
  Date: 1/4/2023
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en"><head>
  <meta charset="utf-8">

  <title>Profile</title>
  <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/js/bootstrap.bundle.min.js"></script>
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

</head>
<body style="">
<jsp:include page="../Component/header/Header.jsp"/>

<div class="container">
  <br>
  <% User user = (User) request.getAttribute("userInfo") ;%>
  <div class="row flex-lg-nowrap">
    <div class="col-12 col-lg-auto mb-3" style="width: 200px;">

    </div>

    <div class="col">
      <div class="row">
        <div class="col mb-3">
          <div class="card">
            <div class="card-body">
              <div class="e-profile">
                <div class="row">
                  <div class="col-12 col-sm-auto mb-3">
                    <div class="mx-auto" style="width: 140px;">
                      <div class="d-flex justify-content-center align-items-center rounded" style="height: 140px; background-color: rgb(233, 236, 239);">
                        <span style="color: rgb(166, 168, 170); font: bold 8pt Arial;"><img src="<%=user.getAvatar()%>" id="" alt="" width="140px" height="140px" srcset=""></span>
                      </div>
                    </div>
                  </div>
                  <div class="col d-flex flex-column flex-sm-row justify-content-center mb-3">
                    <div class="text-center text-sm-left mb-2 mb-sm-0">
                      <h4 class="pt-sm-2 pb-1 mb-0 text-nowrap"><%=user.getFullName()%></h4>
                      <p class="mb-0">@<%=user.getUserName()%></p>
                      <div class="mt-2">

                        <button class="btn btn-primary" type="button" style="width: 100%; position: relative;">
                          <i class="fa fa-fw fa-camera"></i>
                          <div >
                            <form action="profile?action=changeAvatar" method="POST" enctype="multipart/form-data">
                              <input type="file" id="uploadFile" name="file" oninput="handleAvatar(this)" style="position: absolute; top: 0; bottom: 0; left: 0; right: 0; opacity: 0;">

                              <span>Change Photo</span>
                              <div id="applyChange" class="hide" style="position: fixed; top: 0; left: 0;right: 0; bottom: 0; z-index: 9999; background-color: rgba(142,142,142,0.46); display: flex; justify-content: center; align-items: center">
                                <div style="width: 400px; height: 300px; box-shadow: #8B8B8B 5px 5px 5px; border-radius: 10px; background-color: white; padding: 10px">
                                  <span style="color: rgb(166, 168, 170); font: bold 8pt Arial;"><img src="" id="imgAvatar" alt="" width="200px" height="200px" srcset="">
                                  </span>
                                  <br>
                                  <br>
                                  <br>

                                  <div style="display: flex; justify-content: center; gap: 20px; margin-top: 10px">
                                    <input type="button" onclick="cannel()" class="btn btn-primary" value="Cannel">
                                    <input type="submit" class="btn btn-primary" value="Apply">
                                  </div>
                                </div>
                              </div>
                            </form>

                          </div>
                        </button>
                      </div>
                    </div>
                    <div class="text-center text-sm-right">
                      <span class="badge badge-secondary"></span>
                      <div class="text-muted"><small></small></div>
                    </div>
                  </div>
                </div>
                <ul class="nav nav-tabs">
                  <li class="nav-item"><a href="#order" class="active nav-link" data-toggle="tab">Order</a></li>
                  <li class="nav-item"><a href="#edit" class=" nav-link" data-toggle="tab">Settings</a></li>


                </ul>
                <div class="tab-content pt-3">
                  <div  class="tab-pane " id="edit">
                    <form class="form" novalidate="" style="width: 100%" id="editProfile">
                      <div class="row">
                        <div class="col">
                          <div class="row">
                            <div class="col">
                              <div class="form-group">
                                <label>Full Name</label>
                                <input class="form-control" type="text" name="fullName" placeholder="John Smith" value="<%=user.getFullName()%>">
                              </div>
                            </div>
                            <div class="col">
                              <div class="form-group">
                                <label>Username</label>
                                <input class="form-control" type="text" name="username" disabled placeholder="johnny.s" value="<%=user.getUserName()%>">
                              </div>
                            </div>
                          </div>
                          <div class="row">
                            <div class="col">
                              <div class="form-group">
                                <label>Email</label>
                                <input class="form-control" type="text" name="email" placeholder="abc@gmail.com" value="<%=user.getEmail()%>">
                              </div>
                            </div>
                          </div>
                          <div class="row">
                            <div class="col">
                              <div class="form-group">
                                <label>Phone</label>
                                <input class="form-control" type="text" name="phone" value="<%=user.getPhone()%>">
                              </div>
                            </div>
                          </div>
                          <div class="row">
                            <div class="col">
                              <div class="form-group">
                                <label>Address</label>
                                <input class="form-control" type="text" name="address" placeholder="Phù Cát - Bình Định" value="<%=user.getAddress()%>">
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="row " id="changlePass">


                      </div>
                      <div class="row">

                        <div class="col">
                          <div class="form-group">
                            <button class="btn btn-primary" type="button" onclick="openFormChanglePass(this)">Thay đổi mật khẩu</button>
                          </div>
                        </div>

                      </div>
                      <hr>
                      <div class="row">
                        <div class="col d-flex justify-content-end">
                          <button class="btn btn-primary" onclick="formEdit()" type="button">Save Changes</button>
                        </div>
                      </div>
                    </form>

                  </div>
                  <div class="tab-pane active" id="order">
                    <div class="tile">
                      <h3 class="tile-title">Đơn hàng của bạn</h3>
                      <div>
                        <table class="table table-bordered">
                          <thead>
                          <tr>
                            <th>ID đơn hàng</th>
                            <th>Tên sản phẩm</th>
                            <th>Tổng tiền</th>
                            <th>Trạng thái</th>
                          </tr>
                          </thead>
                          <tbody id="table-order">




                          </tbody>
                        </table>
                      </div>

                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="col-12 col-md-3 mb-3">
          <div class="card mb-3">
            <div class="card-body">
              <div class="px-xl-3">
                <button class="btn btn-block btn-secondary" onclick="logout()">
                  <i class="fa fa-sign-out"></i>
                  <span>Logout</span>
                </button>
              </div>
            </div>
          </div>

        </div>
      </div>

    </div>
  </div>
</div>

</body>

<script >
  <%@include file="../javascrip/profileEdit.js" %>

  var changePass = false
  const openFormChanglePass = (ele)=>{
    changePass = !changePass
    let rs = `<div class="col">
    <div class="mb-2"><b>Change Password</b></div>
    <div class="row">
      <div class="col">
        <div class="form-group">
          <label>Current Password</label>
          <input class="form-control" type="password" name="oldpass" placeholder="••••••" value="">
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col">
        <div class="form-group">
          <label>New Password</label>
          <input class="form-control" type="password" name="passnew" placeholder="••••••">
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col">
        <div class="form-group">
          <label>Confirm <span class="d-none d-xl-inline">Password</span></label>
          <input class="form-control" name="repassnew" type="password" placeholder="••••••"></div>
      </div>
    </div>
  </div>`
    if(changePass){
      document.querySelector("#changlePass").innerHTML = rs
      ele.textContent = "Hủy"

    }else{

      document.querySelector("#changlePass").innerHTML = ``
      ele.textContent = "Thay đổi mật khẩu"

    }

  }
  const formEdit = ()=>{
    let checkNull= true;
    const form = document.getElementById("editProfile")
    const formData = new FormData(form);
    const formDataObject = Object.fromEntries(formData.entries());
    for (const property in formDataObject) {
      if(formDataObject[property] === ""){
        document.querySelector(`input[name ='${property}']`).style.border = 'solid 1px red'
        checkNull = false
      }
    }

    if(changePass){
      if(formDataObject.passnew != formDataObject.repassnew){
        document.querySelector(`input[name ='passnew']`).style.border = 'solid 1px red'
        document.querySelector(`input[name ='repassnew']`).style.border = 'solid 1px red'
        checkNull = false
      }

    }
    if(checkNull){
      formDataObject.fullName = encodeURIComponent(formDataObject.fullName)
      formDataObject.address = encodeURIComponent(formDataObject.address)
      console.log(formDataObject);
      $.ajax({
        url: "/profile?action=changeProfile",
        type: 'POST',
        data: formDataObject,
        contentType: 'application/x-www-form-urlencoded',
        success: function(res) {
          let rs = JSON.parse(res)
          if(rs === 1){
            window.location.pathname = "/profile"

          }else{
            alert(rs)
          }

        }
      });
    }else{
      console.log("Loi");
    }



  }


  const handleAvatar =(e)=>{

    const file = e.files[0];
    let image = document.querySelector("#imgAvatar")
    if(file){
      const src = URL.createObjectURL(file);
      image.src = src;
      document.querySelector("#applyChange").classList.remove("hide")

    }

  }
  const cannel = ()=>{
    document.querySelector("#applyChange").classList.add("hide")

  }
  const logout = ()=>{
    console.log("Logout")
    del_cookie("user")
    window.location.pathname="/"
  }
  function del_cookie(name) {
    document.cookie = name +
            '=; expires=Thu, 01-Jan-70 00:00:01 GMT;';
  }

  const getOrder = ()=>{
    let rs = ``
    $.ajax({
      url: "/order?action=listorder",
      type: 'GET',

      contentType: 'application/x-www-form-urlencoded',
      success: function(res) {
        let arrOrder  = JSON.parse(res).reverse()
        arrOrder.map((tmp)=>{
          rs+= `
    <tr>
                            <td>${tmp.id}</td>
                            <td style="overflow-wrap: break-word; max-width: 250px">${tmp.productName}</td>
                            <td>
                              ${tmp.total}
                            </td>
                           <td><span class="${tmp.status == 0 ? "badge bg-info" :  "badge badge bg-success"}">${tmp.status == 0? "Đang xử lý" :  "Đã hoàn thành"}</span></td>

                          </tr>
    `
        })
    document.querySelector("#table-order").innerHTML = rs
      }
    });


  }
  getOrder()





</script>

</html>