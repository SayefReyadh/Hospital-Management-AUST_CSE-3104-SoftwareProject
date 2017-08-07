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
public class DoctorModel extends EmployeeModel{
    private String typeString;
    private ArrayList<PatientModel> patientList;
    private ArrayList<PatientModel> appointmentList;

    public DoctorModel() {
    }

    public DoctorModel(int id, String nameString, String genderString, int salary, String numberString, String addressString,String typeString, ArrayList<PatientModel> patientList, ArrayList<PatientModel> appointmentList) {
        super(id, nameString, genderString, salary, numberString, addressString);
        this.typeString = typeString;
        this.patientList = patientList;
        this.appointmentList = appointmentList;
    }

    public String getTypeString() {
        return typeString;
    }

    public void setTypeString(String typeString) {
        this.typeString = typeString;
    }

    public ArrayList<PatientModel> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<PatientModel> patientList) {
        this.patientList = patientList;
    }

    public ArrayList<PatientModel> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(ArrayList<PatientModel> appointmentList) {
        this.appointmentList = appointmentList;
    }
  
    
    
    
    
    
    
}
