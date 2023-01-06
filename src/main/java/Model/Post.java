package Model;

public class Post {
    private int idPost;
    private String title;
    private String content;
    private boolean supportTest;
    private String images;
    private boolean coverNumber;
    private int idCompany;
    private int yearOfManuFacture;
    private boolean status;
    private boolean gear;
    private String fuel;
    private double price;

    public Post() {

    }

    public Post(int idPost, String title, String content, boolean supportTest, String images, boolean coverNumber, int idCompany, int yearOfManuFacture, boolean status, boolean gear, String fuel, double price) {
        this.idPost = idPost;
        this.title = title;
        this.content = content;
        this.supportTest = supportTest;
        this.images = images;
        this.coverNumber = coverNumber;
        this.idCompany = idCompany;
        this.yearOfManuFacture = yearOfManuFacture;
        this.status = status;
        this.gear = gear;
        this.fuel = fuel;
        this.price = price;
    }

    public Post(int anInt, String string, String string1, String string2, boolean aBoolean, String string3, boolean aBoolean1, String string4, int anInt1, boolean aBoolean2, boolean aBoolean3, String string5, double aDouble) {
    }

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

    public boolean isSupportTest() {
        return supportTest;
    }

    public void setSupportTest(boolean supportTest) {
        this.supportTest = supportTest;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public boolean isCoverNumber() {
        return coverNumber;
    }

    public void setCoverNumber(boolean coverNumber) {
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isGear() {
        return gear;
    }

    public void setGear(boolean gear) {
        this.gear = gear;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  idPost  + "-" + title + "-" + content + "-" + supportTest +"-" + images +"-" + coverNumber +"-" + idCompany + "-" + yearOfManuFacture +
                "-" + status +
                "-" + gear +
                "-" + fuel  +
                "-" + price ;
    }


}
