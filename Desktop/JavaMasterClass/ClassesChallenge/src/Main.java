public class Main {
    public static void main(String[] args) {
        BankAccount ryujisAccount = new BankAccount();

        ryujisAccount.setAccountNumber("12345");
        ryujisAccount.setAccountBalance(1000.00);
        ryujisAccount.setCustomerName("Ryuji");
        ryujisAccount.depositFunds(349.4);
        ryujisAccount.withdrawFunds(100.0);
    }
}