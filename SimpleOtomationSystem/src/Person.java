import java.util.Scanner;

public class Person extends Contact implements Comparable<Person> {

	private int closeness;

	Scanner input = new Scanner(System.in);

	public Person() {

		super();

		System.out.println("Enter closeness value: ");
		setCloseness(input.nextInt());

	}

	@Override
	public void setActivity() {

	}

	@Override
	public void displayActivity() {

	}

	public int getCloseness() {
		return closeness;
	}

	public void setCloseness(int closeness) {
		this.closeness = closeness;
	}

	@Override
	public int compareTo(Person person) {

		return closeness - person.closeness;
	}

}
