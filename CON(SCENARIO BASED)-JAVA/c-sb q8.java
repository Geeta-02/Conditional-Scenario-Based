//  to check if an entered PIN matches the stored ATM PIN before allowing withdrawal.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=2005;
        if(a==b)
        {
            System.out.println("Pin match");
        }
        else{
            System.out.println("Pin not match");

        }
    }
}
