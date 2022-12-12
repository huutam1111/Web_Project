<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login/Register</title>
    <link rel="stylesheet" href="../Style.css">
    <link rel="stylesheet"
          href="https://mdbcdn.b-cdn.net/wp-content/themes/mdbootstrap4/docs-app/css/dist/mdb5/standard/core.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
    <link rel="stylesheet" href="https://oto.com.vn/member/Styles/web/postnew-quick.css?v=638035266443576953">
    <link rel="stylesheet" href="https://oto.com.vn/Scripts/swiper-6.3.3/swiper-bundle.min.css">
    <link rel="stylesheet" href="https://oto.com.vn/Styles/v2.0/common.css?v=638035266443576953">
    <link rel="stylesheet" href="https://oto.com.vn/Styles/v2.0/theme.css?v=638035266443576953">
    <link rel="stylesheet" href="https://oto.com.vn/member/Styles/web/post_news.css?v=638035266443576953">
    <link rel="stylesheet" href="https://oto.com.vn/member/Styles/web/postnew-quick.css?v=638035266443576953">
    <link rel="stylesheet" href="https://oto.com.vn/node_modules/@angular/material/prebuilt-themes/indigo-pink.css">
    <link rel="stylesheet" href="Login_Register.css">
</head>
<body>
<div class="container" style="margin-top: 50px">
    <div class="wrapper">
        <ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
            <li class="nav-item" role="presentation">
                <a class="nav-link active" id="tab-login" data-mdb-toggle="pill" href="#pills-login" role="tab"
                   aria-controls="pills-login" aria-selected="true">Login</a>
            </li>
            <li class="nav-item" role="presentation">
                <a class="nav-link" id="tab-register" data-mdb-toggle="pill" href="#pills-register" role="tab"
                   aria-controls="pills-register" aria-selected="false">Register</a>
            </li>
        </ul>
        <!-- Pills navs -->

        <!-- Pills content -->
        <div class="tab-content">
            <div class="tab-pane fade show active" id="pills-login" role="tabpanel" aria-labelledby="tab-login">
                <form>
                    <div class="text-center mb-3">
                        <p>Sign in with</p>
                    </div>

                    <!-- Email input -->
                    <div class="form-outline mb-4">
                        <input type="text" id="loginName" class="form-control"/>
                        <label class="form-label" for="loginName">Email or username</label>
                    </div>

                    <!-- Password input -->
                    <div class="form-outline mb-4">
                        <input type="password" id="loginPassword" class="form-control"/>
                        <label class="form-label" for="loginPassword">Password</label>
                    </div>

                    <!-- 2 column grid layout -->
                    <div class="row mb-4">
                        <div class="col-md-6 d-flex justify-content-center">
                            <!-- Checkbox -->
                            <div class="form-check mb-3 mb-md-0">
                                <input class="form-check-input" type="checkbox" value="" id="loginCheck" checked/>
                                <label class="form-check-label" for="loginCheck"> Remember me </label>
                            </div>
                        </div>

                        <div class="col-md-6 d-flex justify-content-center">
                            <!-- Simple link -->
                            <a href="#!">Forgot password?</a>
                        </div>
                    </div>

                    <!-- Submit button -->
                    <button type="submit" class="btn btn-primary btn-block mb-4 login">Login</button>
                    <!-- Register buttons -->
                    <div class="text-center">
                        <a class="back-home" href="/index.jsp">
                            <i class="fa-solid fa-backward"></i>
                            Back To Home
                        </a>
                    </div>
                </form>
            </div>
            <div class="tab-pane fade" id="pills-register" role="tabpanel" aria-labelledby="tab-register">
                <form>
                    <p class="text-center">Register</p>

                    <!-- Name input -->
                    <div class="form-outline mb-4">
                        <input type="text" id="registerUsername" class="form-control"/>
                        <label class="form-label" for="registerUsername">Username</label>
                    </div>
                    <!-- Full Name input -->
                    <div class="form-outline mb-4">
                        <input type="text" id="registerFullname" class="form-control"/>
                        <label class="form-label" for="registerUsername">Username</label>
                    </div>

                    <!-- Email input -->
                    <div class="form-outline mb-4">
                        <input type="email" id="registerEmail" class="form-control"/>
                        <label class="form-label" for="registerEmail">Email</label>
                    </div>
                    <%--                 Phone Number --%>
                    <div class="form-outline mb-4">
                        <input type="number" id="registerSdt" class="form-control"/>
                        <label class="form-label" for="registerEmail">Phone Number</label>
                    </div>

                    <!-- Password input -->
                    <div class="form-outline mb-4">
                        <input type="password" id="registerPassword" class="form-control"/>
                        <label class="form-label" for="registerPassword">Password</label>
                    </div>

                    <!-- Repeat Password input -->
                    <div class="form-outline mb-4">
                        <input type="password" id="registerRepeatPassword" class="form-control"/>
                        <label class="form-label" for="registerRepeatPassword">Repeat password</label>
                    </div>
                    <div class="upload">
                        <div style="text-align: center" class="swiper-container">
                            <ul class="list-thumb-gallery  default-theme" id="uploadimage"><input style="display: none"
                                                                                                  multiple=""
                                                                                                  class="fileupload input-hidden"
                                                                                                  type="file">
                                <li class="upload-item working-upload-item add"><a class="add-img"><i
                                        class="icon-plus"></i><span class="txt-add">Thêm ảnh</span></a></li>
                                <div class="imgContainer">
                                    <img class="uploadImg" src="" alt="Err">
                                </div>
                            </ul>

                            <div class="swiper-scrollbar"></div>
                        </div>
                    </div>
                    <!-- Checkbox -->
                    <div class="form-check d-flex justify-content-center mb-4">
                        <input class="form-check-input me-2" type="checkbox" value="" id="registerCheck" checked
                               aria-describedby="registerCheckHelpText"/>
                        <label class="form-check-label" for="registerCheck">
                            I have read and agree to the terms
                        </label>
                    </div>


                    <!-- Submit button -->
                    <button type="submit" class="btn btn-primary btn-block mb-3 register">Register</button>
                    <div style="text-align: center">
                        <a class="back-home" href="/index.jsp">
                            <i class="fa-solid fa-backward"></i>
                            Back To Home
                        </a>
                    </div>

                </form>
            </div>
        </div>
        <!-- Pills content -->

    </div>

