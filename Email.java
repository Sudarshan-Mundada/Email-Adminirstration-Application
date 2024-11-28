package com.java.emailapp;

import java.util.Scanner;

public class Email 
{
	
	private String firstName;
	private String lastName;
	private String password;
	private String department; 
	private String email;
	private int mailboxCapacity;
	private int defaultPasswordLength=10 ;
	private String alternateEmail;
	private String companySuffix="github.com";
	
	//Constructor to receive the first name and last name.
	public Email(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email Created:"+this.firstName+" "+this.lastName);
		
		//Call a method for asking for the department - return the department
		this.department=setDepartment();
		System.out.println("The Department is:"+this.department);
		
		//Call a method that return a random password.
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Password: "+this.password);
		
		//Combine elements to generate email.
		this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+". "+companySuffix.toLowerCase();
		System.out.println("Your email:"+this.email);
	}
	//Ask for the department.
	private String setDepartment()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Department code-\n1.Sales\n2.Development\n3.Accounting\n0.None\nEnter the department:");
		int depChoice=sc.nextInt();
		if(depChoice==1) {return "Sales";}
		else if(depChoice==2) {return "Development";}
		else if(depChoice==3) {return "Accounting";}
		else {return "None";}
	}
	
	//Generate a random password.
	private String randomPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{ 
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mailbox capacity.
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity=capacity;
	}
	
	//Set alternate email.
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail=altEmail;
	}
	
	//change the password
	public void changePassword(String password)
	{
		this.password=password;
	}
	
	public int getMailboxCapactiy()
	{
		return mailboxCapacity;
	}
	
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String showInfo()
	{
		return "--------------------------\nDisplay Name:"+firstName+" "+lastName+
				"\nCompany Email: "+email+"\nMailbox Capacity: "
				+mailboxCapacity;
	}
}
