package sc;

import java.util.Scanner;

public class ReverseSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		 Scanner ins = new Scanner(System.in);//used to enter the string on command line
		 System.out.println("Enter your String");
		 str = ins.nextLine();//read entered string with spaces
		 String[] token = str.split(""); //used split method to print in reverse order
		 for(int i=token.length-1; i>=0; i--)//reverse the string
		 {
		 System.out.print(token[i] + "");
		 }
	}

}
