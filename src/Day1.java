//Day 1 Challange:
/*There was a teacher in a small town who loves coding and he wants to create a program which prints out the 
whole multiplication table of an entered number for his students .
Can you help him to write a program in Java ??
*/

import java.util.*;
public class Day1 {
	public static void main(String[] args) {
		System.out.println("Enter any number :");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+"="+(n*i));
			
		}
		
	}

}
