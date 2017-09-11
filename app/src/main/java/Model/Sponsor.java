package Model;

/**
 * Created by sarthak on 10/9/17.
 */

public class Sponsor {
    public int getLogoID() {
        return logoID;
    }

    public void setLogoID(int logoID) {
        this.logoID = logoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Sponsor(int logoID, String name, String company) {
        this.logoID = logoID;
        this.name = name;
        this.company = company;
    }

    int logoID;
    String name,company;

}
