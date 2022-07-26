/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastorage;

/**
 *
 * @author tyler
 */
public class Perfevel {
    
    private int role_id, apptID;
    private String radtime, radtime1, techtime, techtime1, rectime, rectime1;
    
     public Perfevel(int role_id,int apptID, String radtime, String radtime1, String techtime, String techtime1, String rectime, String rectime1) {
        this.role_id = role_id;
        this.apptID = apptID;
        this.radtime = radtime;
        this.radtime1 = radtime1;
        this.techtime = techtime;
        this.techtime1 = techtime1;
        this.rectime = rectime;
        this.rectime1 = rectime1;
    }
      public String getRadTime() {
        return radtime;
    }

    public void SetRadTime(String radtime) {
        this.radtime = radtime;
    }
    
    public String getRadTime1() {
        return radtime1;
    }

    public void setRadTime1(String radtime1) {
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
    public int getRoleId() {
        return role_id;
    }

    public void setRoleId(int role_id) {
        this.role_id = role_id;
    }
    public int getApptId() {
        return apptID;
    }

    public void setApptId(int apptID) {
        this.apptID = apptID;
    }
}
