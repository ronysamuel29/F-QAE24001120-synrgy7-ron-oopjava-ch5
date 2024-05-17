package Challenge2;


public class BankAccount {
    //field
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //constructor
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    //setter & getter
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    //method deposit dan withdraw balance
    public void deposit(double depo) {
        if (depo > 0) {
            balance += depo;
            System.out.println("Deposit sebesar " + depo + " berhasil." + "Saldo terbaru: " + balance);
        } else {
            System.out.println("Jumlah deposit tidak valid.");
        }
    }
    public void withdraw(double withdraw) {
        if (withdraw > 0 && withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Penarikan  sebesar " + withdraw + " berhasil." + "Saldo terbaru:" + balance);
        } else {
            System.out.println("Saldo tidak mencukupi atau jumlah penarikan tidak valid.");
        }
    }
}
