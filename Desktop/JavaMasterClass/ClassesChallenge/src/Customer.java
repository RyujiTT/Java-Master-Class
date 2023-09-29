public class Customer {
    private String customerName;
    private double creditLimit;
    private String emailAdress;

    public Customer(String name, double creditLimit, String email){
        System.out.println("Customer constructor with parameters called");
        customerName = name;
        this.creditLimit = creditLimit;
        emailAdress = email;
    }

    public Customer() {
        this("Ryuji", 1000.00, "ryuji@email.com");
        System.out.println("Customer constructor with no parameters called");
    }

    public Customer(String customerName, String emailAdress) {
        this(customerName, 500.55, emailAdress);
    }

    public String getName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
