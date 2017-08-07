/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author SayefReyadh
 */
public class BillModel {
    private int billId;
    private int patientId;
    private int receptionistId;   
    private String dateString;
    private String timeString;
    private ArrayList<BillItemModel> billItemList;
    private int totalAmount;

    public BillModel() {
    }

    
    public BillModel(int billId, int patientId, int receptionistId, String dateString, String timeString, ArrayList<BillItemModel> billItemList, int totalAmount) {
        this.billId = billId;
        this.patientId = patientId;
        this.receptionistId = receptionistId;
        this.dateString = dateString;
        this.timeString = timeString;
        this.billItemList = billItemList;
        this.totalAmount = totalAmount;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(int receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public String getTimeString() {
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }

    public ArrayList<BillItemModel> getBillItemList() {
        return billItemList;
    }

    public void setBillItemList(ArrayList<BillItemModel> billItemList) {
        this.billItemList = billItemList;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    
    public int createTotalAmount()
    {
        int amount = 0;
        amount = billItemList.stream().map((billItem) -> billItem.getQuantity()*billItem.getAmount()).reduce(amount, Integer::sum);
        return amount;
    }
    
    public String generateBill()
    {
        String billString = "";        
        billString = billItemList.stream().map((billItem) -> billItem.toString() + "*").reduce(billString, String::concat);    
        return billString;
    }
}
