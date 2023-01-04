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






