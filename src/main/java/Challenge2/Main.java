package Challenge2;
import java.util.*;


// Kelas utama untuk demonstrasi
public class Main {
    public static void main(String[] args) {
        // Objek BankAccount
        BankAccount myAccount = new BankAccount("1234567890", 1000000, "Rony", "rony.rich@email.com", "081234567890");

        // selamat datang ke user
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelamat datang " +myAccount.getCustomerName()+ " di Layanan Bank!");
        System.out.println("Informasi Rekening:");
        System.out.println("No. Rekening: " + myAccount.getAccountNumber());
        System.out.println("Saldo Awal: " + myAccount.getBalance());

        while (true) {
            System.out.println("\nSilakan Pilih layanan untuk anda:\n" + "1. Deposit\n" + "2. Withdraw\n" + "3. Cek Saldo\n" + "4. Keluar");
            System.out.println("ketik pilihan anda: ");
            int choice = scanner.nextInt();
            double depo;
            double withdraw;

            switch (choice) {
                case 1:
                    System.out.print("Jumlah deposit: $");
                    depo = scanner.nextDouble();
                    myAccount.deposit(depo);
                    break;
                case 2:
                    System.out.print("Jumlah withdrawal: $");
                    withdraw = scanner.nextDouble();
                    myAccount.withdraw(withdraw);
                    break;
                case 3:
                    System.out.println("Saldo Terbaru: $" + myAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Terima kasih. Selamat tinggal!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}