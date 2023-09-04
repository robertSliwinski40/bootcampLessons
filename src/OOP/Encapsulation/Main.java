package OOP.Encapsulation;

//we can make class and its attributes hidden from other class using encapsulation

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Amigos", BigDecimal.TEN, false);

        System.out.println(account.withdraw(new BigDecimal("9.0")));
        System.out.println(account.getBalance());

        System.out.println();
        System.out.println(account.withdraw(new BigDecimal("1.0")));
        System.out.println(account.getBalance());

        System.out.println();
        System.out.println(account.withdraw(new BigDecimal("100.0")));
        System.out.println(account.getBalance());

        System.out.println();
        account.setBalance( new BigDecimal("100000.0"));
        System.out.println(account.getBalance());

    }
    }

