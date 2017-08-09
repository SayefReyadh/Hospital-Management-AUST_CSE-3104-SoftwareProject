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
public class PatientModel {
    
    private int id = 01;
    private String nameString = "Default";
    private String genderString = "Male";
    private String ageString = "18";
    private String contactString = "019";
    private String addressString = "Dhaka";

    public PatientModel() {
    }


    
    public PatientModel(int id, String nameString, String genderString, String ageString, String contactString, String addressString) {
        this.id = id;
        this.nameString = nameString;
        this.genderString = genderString;
        this.ageString = ageString;
        this.contactString = contactString;
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

    public String getAgeString() {
        return ageString;
    }

    public void setAgeString(String ageString) {
        this.ageString = ageString;
    }

    public String getContactString() {
        return contactString;
    }

    public void setContactString(String contactString) {
        this.contactString = contactString;
    }

    public String getAddressString() {
        return addressString;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }

    @Override
    public String toString() {
        
        return "PatientModel{" + "id=" + id + ", nameString=" + nameString + ", genderString=" + genderString + ", ageString=" + ageString + ", contactString=" + contactString + ", addressString=" + addressString + '}';
    }
    
    public String getInsertQuery()
    {
        String query = "insert into patient (patient_name , gender , patient_age , contact_no , patient_address) values ('" 
                + nameString + "' , '" + genderString+ "' , '" +ageString+ "' , '" +contactString+ "' , '" +addressString + "')";
        //insert into patient (patient_name , gender , patient_age , contact_no , patient_address)
        //values ('sayef' , 'male' , '19' , '019' ,'dhaka');
        return query;
    }

    
    
    
    
}
