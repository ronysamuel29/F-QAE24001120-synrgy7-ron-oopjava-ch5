package Challenge1;

import java.util.*;

public class Challenge1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Lama parkir (jam): ");
        float N = scanner.nextFloat();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N <= 5) {
            System.out.println("Total Pembayaran $" + 1);
        } else if (N > 5 && N < 24) {
            System.out.println("Total Pembayaran $" + (((N - 5) * 0.5) +1));
        } else if (N > 24 && N % 24 != 0) {
            System.out.println("Total Pembayaran $" + ((((N-N%24)/24)*15)+((N%24)*0.5)));
        } else {
            System.out.println("Total Pembayaran $" + (N / 24) * 15);
        }
        scanner.close();
    }
}
