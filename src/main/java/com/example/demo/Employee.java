package com.example.demo;

public class Employee {
    private long Empid;
    private String Fname;
    private String Lname;
    private int SSN;
    private String DOB;

    public long getEmpid() {
        return Empid;
    }

    public void setEmpid(long empid) {
        Empid = empid;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}