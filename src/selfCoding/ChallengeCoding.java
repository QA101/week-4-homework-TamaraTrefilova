package selfCoding;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChallengeCoding {

	public static int countCode1(String str) {
        Pattern pattern = Pattern.compile("co.e");
        Matcher  matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find())
            count++;

        return count;	
    }
	
	public static int countCode(String str) {
		int count = 0;
		for(int i = 0; i<str.length()-3;i++) {
			if(str.charAt(i)=='c') {
				if(str.charAt(i+1)=='o') {
					if(str.charAt(i+3)=='e') {
						count++;
					}
				}
			}
		}	
		return count;
	}
	
	public static boolean endOther(String strA, String strB) {
		strA = strA.toLowerCase();
		strB = strB.toLowerCase();
		int a = strA.length()-1;
		int b = strB.length()-1;
		 while(a>=0 && b>=0) {
			 if(strA.charAt(a)!=strB.charAt(b)) {
				 return false;
			 }
			 a--;
			 b--;
		 }
		return true;
	}
	
	public static String firstHalf(String str) {
		if(str.length()%2==0) {
			return str.substring(0, str.length()/2);
		}
		return null;
	}
	
	public static String reverseString(String str) {
		String strA = "";
		for(int i = str.length()-1; i>=0;i--) {
			strA+=str.charAt(i);
		}
		return strA;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(countCode("aaacodebbb"));
//		System.out.println(countCode("codexxcode"));
//		System.out.println(countCode1("cozexxcope"));
//		System.out.println(countCode("coz"));
//		System.out.println(endOther("Hiabc", "abc"));
//		System.out.println(endOther("AbC", "HiaBc"));
//		System.out.println(endOther("abc", "abXabc"));
//		System.out.println(endOther("abc", "abXab"));
//		System.out.println(endOther("abc", "c"));
//		System.out.println(endOther( "a","abc"));
//		System.out.println(firstHalf("WooHoo"));
//		System.out.println(firstHalf("HelloThere"));
//		System.out.println(firstHalf("abcdef"));
//		System.out.println(firstHalf("abdef"));
		System.out.println(reverseString("Hello there"));
		System.out.println(reverseString("Seattle is cool"));
		System.out.println(reverseString("I love Java"));
		
		
	}

}
