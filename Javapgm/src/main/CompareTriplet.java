package main;
import java.util.Scanner;

public class CompareTriplet {

	public CompareTriplet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value for alice");
		int alice[] = new int[3];
		int bob[] = new int[3];
		for(int a =0;a<3;a++){
			alice[a] =scan.nextInt();
		}
		for(int a =0;a<3;a++){
			bob[a] =scan.nextInt();
		}
		int bcount=0,acount=0;
		for(int i=0;i<alice.length && i<bob.length;i++){
			//System.out.println("output-->"+(alice[i]=bob[i])?continue:((alice[i]>bob[i])?acount++:bcount++));
			if(alice[i]==bob[i]){
				continue;
			} else if(alice[i]>bob[i]){
				acount++;
			} else {
				bcount++;
			}
		}System.out.println("alice "+acount+"\nbob "+bcount);
		scan.close();
	}

}
