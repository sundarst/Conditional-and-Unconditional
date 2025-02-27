package unconditional;

public class UnQuestion1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,5,5,6,7,7};
		
		for(int i=0;i<arr.length;i++)
		{   int count=0;
				for(int j=0;j<=i;j++)
				{
					if(arr[j]==arr[i])
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println("Secound Occurancy: "+arr[i]);
				}
		}
		
	}

}
