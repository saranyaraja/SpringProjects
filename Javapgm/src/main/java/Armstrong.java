package main.java;
import java.util.ArrayList;

import org.junit.Test;

public  class Armstrong {

     public Boolean checkArmstrong (int number) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> count = new ArrayList<Integer>();
		int sum=0,n=number;
		while(number>0){
			count.add(number%10);
			number/=10;
		}
		int length = count.size();
		for(int a:count){
			sum=(int) (sum+Math.pow(a, length));

		}
		//sum=(int) (Math.pow(c, length));
		if(n==sum){
			return true;
		}
		return false;
	}
    
}
