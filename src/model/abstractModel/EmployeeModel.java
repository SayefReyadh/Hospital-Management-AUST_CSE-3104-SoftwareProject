/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.abstractModel;

/**
 *
 * @author SayefReyadh
 */
public abstract class EmployeeModel {
    private int id;
    private String nameString;
    private String genderString;
    private int salary;
    private String numberString;
    private String addressString;

    public EmployeeModel() {
    }

    
    
    public EmployeeModel(int id, String nameString, String genderString, int salary, String numberString, String addressString) {
        this.id = id;
        this.nameString = nameString;
        this.genderString = genderString;
        this.salary = salary;
        this.numberString = numberString;
        this.addressString = addressString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getGenderString() {
        return genderString;
    }

    public void setGenderString(String genderString) {
        this.genderString = genderString;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getNumberString() {
        return numberString;
    }

    public void setNumberString(String numberString) {
        this.numberString = numberString;
    }

    public String getAddressString() {
        return addressString;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }
    
   
    
}
