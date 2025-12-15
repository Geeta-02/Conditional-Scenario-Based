// to assign ticket price based on passenger age (child, adult,senior).
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18)
        {
            System.out.println("Child: "+ "Rs." +150);
        }
        else if(age<60 && age>=18)
        {
            System.out.println("Adult: "+  "Rs." +250);
        }
        else{
            System.out.println("Senior: "+  "Rs." +350);

        }
    }
}
