// to check if withdrawal amount ≤ balance and is a multiple of 100 (ATM Withdrawal Validation).
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>0 && a<=b && a%100==0)
        {
            System.out.println("Withdraw");
        }
        else{
            System.out.println("Can't withdraw");

        }
    }
}
