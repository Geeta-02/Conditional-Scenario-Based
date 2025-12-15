// to check whether vehicle speed exceeds 100 km/h.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int speed=sc.nextInt();
        if(speed>100)
        {
            System.out.println("Speed exceeds 100 km/h");
        }
        else{
            System.out.println("Speed not exceeds 100 km/h");

        }
    }
}
