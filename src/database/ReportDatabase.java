/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.model.DatabaseConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ReportModel;

/**
 *
 * @author SayefReyadh
 */
public class ReportDatabase extends DatabaseConnection {

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

    public boolean setReportInformation(ReportModel reportModel) {
        ReportModel rep = reportModel;
        String query;
        query = "INSERT INTO laboratory (patient_id,doctor_id,report_sub,report_details) "
                + "Values('" + rep.getPatientId() + "','" + rep.getDoctorId() + "','" + rep.getReportSubjectString() + "','" + rep.getReportDetailsString() + "')";
        boolean result = excuteInsertQuery(query);

        if (result) {
            JOptionPane.showMessageDialog(null, "Insert Successfull");
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Insert Unsuccessfull");
        }
        return true;
    }

    public ArrayList<ReportModel> getReports(int patientId) {
        ArrayList<ReportModel> reports = new ArrayList<>();

        openDatabaseConnection();

        String query = "SELECT * FROM laboratory WHERE patient_id = " + patientId;

        ResultSet result = runQuery(query);

        try {
            while (result.next()) {
                ReportModel model = new ReportModel(result.getInt("report_id"),
                        result.getInt("patient_id"),
                        result.getInt("doctor_id"), result.getString("report_sub"),
                        result.getString("report_details"));

                reports.add(model);
            }
        } catch (Exception e) {

            if (result == null) {

                JOptionPane.showMessageDialog(null, "Something went wrong! Please check your inputs");
            }
        }

        closeConnection();
        return reports;

    }

}
