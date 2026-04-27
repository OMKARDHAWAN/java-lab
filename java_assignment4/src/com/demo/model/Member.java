package com.demo.model;

public class Member extends Person {
	private static int memberCounter=500;

    private String membershipType;
    private double amountPaid;

    public Member(String name,String mobile,String email,
            String membershipType,double amountPaid) {

        super(memberCounter++,name,mobile,email);

        this.membershipType=membershipType;
        this.amountPaid=amountPaid;
    }

    @Override
    public String toString() {
        return "Member -> "+
                super.toString()+
                ", Membership Type="+membershipType+
                ", Amount Paid="+amountPaid;
    }
}
