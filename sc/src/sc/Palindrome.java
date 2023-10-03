package sc;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			 String original, reverse = "";
			 Scanner in = new Scanner(System.in);
			 int length;
			 System.out.println("Enter the number or String");
			 original = in.nextLine();
			 length = original.length();
			 for (int i =length -1; i>=0; i--) {
			 reverse = reverse + original.charAt(i);//stores the string in reverse order
			 }
			 System.out.println("reverse is:" +reverse);
			 
			 if(original.equals(reverse))//Check that the orignal and reverse is equal or not
			 System.out.println("The number is palindrome");
			 else
			 System.out.println("The number is not a palindrome");
	}

}
