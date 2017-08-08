/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import model.abstractModel.EmployeeModel;

/**
 *
 * @author SayefReyadh
 */
public class NurseModel extends EmployeeModel{
    private int wardId;
    private String wardNameString;
    private ArrayList<String> wardArrayString;
    private ArrayList<PatientModel> patientList;

    public NurseModel(int wardId, String wardNameString, ArrayList<String> wardArrayString, ArrayList<PatientModel> patientList, int id, String nameString, String genderString, int salary, String numberString, String addressString) {
        super(id, nameString, genderString, salary, numberString, addressString);
        this.wardId = wardId;
        this.wardNameString = wardNameString;
        this.wardArrayString = wardArrayString;
        this.patientList = patientList;
    }

    

    

    public NurseModel() {
        
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

    public ArrayList<String> getWardArrayString() {
        return wardArrayString;
    }

    public void setWardArrayString(ArrayList<String> wardArrayString) {
        this.wardArrayString = wardArrayString;
    }

    public ArrayList<PatientModel> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<PatientModel> patientList) {
        this.patientList = patientList;
    }
    
    
    
}
