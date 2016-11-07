import java.util.Scanner;

public class assignment3_2 {

	public static void main(String[] args) {
	    String s1, s2;
	      Scanner str = new Scanner(System.in);
	 
	      System.out.println("Enter the first string");
	      s1 = str.nextLine();
	 
	      System.out.println("Enter the second string");
	      s2 = str.nextLine();
	 
	      if ( s1.equals(s2))
	         System.out.println("same = True");
	      else   
	         System.out.println("same = False");
	   }
	}
	


