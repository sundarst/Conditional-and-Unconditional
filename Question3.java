package conditionalandUnconditional;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for  multiplication table");
		int num=scan.nextInt();
		System.out.println("Enter the limit (end value) for the table: ");
		int end=scan.nextInt();
		for(int i=1;i<=end;i++)
		{
			System.out.println(i+"*"+num+"="+num*i);
		}
	}

}
