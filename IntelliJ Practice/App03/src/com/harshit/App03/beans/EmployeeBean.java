package com.harshit.App03.beans;

public class EmployeeBean {
    private int eid;
    private String ename;
    private String ecity;
    private String ecountry;
    private long ephone;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
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

    public long getEphone() {
        return ephone;
    }

    public void setEphone(long ephone) {
        this.ephone = ephone;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", ecity='" + ecity + '\'' +
                ", ecountry='" + ecountry + '\'' +
                ", ephone=" + ephone +
                '}';
    }
}
