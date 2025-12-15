//to assign different ticket prices based on day of the week (weekday/weekend).
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int tp=sc.nextInt();
        if(tp>=1 && tp<=5)
        {
            System.out.println("Weekday: "+ "Rs." + 150);
        }
        else{
            System.out.println("Weekend: "+ "Rs." + 250);

        }
    }
}
