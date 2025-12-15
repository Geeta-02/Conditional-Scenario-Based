//to show weather condition (cold, pleasant, hot, heatwave) based on temperature.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        if(n<15)
        {
            System.out.println("Cold");
        }
        else if(n>15 && n<25)
        {
            System.out.println("Pleasant");
        }
        else if(n>25 && n<35)
        {
            System.out.println("Hot");
        }
        else{
            System.out.println("Hotwave");

        }
    }
}
