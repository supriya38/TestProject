package sc;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, temp;
		 System.out.println("Enter x and y");
		 Scanner input = new Scanner(System.in);
		 x = input.nextInt();//scans the string as integer
		 y = input.nextInt();
		 System.out.println("Before Swapping" + x+ " "+ y);
		 temp = x;
		 x = y;
		 y = temp;
		 System.out.println("After Swapping" + x + " "+y);
	}

}
