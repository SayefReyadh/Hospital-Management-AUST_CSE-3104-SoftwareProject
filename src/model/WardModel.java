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
public class WardModel {
    private int wardId;
    private String wardNameString;
    private int capacity;
    private int inChargeId;
    private String inChargeNameString;
    
    public WardModel() {
    }

    public WardModel(int wardId, String wardNameString, int capacity, int inChargeId, String inChargeNameString) {
        this.wardId = wardId;
        this.wardNameString = wardNameString;
        this.capacity = capacity;
        this.inChargeId = inChargeId;
        this.inChargeNameString = inChargeNameString;
    }

    public int getWardId() {
        return wardId;
    }

    public void setWardId(int wardId) {
        this.wardId = wardId;
    }

    public String getWardNameString() {
        return wardNameString;
    }

    public void setWardNameString(String wardNameString) {
        this.wardNameString = wardNameString;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getInChargeId() {
        return inChargeId;
    }

    public void setInChargeId(int inChargeId) {
        this.inChargeId = inChargeId;
    }

    public String getInChargeNameString() {
        return inChargeNameString;
    }

    public void setInChargeNameString(String inChargeNameString) {
        this.inChargeNameString = inChargeNameString;
    }
    
    
}
