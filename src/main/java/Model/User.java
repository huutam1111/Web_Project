package Model;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private String passWord;
    private String fullName;
    private String email;
    private String phone;
    private String avatar;
    private String address;

    public User(String userName, String passWord, String fullName, String email, String phone, String avatar, String address) {
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.avatar = avatar;
        this.address = address;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 48c24c3c4e8d12128567d42a2ca47ef9f1a79ce2
}

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
<<<<<<< HEAD
=======
=======
>>>>>>> 48c24c3c4e8d12128567d42a2ca47ef9f1a79ce2
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
>>>>>>> 623fd91ad75cef09889378b07ed5a66796159242
    }
}
