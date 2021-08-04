package Day9;

import java.util.Scanner;

public class AddresBookSystem extends Person {
	public int name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome to Address Book Program ");
		Person p1 = new Person();
		System.out.println("Enter First name: ");
		p1.setfName(sc.next());
		System.out.println("Enter Last name: ");
		p1.setlName(sc.next());
		System.out.println("Enter Address: ");
		p1.setAddress(sc.next());
		System.out.println("Enter City: ");
		p1.setCity(sc.next());
		System.out.println("Enter State: ");
		p1.setState(sc.next());
		System.out.println("Enter Zip: ");
		p1.setZip(sc.nextInt());
		System.out.println("Enter Phone Number: ");
		p1.setpNumber(sc.nextLong());
		System.out.println("Enter Email: ");
		p1.setEmail(sc.next());

	}
}

class Person {
	String fName;
	String lName;
	String address;
	String city;
	String state;
	int zip;
	long pNumber;
	String email;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getpNumber() {
		return pNumber;
	}

	public void setpNumber(long pNumber) {
		this.pNumber = pNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}