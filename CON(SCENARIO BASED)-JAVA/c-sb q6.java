//   to check pass/fail based on marks (marks ≥ 35 = pass).
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int mark=sc.nextInt();
	    if(mark>=35){
	       System.out.println("Pass: "+ mark);
	    }
	    else{
	        System.out.println("Fail: " + mark);
	    }
	}
}