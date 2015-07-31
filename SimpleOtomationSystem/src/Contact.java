import java.util.Scanner;

public class Contact implements ActivitiesOfContacts {

	private String address, name;

	PhoneNumber phoneNumber;

	Scanner input = new Scanner(System.in);

	public Contact() {

		System.out.println("Enter name: ");
		name = input.nextLine();

		System.out.print("Enter address: ");
		setAddress(input.nextLine());

		phoneNumber = new PhoneNumber();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void setActivity() {

	}

	@Override
	public void displayActivity() {

	}

}
