//to validate a mobile number . If it has 10 digits print “Valid Number” otherwise print “Invalid Number”.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        long ph=sc.nextLong();
        if(ph> 0000000000l && ph< 9999999999l)
        {
            System.out.println("Valid Number");
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
