package starPattern;
import java.util.Scanner;

public class MyPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines");
		int n= sc.nextInt();
		pattern05(n);
//		pattern02(n);
	}
	
	static void  pattern00(int n) {
		/*
		 
		 *****
		 *****
		 *****
		 *****
		 *****
		 
		 */
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
	
				
	}
	static void pattern01(int n){
		/*
		 
		 *
		 **
		 ***
		 ****
		 .
		 .
		 .
		 
		 */
		
		String s="";
		for(int i=0;i<n;i++) {
			s=s+"*";
			System.out.println(s);
		}
		System.out.println();
	}
	
	static void pattern02(int n) {
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void pattern03(int n) {
		/* 
		 
		 *
		 **
		 ***
		 **
		 *
		 
		 */
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	static void pattern05(int n){
		/*
		 
		      *
		     **
		    ***
		   ****
		 
		 */
		System.out.println("05");
		
		for(int i=n;i>0;i--) {
			for(int j=0;j<n;j++)
				if(j<i)
					System.out.print(" ");
				else
					System.out.print("*");
			System.out.println();
		}
		
	}
	
	
	
	
	
	
}
