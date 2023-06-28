package sortng;

import java.util.Arrays;
public class Selection_sort
{
	
	// Driver code
	public static void main(String args[])
	{int temp;
		int arr[] = {2, 13, 4, 10, 4};
		for(int i=0;i<arr.length-1;i++){
		    for(int j=i+1;j<arr.length;j++){
		      if(arr[i]<arr[j]){
		          temp=arr[i];
		          arr[i]=arr[j];
		          arr[j]=temp;
		      }  
		    }
		}
		
		//sorted Arrays
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}

