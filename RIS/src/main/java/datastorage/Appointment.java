/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastorage;

import java.io.InputStream;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author 14048
 */
public class Appointment {

    String apptID, patientID;
    String time, radtime, radtime1, techtime, techtime1, rectime, rectime1, status, order;
    float total;
    String fullName;
    public Button placeholder = new Button("Placeholder");
    public Button button = new Button("Button");
    public Button placeholder1 = new Button("Placeholder");

    public Appointment(String apptID, String patientID, String time, String radtime, String radtime1, String techtime, String techtime1, String rectime, String rectime1, String status, String order) {
        this.apptID = apptID;
        this.patientID = patientID;
        this.time = time;
        this.radtime = radtime;
        this.radtime1 = radtime1;
        this.techtime = techtime;
        this.techtime1 = techtime1;
        this.rectime = rectime;
        this.rectime1 = rectime1;
        this.status = status;
        this.order = order;
    }

    public Button getPlaceholder1() {
        return placeholder1;
    }

    public void setPlaceholder1(Button placeholder1) {
        this.placeholder1 = placeholder1;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Button getPlaceholder() {
        return placeholder;
    }

    public String getApptID() {
        return apptID;
    }

    public void setApptID(String apptID) {
        this.apptID = apptID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public String getRadTime() {
        return radtime;
    }

    public void SetRadTime(String radtime) {
        this.radtime = radtime;
    }
    
    public String GetRadTime1() {
        return radtime1;
    }

    public void SetRadTime1(String radtime1) {
        this.radtime1 = radtime1;
    }
    
    public String getTechTime() {
        return techtime;
    }

    public void setTechTime(String techtime) {
        this.techtime = techtime;
    }
    
    public String getTechTime1() {
        return techtime1;
    }

    public void setTechTime1(String techtime1) {
        this.techtime1 = techtime1;
    }
    
    public String getRecTime() {
        return rectime;
    }

    public void setRecTime(String rectime) {
        this.rectime = rectime;
    }
    
    public String getRecTime1() {
        return rectime1;
    }

    public void setRecTime1(String rectime1) {
        this.rectime1 = rectime1;
    }

    public String getStatus() {
        return status;
    }

    public Label getStatusAsLabel() {
        Label val = new Label(status);
        if (val.getText().contains("Completed")) {
            val.setId("colorGreen");
        } else if (val.getText().contains("Uploaded")) {
            val.setId("colorOrange");
        } else if (val.getText().contains("Cancelled") || val.getText().contains("Not Show")) {
            val.setId("colorRed");
        } else if (val.getText().contains("received")) {
            val.setId("colorBlue");
        } else if (val.getText().contains("Checked")) {
            val.setId("colorOrange");
        }
        return val;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
