public class CheckingAccount extends BankAccount {

private static final double OVERALL_FEE = 0.15;

public CheckingAccount(String name, double initialAmount) {
super(name, initialAmount);
setAccountNumber(getAccountNumber() + "-10");
}

public boolean withdraw(double amount) {
amount += OVERALL_FEE;
return super.withdraw(amount);
}

}