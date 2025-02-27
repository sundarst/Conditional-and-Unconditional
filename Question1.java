package conditionalandUnconditional;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x value");
		int x=scan.nextInt();
		System.out.println("Enter y value");
		int y=scan.nextInt();
		System.out.println("Enter z value");
		int z=scan.nextInt();
		if(x>y && x>z)
		{
			System.out.println("X is greater: "+x);
		}
		else if (x<y&&y>z)
		{
			System.out.println("Y is greater: "+y);
		}
		else if(z>x&&z>y)
		{
			System.out.println("Z is greater: "+z);
		}
		else
		{
			System.out.println("No number is greater ");
		}
	}

}
