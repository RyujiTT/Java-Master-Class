public class Main {
    public static void main(String[] args) {
//        BankAccount ryujisAccount = new BankAccount("12345", 1000.00, "Ryuji Tanabe", "myemail@gmail.com", "(087) 123-4567");
//        BankAccount ryujisAccount = new BankAccount();
//        ryujisAccount.setAccountNumber("12345");
//        ryujisAccount.setAccountBalance(1000.00);
//        ryujisAccount.setCustomerName("Ryuji");
//        System.out.println(ryujisAccount.getAccountNumber());
//        System.out.println(ryujisAccount.getCustomerEmail());
//        ryujisAccount.depositFunds(349.4);
//        ryujisAccount.withdrawFunds(100.0);
//
//        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
//        System.out.println("AccountNo: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getCustomerName());

        Customer bobCustomer = new Customer("Bob", "bob@email.com");
        System.out.println(bobCustomer.getCreditLimit());
        System.out.println(bobCustomer.getEmailAdress());
        System.out.println(bobCustomer.getName());

        Customer customer = new Customer();
        System.out.println(customer.getName());
        System.out.println(customer.getEmailAdress());
        System.out.println(customer.getCreditLimit());


    }
}