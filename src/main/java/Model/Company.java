package Model;

<<<<<<< HEAD

=======
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
import java.io.Serializable;

public class Company implements Serializable {
    private int id;
    private String name;
    private String logo;

    public Company(int id, String name, String logo) {
        this.id = id;
        this.name = name;
        this.logo = logo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD

=======
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
<<<<<<< HEAD

=======
>>>>>>> 99dc4b74c317afab44efdc60fe20e6155e0da116
}
