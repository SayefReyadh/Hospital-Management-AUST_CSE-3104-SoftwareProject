/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.model.DatabaseConnection;
import model.PatientModel;

/**
 *
 * @author SayefReyadh
 */
public class PatientDatabase extends DatabaseConnection{
    
    
    public PatientModel getPatientModel(int patientId)
    {
        ///gets the patient model with id
        PatientModel patientModel = new PatientModel();
        
        
        return patientModel;
    }
    
    
    public void insertNewPatient(PatientModel patientModel)
    {
        ///insert into database
        /// the work is done as I called the super calss excuteQuery function to insert
    }
}
