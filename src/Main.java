public class Main {
    public static void main(String[] args) {

        //1. Bank Account
        BankAccount user1 = new BankAccount(500, "Arthur");
        user1.deposit(100);
        user1.withdrawal(50);
        user1.statement();

        //2.  Bank Transfer
        BankAccount userId001 = new BankAccount(5000, "Tahirah");
        BankAccount userId002 = new BankAccount(300, "Thomas");
        
        userId001.withdrawal(100);
        userId001.statement();

        userId002.deposit(100);
        userId002.statement();

    }
}
