package selfCoding;

import java.util.ArrayList;
import java.util.Arrays;

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
		for(int i=0; i<numsList.size(); i+=2) {
			a+=numsList.get(i);
		}
		return a;	
	}

	//2. Return the count of all the even numbers in the array list. Hint: The % operator may be useful.

//Important Note: Copy the following two methods into the window and 
//don't change evenCount.  Enter your code into method evenCountB:
	public static int evenCount(int[] nums) { 

	    ArrayList<Integer> numsList = new ArrayList<Integer>();
	    for (int i=0; i<nums.length; i++)
	    {
	       numsList.add(nums[i]);
	    }
	    
	    return evenCountB(numsList);
	}

	public static 
	int evenCountB(ArrayList<Integer> numsList){   
		int count = 0;
		for(int i = 0; i<numsList.size();i++) {
			if(numsList.get(i)%2==0) {
				count++;
			}
		}
		return count;
	}
	
//3. Given a string, return an array list that contains each character of the string in backwards order.	
//	Important Note: Copy the following two methods into the window and 
//	don't change catty.  Enter your code into method cattyB:
	public static char[] backwardChars(String str) { 

	    ArrayList<Character> charsList = backwardCharsB(str);
	    
	    char chars[] = new char[charsList.size()];
	    for (int i=0; i<charsList.size(); i++)
	    {
	       chars[i]=charsList.get(i);
	    }

	    return chars;
	}

	public static ArrayList<Character> backwardCharsB(String str){    
		ArrayList<Character>list = new ArrayList<>();
		for(int i= str.length()-1;i>=0;i--) {
			list.add(str.charAt(i));
		}
		return list;
	}
	
	//4. An array list contains a list of animals. If the animal is a cat (i.e. the animal's descrition 
	//contains the word "cat" or "Cat"), 
	//then add it to a new array list. Return the new array list of cats.

//Important Note: Copy the following two methods into the window and 
//don't change catty.  Enter your code into method cattyB:
	public static String[] catty(String[] animals) { 

	    ArrayList<String> animalsList = new ArrayList<String>();
	    for (int i=0; i<animals.length; i++) {
	       animalsList.add(animals[i]);
	    }
	    
	    ArrayList<String> catsList = cattyB(animalsList);
	    
	    String cats[] = new String[catsList.size()];
	    for (int i=0; i<catsList.size(); i++) {
	       cats[i]=catsList.get(i);
	    }

	    return cats;
	}

	public static ArrayList<String> cattyB(ArrayList<String> animalsList)	{ 
		ArrayList<String> arrList = new ArrayList<>();
		for(String cat:animalsList) {
			if(cat.toLowerCase().contains("cat")) {
				arrList.add(cat);
			}
		}
		return arrList ;
	}

	// Test Scenarios:

	//catty(["buffalo", "dog"]) → []
		//	catty(["bobcat", "siamese cat", "catbird"]) → ["bobcat", "siamese cat", "catbird"]
			//catty(["Cat", "frog", "mouse"]) → ["Cat"]

	public static void main(String[] args) {
//		int []arr = new int [] {1, 2, 3, 4};
//		int []arr1 = new int [] {8, 16, 10};
//		int []arr2 = new int [] {5, 0, -10};
//		int []arr3 = new int [] {1, 2, 3, 4};
//		int []arr4 = new int [] {8, 16, 10};
//		int []arr5 = new int [] {5, 0, 22};
//		System.out.println(sumEvenIndexes(arr));
//		System.out.println(evenCount(arr3));
//		System.out.println(evenCount(arr4));
//		System.out.println(evenCount(arr5));
		
//		char[] charArr = backwardChars("Career Center");
//		for(char ch:charArr) {
//			System.out.print(ch+" ");			
//		}
//		System.out.println();
//		
//		char[] charArr1 = backwardChars("football");
//		for(char ch:charArr1) {
//			System.out.print(ch+" ");
//		}
//		String[] arr = catty(new String [] {"bobcat", "siamese cat", "catbird"});
		String[] arr = catty(new String [] {"Cat", "frog", "mouse"});
//		String[] arr = catty(new String [] {"buffalo", "dog"});
		System.out.print("[");
		for(String str:arr ) {
			System.out.print(str);
		}
		System.out.print("]");
		
	}

}
