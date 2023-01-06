package Model;

public class Post {
    private int idPost;
    private String title;
    private String content;
    private String body ;
    private String made;
    private String images;
    private boolean coverNumber;
    private int idCompany;
    private int yearOfManuFacture;
    private boolean status;
    private String fuel;
    private double price;

    public Post() {

    }

    public Post(int idPost, String title, String content, String body, String made, String images, boolean coverNumber, int idCompany, int yearOfManuFacture, boolean status, String fuel, double price) {
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
    }
}
