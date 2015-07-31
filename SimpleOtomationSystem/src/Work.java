import java.util.Scanner;

public class Work extends Company {

	private String department;

	Scanner input = new Scanner(System.in);

	public Work() {

		super();
	}

	public void setActivity() {

		System.out.println("Enter department: ");
		setDepartment(input.nextLine());

	}

	public void displayActivity() {

		System.out.println("department: " + getDepartment());

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
