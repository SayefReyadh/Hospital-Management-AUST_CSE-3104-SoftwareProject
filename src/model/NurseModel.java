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
    private ArrayList<PatientModel> patientList;

    public NurseModel(int id, String nameString, String genderString, int salary, String numberString, String addressString , int wardId, String wardNameString, ArrayList<PatientModel> patientList) {
        super(id, nameString, genderString, salary, numberString, addressString);
        this.wardId = wardId;
        this.wardNameString = wardNameString;
        this.patientList = patientList;
    }

    public NurseModel() {
        
    }
    
    
    
}
