package models;

public class Bus {
    private String plate;
    private int capacity;

    public  Bus(String plate, int capacity) {
        this.plate = plate;
        this.capacity = capacity;
    }

    public String getPlate() {
        return plate;
    }
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "plate - " + plate + ", capacity - " + capacity;
    }
}
