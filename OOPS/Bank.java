public class Bank {
    Integer bankAccountNumber;
    String accountHolder;
    String bankName;
    Integer bankCode;
    Integer balance;
    public String password;

    public Bank(Integer bankAccountNumber, String accountHolder, String bankName, Integer bankCode, Integer balance) {
        this.bankAccountNumber = bankAccountNumber;
        this.accountHolder = accountHolder;
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.balance = balance;
    }

    void setPassword(String passW) {
        password = passW;
    }

    String getPassword() {
        return password;
    }

    void printDetails() {
        System.out.println(bankAccountNumber);
        System.out.println(accountHolder);
        System.out.println(bankName);
        System.out.println(bankCode);
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Bank b1 = new Bank(13749, "Priyanshu Raj", "UCO BANK", 345, 1000000000);
        b1.printDetails();
        b1.password = "aksjddhdnywbdfiuw1234";
        System.out.println(b1.getPassword());
    }
}
