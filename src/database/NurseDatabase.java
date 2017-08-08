/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import model.NurseModel;
import model.PatientModel;
import model.WardModel;

/**
 *
 * @author SayefReyadh
 */
public class NurseDatabase {
    public NurseModel getNurseInformation(int nurseId)
    {
        NurseModel nurseModel = new NurseModel();
        ///fetch the nurse information with nurse
        
        ///also fetch all the word name for jComboBox so that whenever chosen it can fetch ward info
        
        nurseModel.setWardArrayString(getWardNameArrayList(nurseId));
        
        
        return nurseModel;
    }
    
    public ArrayList<String> getWardNameArrayList(int nurseId)
    {
        ArrayList<String> wardNameArray = new ArrayList<>();
        ///get the ward names using nurseId
        
        return wardNameArray;
    }
    
    public WardModel getWardModel(String wardName)
    {
        WardModel wardModel = new WardModel();
        
        ///gets the ward info
        
        return wardModel;
    }
    
    public ArrayList<PatientModel> getPatientList(String wardName)
    {
        WardModel wardModel = getWardModel(wardName);
        
        ArrayList<PatientModel> patientList = new ArrayList<>();
        ///fetch patientlist using wardModel.getWardId();
        
        
        return patientList;
    }
    
    
}
