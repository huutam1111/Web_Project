
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