</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script type="text/javascript"
        src="https://mdbcdn.b-cdn.net/wp-content/themes/mdbootstrap4/docs-app/js/dist/mdb5/standard/core.min.js"></script>
<script>
    document.querySelector(".upload-item").addEventListener("click", (e) => {
        document.querySelector(".fileupload").click()
    })
</script>
<script>
    $('#login')
    $('.login').bind('click', function (e) {
        e.preventDefault()
        $.ajax({
            url: "/login",
            type: "POST",
            data: {
                "username": $("#loginName").val(),
                "password": $("#loginPassword").val(),
            },
            contentType: "application/x-www-form-urlencoded",
            success: (data) => {
                alert("đăng nhập thành công")
                window.location.pathname = "/index.jsp"
            }
        })
    });

</script>
<script>
    const resetForm = () => {
        $("#registerUsername").val("")
        $("#registerFullname").val("")
        $("#registerEmail ").val("")
        $("#registerSdt ").val("")
        $("#registerPassword ").val("")
        $("#registerRepeatPassword").val("")
    }
    const handleForm = (name, fullName, email, sdt, passRepeat, pass, imgRequest) => {
        if (pass == passRepeat && name && fullName && email && sdt && pass && imgRequest) {
            console.log("cung ok")
            console.log(name)
            console.log(fullName)
            console.log(imgRequest)
            return true
        }
        return false
    }
    let imgRequest = ""
    $(".fileupload").bind("change", (e) => {
        var file = document.querySelector(".fileupload").files[0];
        var reader = new FileReader();
        reader.onloadend = function() {
            imgRequest= reader.result
            console.log(imgRequest)
        }
        reader.readAsDataURL(file);
    })
    $(".register").bind("click", function (e) {
        e.preventDefault()
        const name = $("#registerUsername").val()
        const fullName = $("#registerFullname").val()
        const email = $("#registerEmail ").val()
        const sdt = $("#registerSdt ").val()
        const pass = $("#registerPassword ").val()
        const passRepeat = $("#registerRepeatPassword").val()
        if (handleForm(name, fullName, email, sdt, passRepeat, pass, imgRequest)) {
            dataBody = {
                name: name,
                fullName: fullName,
                email: email,
                phone: sdt,
                pass: pass,
                avatar: imgRequest
            }
            $.ajax({
                url: "/register",
                type: "POST",
                data: dataBody,
                contentType: "application/x-www-form-urlencoded",
                success: function (data) {
                    if (data['message'] == "register success") {
                        alert("đăng kí thành công")
                        resetForm()
                    } else {
                        alert("đăng kí không thành công")
                    }

                }
            });
        } else {
            alert("Form sai định dạng")
        }


    })
</script>
</html>
