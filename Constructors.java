package com.example.constructors;

public class Constructors {
    public static void main(String[] args) {

        Account bobsAccount = new Account("12345", 0.00, "Bob Brown",
                "myemail@bob.com", "(087) 123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        System.out.println("");

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Bob", 25000);
        System.out.println("Name " + vipCustomer2.getName() + ", credit limit " + vipCustomer2.getCreditLimit());

        VipCustomer vipCustomer3 = new VipCustomer("Tim", 100, "tim@email.com");
        System.out.println("Name " + vipCustomer3.getName() + ", credit limit " + vipCustomer3.getCreditLimit() +
                ", email " + vipCustomer3.getEmailAddress());
    }
}
