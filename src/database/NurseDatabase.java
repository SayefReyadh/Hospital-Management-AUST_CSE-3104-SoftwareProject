/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.model.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NurseModel;
import model.PatientModel;
import model.WardModel;

/**
 *
 * @author SayefReyadh
 */
public class NurseDatabase extends DatabaseConnection {

    public NurseModel getNurseInformation(int nurseId) {
        NurseModel nurseModel = new NurseModel();
        ///fetch the nurse information with nurse

        ///also fetch all the word name for jComboBox so that whenever chosen it can fetch ward info
        nurseModel.setWardArrayString(getWardNameArrayList(nurseId));

        return nurseModel;
    }

    public ArrayList<String> getWardNameArrayList(int nurseId) {
        
        openDatabaseConnection();
        
        ArrayList<String> wardNameArray = new ArrayList<>();
        ///get the ward names using nurseId

        String query = "SELECT ward_type FROM ward WHERE ward_incharge_id = " + nurseId;

        ResultSet result = runQuery(query);

        try {
            while (result.next()) {
                wardNameArray.add(result.getString("ward_type"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(NurseDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        closeConnection();
        
        return wardNameArray;
    }

    public WardModel getWardModel(String wardName) {
        WardModel wardModel = new WardModel();

        ///gets the ward info
        return wardModel;
    }

    public ArrayList<PatientModel> getPatientList(String wardName) {

        openDatabaseConnection();
        
        ArrayList<PatientModel> patientList = new ArrayList<>();
        ///fetch patientlist using wardModel.getWardId();
        
        String query = "SELECT * FROM patient INNER JOIN assign ON patient.patient_id = assign.patient_id "
                + " WHERE ward_id = (SELECT ward_id FROM ward WHERE ward_type = '" + wardName +"')";

        ResultSet result = runQuery(query);
        
        try {
            while(result.next()) {
                PatientModel model = new PatientModel(
                        result.getInt("patient_id"),
                        result.getString("patient_name"),
                        result.getString("gender"),
                        result.getString("patient_age"),
                        result.getString("contact_no"),
                        result.getString("patient_address") 
                );
                
                patientList.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        closeConnection();
        return patientList;
    }

}
