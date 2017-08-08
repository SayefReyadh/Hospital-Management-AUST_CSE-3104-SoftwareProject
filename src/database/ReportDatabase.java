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
        
        return reportModel;
    }
    
    public boolean setReportInformation(ReportModel reportModel)
    {
        //insert into reports
        return true;
    }
    
}
