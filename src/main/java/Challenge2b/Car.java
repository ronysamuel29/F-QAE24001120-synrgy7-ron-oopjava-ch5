package Challenge2b;

public class Car extends Vehicle{
    private int fuelCapacity;
    private String transmissionType;

    public Car(String transmissionType, int fuelCapacity) {
        super(4); // Mobil memiliki 4 roda
        this.fuelCapacity = fuelCapacity;
        this.transmissionType = transmissionType;
    }

    public void shiftGear(int gear) {
        System.out.println("Pindah gigi ke " + gear);
    }

    @Override // Override method dari Vehicle
    public void moveForward() {
        System.out.println("Mobil bergerak maju dengan transmisi " + transmissionType);
    }
}
