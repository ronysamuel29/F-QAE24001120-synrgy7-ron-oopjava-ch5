package Challenge2b;

public class HondaJazz extends Car{
    public HondaJazz() {
        super("Automatic", 40); // Jazz dengan transmisi otomatis, kapasitas 40 liter
    }

    // Method khusus untuk Jazz
    public void activateEcoMode() {
        System.out.println("Mode hemat bahan bakar diaktifkan.");
    }
}
