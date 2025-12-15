//to display mobile battery status (full, moderate, low).
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
        if(n==100 || n>=80)
        {
            System.out.println("Battery full");
        }
        else if(n>=50 && n<80)
        {
            System.out.println("Moderate");
        }
        else if(n<=20)
        {
            System.out.println("Low battery");
        }
        else{
            System.out.println("Battery Status: "+ n);
        }
    }
}
