import java.util.Scanner;

public class Friend extends Company {

	private String placeMet;

	Scanner input = new Scanner(System.in);

	public Friend() {
		super();
	}

	@Override
	public void setActivity() {

		System.out.println("Enter place met: ");
		setPlaceMet(input.nextLine());

	}

	@Override
	public void displayActivity() {

		System.out.println("place met:  " + getPlaceMet());

	}

	public String getPlaceMet() {
		return placeMet;
	}

	public void setPlaceMet(String placeMet) {
		this.placeMet = placeMet;
	}

}
