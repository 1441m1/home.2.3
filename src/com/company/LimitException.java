package com.company;

public class LimitException extends Exception {
    private String message;
    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        this.message = message;
        this.remainingAmount = remainingAmount;
    }

    public String getMessage() {
        return message;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
