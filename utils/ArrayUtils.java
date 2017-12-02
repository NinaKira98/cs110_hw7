package utils;

public class ArrayUtils {
	
	public static int[] reverse(int[] myAr) {
		int[] ff = new int[myAr.length];
		for(int i = 0; i < myAr.length; i++) {
			ff[i] = myAr[myAr.length - 1 - i];
		}
		
		return ff;
	}
	
	public static String stringifyArray(int[] array) {
		String result ="";
		
		for(int i = 0; i < array.length-1; i++) {
			result = result + array[i] + ", ";
		}
		return result + array[array.length-1];
	}
}