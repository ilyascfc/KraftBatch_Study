package day_33_Encapsulation;

import java.util.Random;

public class KraftBankCustomer {
    private int customerId;
    private String customerFullName;
    public boolean isSms;
    private double customerAccount;
    private String customerToken;

    public KraftBankCustomer(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;
        Random rd=new Random();
        this.customerToken=customerId+customerFullName.substring(0,2)+(rd.nextInt(8999)+1000);
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public String getCustomerFullName() {
        return this.customerFullName;
    }
    public void setCustomerFullName(String customerToken, String customerFullName) {
        if (customerToken.equals(this.customerToken)){
            this.customerFullName=customerFullName;
        } else {
            System.out.println("Not Authorized");
        }
    }
    public boolean getIsSms() {
        return this.isSms;
    }

    public void setIsSms(boolean sms) {
        this.isSms = sms;
    }

    public double getCustomerAccount() {
        return this.customerAccount;
    }

    public String getCustomerToken() {
        return this.customerToken;
    }







    public void addMoney(double money){
        this.customerAccount+=money;
    }





}
