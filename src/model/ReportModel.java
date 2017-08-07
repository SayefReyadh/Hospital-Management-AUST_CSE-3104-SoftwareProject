/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SayefReyadh
 */
public class ReportModel {
    private int reportId;
    private int patientId;
    private int doctorId;
    private String reportSubjectString;
    private String reportDetailsString;

    public ReportModel() {
    }

    public ReportModel(int reportId, int patientId, int doctorId, String reportSubjectString, String reportDetailsString) {
        this.reportId = reportId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.reportSubjectString = reportSubjectString;
        this.reportDetailsString = reportDetailsString;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getReportSubjectString() {
        return reportSubjectString;
    }

    public void setReportSubjectString(String reportSubjectString) {
        this.reportSubjectString = reportSubjectString;
    }

    public String getReportDetailsString() {
        return reportDetailsString;
    }

    public void setReportDetailsString(String reportDetailsString) {
        this.reportDetailsString = reportDetailsString;
    }
    
    
    
}
