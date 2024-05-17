package Challenge2b;

public class SuzukiKatana extends Car{
    public SuzukiKatana() {
        super("Manual", 12); // Katana dengan transmisi manual, kapasitas 12 liter
    }

    // Method khusus untuk Katana
    public void popWheelie() {
        System.out.println("Melakukan wheelie!");
    }
}
