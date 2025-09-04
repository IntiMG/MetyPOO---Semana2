package models;
import java.util.List;

public class Cooperative {
    private String name;
    private List<Bus> buses;

    public Cooperative(String name, List<Bus> buses) {
        this.name = name;
        this.buses = buses;
    }

    public void printCoopInfo() {
        System.out.println("Cooperative " + name);
        int cont = 1;
        for (Bus bus : buses) {
            System.out.println("- Bus #" + cont + ": " + bus);
            cont++;
        }
    }
}
