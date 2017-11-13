package selfCoding;

public class CodingMethods {


	//1. Write a method which takes as input as a one number (5) and returns first five even numbers.
	public static String printFirstEvenNumbers(int num) {
		int i = 1;
		int amount = 0;
		String str = "";
		while(amount!=num) {
			if(i%2==0) {
				str += i+" ";
				amount++;
			}
			i++;
		}
		return str;
	}
	//2. Write a method which takes as input as a one number (10) and returns first ten odd	numbers.
	
	public static String printFirstOddNumbers(int num) {
		int i = 1;
		int amount = 0;
		String str = "";
		while(amount!=num) {
			if(i%2!=0) {
				str += i+" ";
				amount++;
			}
			i++;
		}
		return str;
	}
	
//	3. Write a method which takes as input as a one number (7) and returns first seven
//	square numbers.
	public static String printFirstSquareNumbers(int num) {
		int i = 1;
//		int amount = 0;
		String str = "";
		while(i<=num) {
				str+=(i*i+" ");
				i++;
		}
		return str;
	}

		
//	4. Write a method which takes as input as a one number and returns the product of
//	a number.
	public static String printProductNumbers(int num) {
		int i = 1;
		int sum = 1;
		while(i<num) {
			sum*=i;
			i++;
		}
		return sum*num+""; 
	}
	
//	5. Write a method which takes as input as a two number and returns swape of
//	numbers.
	
	public static String swipe(int numA, int numB) {
		System.out.println(numA+"  and "+numB );
		return numB+" "+ numA;
	}
	
//	6. Write a method which takes as input as a two number and returns the maximum
//	of the two.
	public static String returnMax(int numA, int numB) {
		return ""+Math.max(numA, numB);
	}
	
//	7. Write a method which takes as input as a two number and returns the minimum
//	of the two.
	
	public static String returnMin(int numA, int numB) {
		return ""+Math.min(numA, numB);
	}
	
//	8. Write a method which takes as input as a one number and returns the factorial of
//	a number.
	
	public static int findFactorialA(int num) {
		if(num<=0) {
			return 1;
		}
		return num*findFactorialA(num-1);
	}
	
	public static String findFactorial(int num) {
		int i = findFactorialA(num);
		return ""+i;
	}
	
//	9. Write a method which takes as input as a three number and returns the
//	maximum of the three.
	
	public static String returnMaxOfThree(int numA, int numB, int numC) {
		return ""+Math.max(Math.max(numA, numB),numC);
	}
	
//	10. Write a method which takes as input as a three number and returns the minimum
//	of the three.
	
	public static String returnMinOfThree(int numA, int numB, int numC) {
		return ""+Math.min(Math.min(numA, numB),numC);
	}
	

	public static void main(String[] args) {
	
//	    System.out.println(printFirstEvenNumbers(5));
//	    System.out.println(printFirstOddNumbers(10));
//	    System.out.println(printFirstSquareNumbers(7));
//	    System.out.println(printProductNumbers(5));
//	    System.out.println(returnMin(10,-1));
	    System.out.println(findFactorial(10));
	    
	}
}