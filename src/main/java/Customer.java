import java.util.Scanner;

public class Customer extends Order {
    public Customer(String name, int address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", address=" + address +
                '}';
    }

    public boolean zakaz(String name1, int weight, int address1) {
        this.name = name1;
        this.weight = weight;
        this.address = address1;

        if (name == name1 && address == address1) {
          return true;
        } else {
           return false;

        }
    }
}







