// to display mobile Battery Check – "Low Battery", "50% Consumed", or "Battery Full".
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int batteryPercent=sc.nextInt();
	    if(batteryPercent<=20){
	       System.out.println("Low Battery: "+ batteryPercent + "%");
	    }
	    else if(batteryPercent==50){
	       System.out.println("50% Consumed: "+ batteryPercent + "%");
	    }
	    else if(batteryPercent>=80){
	        System.out.println("Battery Full: "+ batteryPercent + "%");
	    }
	    else{
	        System.out.println("Battery Status: " + batteryPercent + "%");
	    }
	}
}