// to apply % of discount based on purchase amount.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    if(r>=5000)
    {
        System.out.println(r-((r*50)/100));
    }
    else if(r>=2000 && r<5000)
    {
        System.out.println(r-((r*20)/100));
    }
    else if(r>=1000 && r<2000)
    {
        System.out.println(r-((r*10)/100));
    }
    else
    {
        System.out.println("No discount");
        }
    }
}
