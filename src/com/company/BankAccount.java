package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount = amount +sum;
    }

    public void withDraw(int sum) throws LimitException{
        if (amount < sum)
            throw new LimitException("не достаточно количество средст ждя снятия 20000 сомов" , amount);
         else amount -= sum;

    }
}
