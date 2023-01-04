package Model;

public class Order {
    private int id;
    private String fullName;
    private String phone;
    private String address;
    private String productName;
    private int quantity;
    private  double total;
    private int status;

    public Order(int id, String fullName, String phone, String address, String productName, int quantity, double total, int status) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.productName = productName;
        this.quantity = quantity;
        this.total = total;
        this.status = status;
    }
    public Order( String fullName, String phone, String address, String productName, int quantity, double total, int status) {
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.productName = productName;
        this.quantity = quantity;
        this.total = total;
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
