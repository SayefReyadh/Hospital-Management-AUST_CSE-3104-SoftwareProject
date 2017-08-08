/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import model.AppointmentModel;
import model.DoctorModel;
import model.PatientModel;

/**
 *
 * @author SayefReyadh
 */
public class DoctorDatabase {
    private DoctorModel doctorModel;
    
    public DoctorModel getDoctorInformation(int doctorId)
    {
        ///gets all the info from doctor model
        doctorModel = new DoctorModel();
        
        return doctorModel;
    }
    
    public ArrayList<AppointmentModel> getAppointmentModels()
    {
        ///fetch all the appointments
        ArrayList<AppointmentModel> appointmentModels = new ArrayList<>();
        
        
        return appointmentModels;
    }
    
    public ArrayList<AppointmentModel> getAppointmentModels(String dateString)
    {
        ///fetch all the appointments
        ArrayList<AppointmentModel> appointmentModels = new ArrayList<>();
        
        
        return appointmentModels;
    }
    
    public ArrayList<PatientModel> getPatientsList()
    {
        ///fetch all the appointments distinct patientID
        ArrayList<AppointmentModel> appointmentModels = new ArrayList<>();
        
        ArrayList<PatientModel> patientList = new ArrayList<>();
        PatientDatabase patientDatabase = new PatientDatabase();
        
        ///call the 
        //patientDatabase.getPatientModel
        //(here put the patient id from appointment arraylist database)
        //add them in the patientModels arraylist
        
        return patientList;
    }
    
}
