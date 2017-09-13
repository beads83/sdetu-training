package basics;

public class Factorial {

	public static void main(String[] args) {
		/*1. Write a function that takes a value n returns the sum of numbers 1 to n
		2. Write a function that computes the factorial value
		Definition: n! = n*(n-1)! , where 0! = 1
		1! = 1
		2! = 2 * 1! = 2 * 1
		3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
		4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
		Hint: use the recursive method that was used to calculate Fibonnaci number
		3. Write 3 functions that take an array as a parameter and return the minimum,
		average, and maximum values of that array.
		Hint: this should be static functions with a return type of the same data type as the array
		declaration.
		*/
		System.out.println(fac(0));
	}
	
		public static int fac(int n) {
			if (n == 0) {
				return 0;
			}
			else if (n == 1  ) {
				return 1;
			}
			return( ((fac(n-1) + fac(n-2)))   );
		
		

	}

}
