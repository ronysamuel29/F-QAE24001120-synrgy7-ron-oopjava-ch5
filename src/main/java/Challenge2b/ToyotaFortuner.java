package Challenge2b;

public class ToyotaFortuner extends Car{
    public ToyotaFortuner() {
        super("Manual", 80); // Fortuner dengan transmisi manual, kapasitas 80 liter
    }

    // Method khusus untuk Fortuner
    public void engage4WD() {
        System.out.println("4WD diaktifkan.");
    }
}
