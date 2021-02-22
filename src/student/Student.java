package student;

import java.util.Scanner;

public class Student 
{
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	private String department;
	private static String company = "wipro";
	public Student(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = getDepartment();
		this.emailAddress = getEmailAddress();
		this.password = getPassword();
		printStudentDetails();
	}
	private String getDepartment()
	{
		System.out.println("Hello "+this.firstName+ ". Please type below number for your department");
		System.out.println("0 for none\n1 for sales\n2 for development\n3 for accounting");
		Scanner sc = new Scanner(System.in);
		int dept = sc.nextInt();
		if (dept==1) {return "sales";}
		else if(dept==2) {return "development";}
		else if(dept==3) {return "accounting";}
		else return "";
	}
	private String getEmailAddress()
	{
		return this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+department+"."+company+".com";
	}
	private String getPassword()
	{
		//This method generates random password
		String password = "";
		String passwordGenerator = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
		for(int i = 0; i<8; i++)
		{
			password += passwordGenerator.charAt((int)(Math.random()*passwordGenerator.length()));
		}
		return password;
	}
	private void printStudentDetails()
	{
		System.out.println("Please find below details: ");
		System.out.println("Name: "+this.firstName+" "+lastName+"\nEmail Address: "+this.emailAddress+"\nPassword: "+this.password);
	}
}
