/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SayefReyadh
 */
public class BillItemModel {

    private int quantity;
    private int amount;
    private String billInfoString;

    public BillItemModel() {
    }

    public BillItemModel(int quantity, int amount, String billInfoString) {
        this.quantity = quantity;
        this.amount = amount;
        this.billInfoString = billInfoString;
    }

    public BillItemModel(int amount, String billInfoString) {
        this.amount = amount;
        this.billInfoString = billInfoString;
        this.quantity = 1;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBillInfoString() {
        return billInfoString;
    }

    public void setBillInfoString(String billInfoString) {
        this.billInfoString = billInfoString;
    }

    @Override
    public String toString() {
        return billInfoString + "#" + quantity + "#" + amount;
    }

}
