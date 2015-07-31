import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

enum Side{
		E("212") , A("216");
		
		private String code;
		
		private Side( String code) {
			this.code = code;
		}
		
		public String getSideCode() {
			return code;
		}
	}
public class PhoneNumber {

	private int number;
	private String code;
	boolean control = true;
	Scanner input = new Scanner(System.in);

	
	public PhoneNumber() {
		
		System.out.print("Press A for Asia, E for Europe: ");
		code = input.next();
		
		if(code.equals("A")) {
			
			code = Side.A.getSideCode();
			
		}
		else if(code.equals("E")) {
			
			code = Side.E.getSideCode();
		}
		
		
		while(control != false)  {
			try{
			
			System.out.print("Enter number: ");
			number = input.nextInt();
			
			control = false; 
			
			} catch(InputMismatchException e) {
				
				control = true;
				input.nextLine();
				System.out.println(getStackTrace(e));
				
			}
		}
		
	}

	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	  public static String getStackTrace(Throwable th)
	   {
	      if (th == null)
	      {
	         throw new IllegalArgumentException("Throwable == null");
	      }

	      StringWriter sw = new StringWriter();
	      try
	      {
	         PrintWriter pw = new PrintWriter(sw);
	         try
	         {
	            th.printStackTrace(pw);
	            return sw.toString();
	         }
	         finally
	         {
	            pw.close();
	         }
	      }
	      finally
	      {
	         try
	         {
	            sw.close();
	         }
	         catch (IOException ex)
	         {
	           
	         }
	      }
	   }

}
