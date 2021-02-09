package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(5000000);
        boolean True= true;
        while(True){


            try {
                System.out.println(bankAccount.getAmount() + " som");
                bankAccount.withDraw(20000);
            }catch (LimitException ie){
                System.out.println(ie.getMessage());
                try{
                    bankAccount.withDraw((int) ie.getRemainingAmount());
                } catch (LimitException limieexception){
                    limieexception.getRemainingAmount();
                }
                System.out.println(bankAccount.getAmount()+ "som");
                True = false;
            }

        }

    }
}
