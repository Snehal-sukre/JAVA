/* Write a Program in Java to find a Subarray with given sum from the Given Array?
Expected Output: The Given Array is: 3 4 -7 1 3 3 1 -4
Enter Sum to Find Subarray:7
[0..1] -- {3,4}
[0..5] -- {3,4,-7,1,3,3]
[3..5] -- {1,3,3}
[4..6] -- {3,3,1} */
import java.util.*;
public class FindSubArray
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[8];
		System.out.println("Enter Array Elements:");   //Enter Array Elements
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter Sum:");        //Input Sum to Find Pair of Elements that equal to Sum
		int targetSum=s.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum==targetSum)              //condition to check Elements that Equal to Sum
				{
					System.out.printf("[ %d..%d\t]--{ ",i,j);
					for(int k=i;k<=j;k++)
					{
						System.out.printf("%d, ",a[k]);
						//if(k<j)
						//{
							//System.out.printf(" ,");
						//}
					}
					System.out.println("}");
				}
			}
		}
	}
}
		