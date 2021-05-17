package com.mycompany;

public class DreamCompany {
    private String companyName;
    private String location;
    private int packageInLacs;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String name) {
        this.companyName = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPackageInLacs() {
        return packageInLacs;
    }

    public void setPackageInLacs(int packageInLacs) {
        this.packageInLacs = packageInLacs;
    }

    public void doWork() {
        System.out.println("I am working in my dream company: " + companyName);
    }
}
