package models;

import java.util.ArrayList;
import java.util.List;

public class House {
    List<Room> rooms = new ArrayList<>();

    public House() {
        addRooms("Baño");
        addRooms("Cocina");
        addRooms("Cuarto");
        addRooms("Bodega");
    }

    public void addRooms(String name){
        rooms.add(new Room(name));

    }

    public void printHouseRooms() {
        System.out.println("House Rooms");
        for (Room r : rooms) {
            System.out.println(r.getName());
        }
    }
}
