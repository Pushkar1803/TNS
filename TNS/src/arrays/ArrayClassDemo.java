package arrays;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get the array
		int Arr[]= {69,2,20,12,40,35};
		//print array
		System.out.println(Arr);
		System.out.println(Arrays.toString(Arr));
		
		for(int i=0; i<Arr.length;i++) {
			System.out.print(Arr[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(Arr);
		System.out.println(Arrays.toString(Arr));
		//binary search
		System.out.println(Arrays.binarySearch(Arr, 13));
		
		//comparison
		
		System.out.println(Arrays.toString(Arr));
		
		//get second array
				
		int Arr1[]= {69,2,20,12,40,35};
		System.out.println(Arrays.toString(Arr1));
		
		Arrays.sort(Arr1);
		//compare both arrays
		
		if(Arrays.compare(Arr, Arr1)==0){
			System.out.println("Both are same");
		}
		else {
			System.err.println("Both are diff array");
		}
		
		int Arr2[]=Arrays.copyOf(Arr, 3);
		System.out.println(Arrays.toString(Arr2));
		
		Arrays.fill(Arr2, 999);
		System.out.println(Arrays.toString(Arr2));
		
		
	}

}
