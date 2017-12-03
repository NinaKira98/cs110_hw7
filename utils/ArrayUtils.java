package utils;

public class ArrayUtils {
	
	public static void reverse(int[] myAr) {
		for (int i = 0; i <= (myAr.length - 1)/2; i++) {
			int li = myAr.length - 1;
			myAr[i] = myAr[i] + myAr[li - i];
			myAr[li - i] = myAr[i] - myAr[li - i];
			myAr[i] = myAr[i] - myAr[li - i];
		 }
	}
	
	public static String stringifyArray(int[] array) {
		String result ="";
		
		for(int i = 0; i < array.length-1; i++) {
			result = result + array[i] + ", ";
		}
		return result + array[array.length-1];
	}
}
