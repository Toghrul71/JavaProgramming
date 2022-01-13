package day31_Constructors;

public class Offer {
    public String location, companyName, jobTitle;
    public double salary;
    public boolean hasBenefit, hasPTO, isWFH, isFullTime ;

    public String toString() { // toString method converts custom class object toString object and you will be able to print it
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location; // set location argument to instance variable
        this.companyName = companyName; // set companyName argument to instance variable
        this.jobTitle = jobTitle; //set jobTitle argument to instance variable
        this.salary = salary; //set salary argument to instance variable
        this.hasBenefit = hasBenefit; //set hasBenefit argument to instance variable
        this.hasPTO = hasPTO; //set hasPTO argument to instance variable
        this.isWFH = isWFH; //set isWFH argument to instance variable
        this.isFullTime = isFullTime; //set isFulltime argument to instance variable

        // setInfo method helps to generate all attributes of class
    }
}
/*
1. Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

            Actions:
                setInfo(): sets all the instance variables
                toString(): returns the full info of the Offer Object
 */