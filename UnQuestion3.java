package unconditional;

public class UnQuestion3 {

	public static void main(String[] args)
	{

		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				continue;
			}
			System.out.println(arr[i]);
		}
	}

}
