public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public void depositFunds(double depositAmount){

        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount){

        if(accountBalance - withdrawalAmount < 0){
            System.out.println("Insufficient Funds! You only have $" + accountBalance + " in your account");
        }else {
            accountBalance -=withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + accountBalance);
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
