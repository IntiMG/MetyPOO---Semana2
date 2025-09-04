package run;

import models.Bus;
import models.Cooperative;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("M10259", 30);
        Bus bus2 = new Bus("M95618", 40);
        Bus bus3 = new Bus("CZ78451", 45);

        List<Bus> buses = new ArrayList<>();
        buses.add(bus1);
        buses.add(bus2);
        buses.add(bus3);

        Cooperative coop = new Cooperative("Transporte del Norte", buses);

        coop.printCoopInfo();

        coop = null;
        System.out.println();
        System.out.println("Buses sin coop:");
        int cont = 1;
        for (Bus bus : buses) {
            System.out.println("bus #" + cont + " : " + bus);
        }

    }
}
