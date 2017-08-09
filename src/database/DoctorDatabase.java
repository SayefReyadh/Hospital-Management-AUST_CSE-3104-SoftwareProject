/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.model.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.AppointmentModel;
import model.DoctorModel;
import model.PatientModel;

/**
 *
 * @author SayefReyadh
 */
public class DoctorDatabase extends DatabaseConnection {

    private DoctorModel doctorModel;

    private Statement statement = null;
    private ResultSet result = null;
    private PreparedStatement pStatement = null;

    public DoctorModel getDoctorInformation(int doctorId) {
        openDatabaseConnection();

        ///gets all the info from doctor model
        doctorModel = null;

        String query = "select * from doctor inner join employee on doctor_id = employee_id where doctor_id =" + doctorId;

        result = runQuery(query);

        try {
            if (result != null) {
                result.next();
                String designation = result.getString("designation");
                String name = result.getString("employee_name");
                String number = result.getString("employee_contact_no");
                String gender = result.getString("employee_gender");
                String address = result.getString("employee_address");
                int salary = result.getInt("salary");

                ArrayList<AppointmentModel> appointments = getAppointmentModels(doctorId);

                ArrayList<PatientModel> patients = getPatientsList(doctorId);

                doctorModel = new DoctorModel(
                        designation,
                        patients,
                        appointments,
                        doctorId,
                        name, gender, salary, number, address
                );
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
            Logger.getLogger(DoctorDatabase.class.getName()).log(Level.SEVERE, null, ex);

        }

        closeConnection();
        return doctorModel;
    }

    public ArrayList<AppointmentModel> getAppointmentModels(int doctorId) throws SQLException {
        ///fetch all the appointments

        result = runQuery("SELECT * FROM appointment "
                + "  INNER JOIN patient ON appointment.patient_id = patient.patient_id WHERE doctor_id =" + doctorId);

        ArrayList<AppointmentModel> appointmentModels = new ArrayList<>();

        while (result.next()) {
            AppointmentModel model
                    = new AppointmentModel(
                            result.getInt("appoint_id"),
                            result.getInt("doctor_id"),
                            result.getString("patient_name"),
                            result.getString("appoint_date"),
                            result.getString("appoint_time"));

            appointmentModels.add(model);
        }

        return appointmentModels;
    }

    public ArrayList<AppointmentModel> getAppointmentModels(String dateString) {
        // fetch all appointments of a perticular date

        openDatabaseConnection();

        result = runQuery("SELECT * FROM appointment "
                + "  INNER JOIN patient ON appointment.patient_id = patient.patient_id WHERE appoint_date = '" + dateString + "' ORDER BY "
                + "appoint_date DESC");

        ArrayList<AppointmentModel> appointmentModels = new ArrayList<>();

        try {
            while (result.next()) {
                AppointmentModel model
                        = new AppointmentModel(
                                result.getInt("appoint_id"),
                                result.getInt("doctor_id"),
                                result.getString("patient_name"),
                                result.getString("appoint_date"),
                                result.getString("appoint_time"));

                appointmentModels.add(model);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
        return appointmentModels;
    }

    public ArrayList<PatientModel> getPatientsList(int doctorId) throws SQLException {
        ///fetch all the appointments distinct patientID

        String query = "SELECT * FROM patient WHERE patient_id in"
                + "  (SELECT distinct(patient_id) FROM appointment WHERE doctor_id = " + doctorId + ")";
        result = runQuery(query);

        ArrayList<PatientModel> patientList = new ArrayList<>();
        while (result.next()) {
            PatientModel model
                    = new PatientModel(
                            result.getInt("patient_id"),
                            result.getString("patient_name"),
                            result.getString("gender"),
                            result.getString("patient_age"),
                            result.getString("contact_no"),
                            result.getString("patient_address"));

            patientList.add(model);
        }
        return patientList;
    }

}
