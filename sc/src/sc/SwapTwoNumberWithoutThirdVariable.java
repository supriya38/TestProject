package sc;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		 System.out.println("Enter x and y");
		 Scanner input = new Scanner(System.in);
		 x = input.nextInt();//scans the string as integer
		 y = input.nextInt();
		 System.out.println("Before Swapping" + x+ " "+ y);
		 x = x + y;//sum of x and y
		 
		 y = x - y;//value of  x
		 
		 x = x - y;//value of y
		 
		 System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);

	}

}
