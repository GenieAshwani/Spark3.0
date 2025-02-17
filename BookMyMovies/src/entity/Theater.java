package entity;

public class Theater {
   private int theaterId;
    private String name;
    private String city;

    public Theater(int theaterId, String name, String city) {
        this.theaterId = theaterId;
        this.name = name;
        this.city = city;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
