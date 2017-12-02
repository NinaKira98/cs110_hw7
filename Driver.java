import animals.Puppy;
import utils.Math;
import utils.ArrayUtils;

public class Driver {
	public static void main(String[] args) {
		
		Puppy p1 = new Puppy("Joey");
		Puppy p2 = new Puppy("Chandler");
		Puppy p3 = new Puppy("Ross");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		System.out.println("By the way, I LOVE Frineds, too ;) ");
		System.out.println(" ");
		
		int[] array = {9, 20, 3, 44, 88, 300};
		int[] toBeString = ArrayUtils.reverse(array);
		System.out.println(ArrayUtils.stringifyArray(toBeString));
		
		double val = 15.4;
		int result = Math.factorial((int)val);
		System.out.println(result);
		int result1 = Math.factorialLoop((int)val);
		System.out.println(result1);
		//Btw, for 15 this is not correct, as the max int for which the factorial will be calculated
		//accurately this way is 12 (max int value is 2,147,483,647 (inclusive)). I don't like providing wrong answers,
		//so here is one that will do it properly :)
		System.out.println(Math.factorial2((int)val));		
		
	}
}