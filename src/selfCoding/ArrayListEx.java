package selfCoding;

import java.util.ArrayList;

public class ArrayListEx {
	
	// Return the sum of all the numbers at even positions in the array list.

	public static int sumEvenIndexes(int[] nums) { 

	    ArrayList<Integer> numsList = new ArrayList<Integer>();
	    for (int i=0; i<nums.length; i++){
	       numsList.add(nums[i]);
	    }
	    
	    return sumEvenIndexesB(numsList);
	}


	public static int sumEvenIndexesB(ArrayList<Integer> numsList)	{  
		int a = 0;
		for(int i=0; i<numsList.size(); i++) {
			if(i%2==0) {
				a+=numsList.get(i);
			}
		}
		return a;	
	}

	
	public static void main(String[] args) {
		int []arr = new int [] {1, 2, 3, 4};
		System.out.println(sumEvenIndexes(arr));
	}

}
