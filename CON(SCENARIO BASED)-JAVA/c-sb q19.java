// to display mobile data usage alert – "Low Data", "Half Consumed", or "Data Over" based on usage.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=20)
        {
            System.out.println("Low Data");
        }
        else if(n>20 && n<=50)
        {
            System.out.println("Half consumed");
        }
        else {
            System.out.println("Data over");

        }
    }
}
