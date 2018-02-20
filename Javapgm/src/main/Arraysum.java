package main;
import java.util.Scanner;

public class Arraysum {

	public Arraysum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int sum=0;
		int arr[] = new int[number];
	    for(int a: arr){
	    	a=scan.nextInt();
	    	sum=sum+a;
	    }
	    
		scan.close();
		System.out.println("Sum is :::"+sum);
	}

}
