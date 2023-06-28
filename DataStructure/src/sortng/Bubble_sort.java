package sortng;

import java.util.Arrays;
public class Bubble_sort
{
	
	// Driver code
	public static void main(String args[])
	{int temp;
		int arr[] = {2, 13, 4, 10, 4};
		for(int i=0;i<arr.length-1;i++){
		    for(int j=0;j<arr.length-1-i;j++){
		      if(arr[j]<arr[j+1]){
		          temp=arr[j];
		          arr[j]=arr[j+1];
		          arr[j+1]=temp;
		      }  
		    }
		}
		
		//sorted Arrays
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}

