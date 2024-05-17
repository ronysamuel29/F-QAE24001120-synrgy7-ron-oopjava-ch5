package Challenge2b;

public class Vehicle {
    protected int numWheels;

    public Vehicle(int numWheels) {
        this.numWheels = numWheels;
    }

    public void moveForward() {
        System.out.println("Kendaraan bergerak maju.");
    }

    public void turn(String direction) {
        System.out.println("Kendaraan berbelok ke " + direction);
    }
}
