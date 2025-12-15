// to calculate different discount for different Bill amount
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double amnt=sc.nextInt();
	    double disPercent=0;
	    if(amnt<1000){
	        disPercent=5;
	    }
	    else if(amnt<5000){
	        disPercent=10;
	    }
	    else{
	        disPercent=15;
	    }
	    double disValue=amnt*disPercent/100;
	    double totAmnt=amnt-disValue;
		System.out.println("Bill Amount: "+ amnt);
		System.out.println("Discount Applied: "+ disPercent+"%");
		System.out.println("Discount Value: "+ disValue);
		System.out.println("Total Amount: "+ totAmnt);
	}
}