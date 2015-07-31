import java.util.Scanner;


public class Family extends Person{
	
	private String relationShip;
	
	Scanner input = new Scanner(System.in);
	
	public Family() {
		super();
		
	}

	public void setActivity() {
		
		System.out.println("Enter relationShip: ");
		setRelationShip(input.nextLine());
		
	}
	
	public void displayActivity() {
		
		System.out.println("relationship: " + getRelationShip());
	}

	public String getRelationShip() {
		return relationShip;
	}

	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}
	
}
