//  to print "Stop / Ready / Go" based on traffic light color.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        if(a.equals("Red"))
        {
            System.out.println("Stop");
        }
        else if(a.equals("Yellow"))
        {
            System.out.println("Ready");
        }
        else{
            System.out.println("Go");

        }
    }
}
