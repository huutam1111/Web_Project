package Model;

import java.io.Serializable;

public class Post implements Serializable {
    private int idPost;
    private String title;
    private String content;
<<<<<<< HEAD
    private String body;
=======
    private String body ;
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
    private String made;
    private String images;
    private int coverNumber;
    private int idCompany;
    private int yearOfManuFacture;
    private int status;
    private String gear;
    private String fuel;
    private float price;

<<<<<<< HEAD

    public Post(int idPost, String title, String content, String body, String made, String images, int coverNumber, int idCompany, int yearOfManuFacture, int status, String fuel, float price) {
=======
    public Post(int idPost, String title, String content, String body, String made, String images, int coverNumber, int idCompany, int yearOfManuFacture, int status,  String fuel, float price,String gear) {
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
        this.idPost = idPost;
        this.title = title;
        this.content = content;
        this.body = body;
        this.made = made;
        this.images = images;
        this.coverNumber = coverNumber;
        this.idCompany = idCompany;
        this.yearOfManuFacture = yearOfManuFacture;
        this.status = status;
<<<<<<< HEAD
=======
        this.gear = gear;
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
        this.fuel = fuel;
        this.price = price;
    }

<<<<<<< HEAD
    public Post(int idPost, String title, String content, String body, String made, String images, int coverNumber, int idCompany, int yearOfManuFacture, int status, String fuel, float price, String gear) {
        this.idPost = idPost;
        this.title = title;
        this.content = content;
        this.body = body;
        this.made = made;
        this.images = images;
        this.coverNumber = coverNumber;
        this.idCompany = idCompany;
        this.yearOfManuFacture = yearOfManuFacture;
        this.status = status;
        this.fuel = fuel;
        this.price = price;
    }

=======
    public Post(int anInt, String string, String string1, String string2, String string3, String string4, boolean aBoolean, int anInt1, int anInt2, boolean aBoolean1, String string5, double aDouble) {
    }

    @Override
    public String toString() {
        return "Post{" +
                "idPost=" + idPost +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", body='" + body + '\'' +
                ", made='" + made + '\'' +
                ", images='" + images + '\'' +
                ", coverNumber=" + coverNumber +
                ", idCompany=" + idCompany +
                ", yearOfManuFacture=" + yearOfManuFacture +
                ", status=" + status +
                ", gear='" + gear + '\'' +
                ", fuel='" + fuel + '\'' +
                ", price=" + price +
                '}';
    }
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public int getCoverNumber() {
        return coverNumber;
    }

    public void setCoverNumber(int coverNumber) {
        this.coverNumber = coverNumber;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public int getYearOfManuFacture() {
        return yearOfManuFacture;
    }

    public void setYearOfManuFacture(int yearOfManuFacture) {
        this.yearOfManuFacture = yearOfManuFacture;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

<<<<<<< HEAD

=======
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
<<<<<<< HEAD
    public String getImg(){
        String rs=this.images.split("\\|\\|")[0];
        return rs;
    }
    @Override
    public String toString() {
        return "Post{" +
                "idPost=" + idPost +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", body='" + body + '\'' +
                ", made='" + made + '\'' +
                ", images='" + images + '\'' +
                ", coverNumber=" + coverNumber +
                ", idCompany=" + idCompany +
                ", yearOfManuFacture=" + yearOfManuFacture +
                ", status=" + status +
                ", fuel='" + fuel + '\'' +
                ", price=" + price +
                '}';
=======
    public String getSrcFirst(){
        return images.split("||")[0];
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116

    }
}
