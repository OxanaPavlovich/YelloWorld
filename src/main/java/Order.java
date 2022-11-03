public class Order {
    String name;
    int weight;
    int address;

    public Order(String name, int address) {
        this.address = address;
        this.name = name;
    }
    public Order(String name, int weight, int address) {
        this.name = name;
        this.weight = weight;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", address=" + address +
                '}';
    }
}

