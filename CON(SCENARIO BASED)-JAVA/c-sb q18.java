//to calculate water bill using slab rates (≤1000 liters free, next 2000 @ ₹5, above @ ₹10 per 1000 liters).
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        if(l<=1000)
        {
            System.out.println("Free");
        }
        else if(l<=3000)
        {
            System.out.println((l-1000)*5);
        }
        else
        {
            System.out.println((l-1000)*10);

        }
    }
}
