package com.krukovska.parallelprogramming.lecture3;

public class AccountDanger {

    public static void main(String[] args) {
        Account account = new Account();
        var one = new Thread(account);
        var two = new Thread(account);
        one.setName("Fred");
        two.setName("Lucy");
        one.start();
        two.start();
    }
}

