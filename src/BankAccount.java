public class BankAccount {

    private int accountBalance;
    private String accountHolder;

    public BankAccount(int accountBalance, String accountHolder){
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder; 
    }

    public int deposit(int depositAmt) {
        return accountBalance += depositAmt;
    }

    public int withdrawal(int withdrawalAmt) {
        return accountBalance -= withdrawalAmt; 
    }

    public void statement() {
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Balance: " + this.accountBalance);

    }

}
