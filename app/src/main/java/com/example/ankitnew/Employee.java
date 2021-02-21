package com.example.ankitnew;

import androidx.annotation.NonNull;

public class Employee {
    private long empId;
    private String email;
    private String pass;
    private String userId;
    private String hashedPass;


    public Employee(long empId, String email, String pass, String userId) {
        this.empId = empId;
        this.email = email;
        this.pass = pass;
        this.userId = userId;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHashedPass() {
        return hashedPass;
    }

    public void setHashedPass(String hashedPass) {
        this.hashedPass = hashedPass;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", userId='" + userId + '\'' +
                ", hashedPass='" + hashedPass + '\'' +
                '}';
    }
}
