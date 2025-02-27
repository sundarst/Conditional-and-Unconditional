package unconditional;
import java.util.Scanner;
public class UnQuestion2 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("start number");
		int start=scan.nextInt();
		System.out.println("End number");
		int end=scan.nextInt();
		
		for(int n=start;n<=end;n++)
		{
			boolean isprime=true;
			for( int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime && n>1)
			{
				System.out.println(n);
			}
		}
		
			
		
	}
}
