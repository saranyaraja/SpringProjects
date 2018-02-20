package main;

import java.util.Scanner;

public class DigitsToString {
	public final static String[] digit={"","one","two","three","four","five","six","seven","eight","nine"};
	public final static String[] twodigit={"","eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	public final static String[] tens={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	public final static String[] hund={"hundred","thousand"};
	public DigitsToString() {
		// TODO Auto-generated constructor stub
	}
    public static String recurString(int number,String str){
    	int length = String.valueOf(number).length();
    	int i=length;
    	int count=0;
    	
		while(i!=0 ){
			    count=(int) Math.floor(number/Math.pow(10, i-1));
				System.out.println("digit is: "+count+"  number: "+Math.pow(10, i-1));
				number=(int) Math.floor(number%Math.pow(10, i-1));
				i--;
	
		}
    	switch(length){
		case 4:
			//System.out.print("count[0] :"+count[0]+" count[1] :"+count[1]+"count[2] :"+count[2]+" count[3] :"+count[3]);
			 count=(int) Math.floor(number/Math.pow(10, i-1));
			 str = str +digit[count]+"thousand";
			 System.out.println("String is -->"+str+"\n"+"number is "+count);
			 recurString(number,str);
			break;
		case 3:
			//System.out.println("count[0] :"+count[0]+" count[1] :"+count[1]+"count[2] :"+count[2]);
			if (count==0){
				System.out.print("Number :");
			}
				//System.out.print("Number :"+sampleNo+" String is :"+digit[count[2]]+hund[0]+tens[count[1]]+digit[count[0]]); 
			/*else if((count[1].count[0]) <20) {
				System.out.print("Number :"+sampleNo+"  --"+(count[1],count[0])+" String is :"+digit[count[2]]+hund[0]+twodigit[count[1]]+digit[count[0]]);
			}
			break;
		case 2:
			//System.out.print("count :"+count[0]+" count[1] :"+count[1]);
			if (count[0]==0){
				System.out.print("Number :"+number+" String is :"+tens[count[1]]);
			} else if(sampleNo <20) {
				System.out.print("Number :"+number+" String is :"+twodigit[count[0]]);
			} else {
				System.out.print("Number :"+number+" String is :"+tens[count[1]]+" "+digit[count[0]]);
			}
			break;
		case 1:
			System.out.print("Number :"+number+" String is :"+digit[number]);
			break;	
		default:
			System.out.println("Enter number between 0 and 1000");*/
		}
    	return str;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int length = String.valueOf(number).length();
    	String str =null;
		
		int sampleNo = number,i=length;
		
		
		int count=0;
		recurString( number, str);
		
		
		

	}

}
