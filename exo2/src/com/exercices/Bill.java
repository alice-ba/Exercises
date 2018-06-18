package com.exercices;

import java.util.Date;

public class Bill {

    private Date date;
    private int amount;
    private String description;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Bill(Date date, int amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }
}
