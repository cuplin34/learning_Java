public class Main {

    public static void main(String[] args) {
        bankAccount tester = new bankAccount(12345, 10000, "BC@yurp.com");
        bankAccount altnernate = new bankAccount("yurp@yurp.com");

        System.out.println(altnernate.getAccountNumber() + " " + altnernate.getAccountBalance() + " " + altnernate.getEmail());
        tester.deposit(1200);
        System.out.println(tester.getAccountBalance());
        tester.withdraw(12000);
        System.out.println(tester.getAccountBalance());

    }
}
