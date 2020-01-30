package abc;

import java.util.*;

public class max_subarray {
	
	Scanner sc=new Scanner(System.in);
	
	void get_input() {
		
		System.out.println("Enter the number of terms");
	    int n=sc.nextInt();
	    int []arr=new int[n];
		System.out.println("Enter terms");
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    
	    System.out.println("Enter the size of subArray");
	    int k=sc.nextInt();
		
	    get_max(arr,k);
	}
	
	void get_max(int arr[],int k)
	{
		for(int i=0;i<arr.length-k+1;i++)
		{
			int max=0;
			for(int j=i;j<k+i;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				}
			}
			System.out.println(max+" ");
		}
	}
	
	public static void main(String args[])
	{
		max_subarray obj=new max_subarray();
		
		obj.get_input();
			    
	}
	


}
