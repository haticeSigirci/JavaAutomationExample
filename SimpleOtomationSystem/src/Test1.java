import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Test1 {

	public static void main(String args[]) {
		
		int choice , choice2;
		boolean control = true;
		
		Scanner input = new Scanner(System.in);
			
		ArrayList <Person> people = new ArrayList<Person> ();
		
		while(control != false) {
			
			System.out.println("1)Add a new contact\n" +
							   "2)Display list of contacts\n" +
							   "3)Exit\n");
			
			choice = input.nextInt();
			
			if(choice == 1) {
				
				System.out.println("1)Add family member\n" +
								   "2)Add friend\n" +
								   "3)Add connections related to work\n");
				
				choice2 = input.nextInt();
				
				if(choice2 == 1) {
					
					Family family = new Family();
					family.setActivity();
					
					people.add(family);
					
				}
				else if(choice2 == 2) {
					
					Friend friend = new Friend();
					friend.setActivity();
					
					people.add(friend);
					
				}
				else if(choice2 == 3) {
					
					Work work = new Work();
					work.setActivity();
					
					people.add(work);
					
				}
				
			}
			else if(choice == 2) {
				
				Collections.sort(people);

				for(int i = 0; i < people.size(); ++i) {
					
					System.out.println("name: " + people.get(i).getName());
					System.out.println("phone: " + people.get(i).phoneNumber.getCode() + people.get(i).phoneNumber.getNumber());
					System.out.println("address: " + people.get(i).getAddress());
					System.out.println("closeness: " + people.get(i).getCloseness());
					people.get(i).displayActivity();
					
					System.out.println();
				}
						
			}
			else if(choice == 3) {
				control = false;
			}
			
		}
		
		
	}
	
}
