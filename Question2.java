package conditionalandUnconditional;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark=scan.nextInt();
		if(mark>100)
		{
			System.out.println("Invalid input! Marks should be within 100");
		}
		else if(mark>=90)
		{
			System.out.println("O Grade");
		}
		else if(mark>=80)
		{
			System.out.println("A+ Grade");
		}
		else if(mark>=70)
		{
			System.out.println("A Grade");
		}
		else if(mark>=60)
		{
			System.out.println("B+ Grade");
		}
		else if(mark>=50)
		{
			System.out.println("B Grade");
		}
		else
		{
			System.out.println("Fail! Be hopeful and keep going.");
		}
		
	}

}
