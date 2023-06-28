package sortng;
import java.util.*;

public class Merge_sort {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int k = 0;
		int arr1[] = {3, 4, 6, 8, 12, 15};
		int n1 = arr1.length;

		int arr2[] = {1, 5, 6, 16};
		int n2 = arr2.length;

		int arr3[] = new int[n1 + n2];
		
		while(i < n1){
			arr3[k++] = arr1[i++];
			}
			
			while(j < n2){
			arr3[k++] = arr2[j++];
			}
			Arrays.sort(arr3);

		System.out.println("Array after merging");
		for (i=0; i < n1+n2; i++)
			System.out.print(arr3[i] + " ");		
	}
}