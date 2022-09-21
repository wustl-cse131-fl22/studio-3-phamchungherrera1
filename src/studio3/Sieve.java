package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println ("What number do you want to check to?");
		int n = in.nextInt();
		boolean[] number = new boolean[n];
		for (int p=2; p * p <n;p++)
		{
			if(number[p] == true)
			{
				for(int i = p * p; i<n; i+=p );
				{
					number[i] = false;
				}
			}
		}
	
		for(int i=0; i < number.length-1; i++)
		 {
			number[i] = true;
		 }
		
		
		 for(int j=0; j < number.length-1; j++)
		 {
			 if ((number[j]%2 != 0 && number[j]%3 != 0 && number[j]%5 != 0 && number[j]%7 != 0) ||(number[i] == 2 || number[i] == 3 || number[i] == 5 || number[i] == 7))
			 
				 System.out.print( number[j] + " ");
			 
		 }
	}

}
