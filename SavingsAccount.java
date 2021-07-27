public class SavingsAccount extends BankAccount {

private double rate;
private int savingsNumber = -1;
private String accountNumber;

public SavingsAccount(String name, double initialBalance) {
super(name, initialBalance);
accountNumber = "";
rate = 2.5;
}

public SavingsAccount(SavingsAccount oldAccount, double amount) {
super(oldAccount, amount);
savingsNumber++;
}

public void postInterest() {
rate = ((rate / 100) / 12);
setBalance((getBalance() * rate) + getBalance());
}

public String getAccountNumber() {
savingsNumber++;
accountNumber = super.getAccountNumber() + "-" + savingsNumber;
return accountNumber;
}

}