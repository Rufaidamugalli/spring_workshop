package com.example.rufaida;

public class MyForm {
    String orgName;

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgName() {
        return orgName;
    }

    @Override
    public String toString() {
        return "MyForm{" +
                "orgName='" + orgName + '\'' +
                '}';
    }
}
