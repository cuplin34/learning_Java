public class bankAccount {
    private int accountNumber;
    private double accountBalance;
    private String email;

    public bankAccount(int accountNumber, double accountBalance, String email){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.email = email;
    }

    public bankAccount(String email){
        this(-1, 0, email);
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public String getEmail(){
        return email;
    }

    public double deposit(double deposit){
        if(deposit < 0){
            System.out.println("invalid deposit amount.");
            return -1;
        }
        accountBalance += deposit;
        return accountBalance;
    }

    public double withdraw(double withdrawal){
        if(withdrawal > accountBalance){
            System.out.println("Insufficient funds to withdraw");
            return -1;
        }
        accountBalance -= withdrawal;
        return accountBalance;
    }
}
