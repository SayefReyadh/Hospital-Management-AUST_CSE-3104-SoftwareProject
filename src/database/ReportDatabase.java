/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.model.DatabaseConnection;
import model.ReportModel;

/**
 *
 * @author SayefReyadh
 */
public class ReportDatabase extends DatabaseConnection{

    
        
    public ReportModel getReportInformation(int reportId) {
        ReportModel reportModel = new ReportModel();
        ///fetch report content with report id
        /// assign them in report model
        String query;
        query = "Select patient_id,report_sub,report_details From laboratory";
        excuteSearchQuery(query);
        return reportModel;
        
        ///connection close kora jabe nah problem ache
    }
    
    public boolean setReportInformation(ReportModel reportModel)
    {
        ReportModel rep = reportModel;
        String query ;
        query =  "INSERT INTO laboratory (patient_id,doctor_id,report_sub,report_details) "
                + "Values('" +rep.getPatientId()+ "','" +rep.getDoctorId()+"','" + rep.getReportSubjectString()+"','" +rep.getReportDetailsString() + "')";
        excuteInsertQuery(query);
        
        return true;
    }
    
}
