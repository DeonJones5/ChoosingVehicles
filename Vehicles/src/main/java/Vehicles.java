public class Vehicles {
    private String name;
    private String cost;

    public Vehicles(String name, String cost) {
        this.name = name;
        this.cost = cost;
    }

    public Vehicles() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
