package OOP.Encapsulation;

import java.math.BigDecimal;
import java.util.Objects;

import static java.math.BigDecimal.ZERO;

//Through encapsulation, we can hide data
public class BankAccount {
    private String name;
    private BigDecimal balance;
    private boolean hasOverdraft;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BankAccount(String name, BigDecimal balance, boolean hasOverdraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public BankAccount(String name) {
        this.name = name;
        this.balance = ZERO;
        this.hasOverdraft = false;
    }

    public BankAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public BigDecimal withdraw (BigDecimal amount){
        if (balance.subtract(amount).compareTo(ZERO)>= 0){
             this.balance = this.balance.subtract(amount);
             return amount;
        }else{
            System.out.println("Not enough money. Withdraw can not be done");
            return ZERO;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount account = (BankAccount) o;
        return hasOverdraft == account.hasOverdraft && Objects.equals(name, account.name) && Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance, hasOverdraft);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }
}
