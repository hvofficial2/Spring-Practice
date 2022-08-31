package com.harshit.App04.beans;

public class EmployeeBean {
    private int empid;
    private String ename;
    private String ecity;
    private String ecountry;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEcity() {
        return ecity;
    }

    public void setEcity(String ecity) {
        this.ecity = ecity;
    }

    public String getEcountry() {
        return ecountry;
    }

    public void setEcountry(String ecountry) {
        this.ecountry = ecountry;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", ecity='" + ecity + '\'' +
                ", ecountry='" + ecountry + '\'' +
                '}';
    }
}
