package Day9;

import java.util.Scanner;

public class AddresBookSystem {
	public int name;
	Person p = new Person();
	static Person[] group = new Person[2];

	public static void main(String[] args) {
		System.out.println(" Welcome to Address Book Program ");

		

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter Contact of Person" + (i + 1));
			group[i] = new Person();
			getInfo(group[i]);

		}
		System.out.println("Want to Edit? Enter 1 for Yes, 2 for No");
		Scanner sc = new Scanner(System.in);
		if (sc.nextInt() == 1) {
			searchPerson();
		}
	}

	public static void searchPerson() {
		System.out.println("Enter Fisrt Name: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		int flag = 0;
		for (int i = 0; i < 2; i++) {
			System.out.println(group[i].fName);
			if (firstName.equals(group[i].fName)) {
				System.out.println("Edit---->");
				getInfo(group[i]);
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println("Couldn't Find it!");
		}
	}

	public static void getInfo(Person p1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name: ");
		String str = sc.next();
		p1.setfName(str);
		System.out.println("Enter Last name: ");
		str = sc.next();
		p1.setlName(str);
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

	public static void showInfo(Person p) {
		System.out.println("First name: " + p.getfName());
		System.out.println("Last name: " + p.getlName());
		System.out.println("Address: " + p.getAddress());
		System.out.println("City: " + p.getCity());
		System.out.println("State: " + p.getState());
		System.out.println("Zip: " + p.getZip());
		System.out.println("Phone Number: " + p.getpNumber());
		System.out.println("Email: " + p.getEmail());
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