import java.util.Random;


public class Practice03Test {

	protected int count = 0;
	protected double [] arr;


	/**
	 * Constructor
	 */
	public Practice03Test (String [] args) {
		try {
			count = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("Defaulting array size to 20.");
			count = 20;
		}
		arr = new double[count];
		generate_array();
	}


	/**
	 * print_array: prints the array of doubles... formatted so it fits
	 * ... on many small screens.
	 */
	public void print_array() {
		System.out.println("------------------------------------");
		System.out.println("Array contains the values:");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%.2f ", arr[i]);
			if (i > 0 && i % 9 == 0)
				System.out.println();
		}
		System.out.println("\n------------------------------------");
	}


	/**
	 * Fills the array with random double instances.
	 */
	public void generate_array() {
		Random rand = new Random();
		double min = 1.0;
		double max = 100.0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + rand.nextDouble() * (max-min);
		}
	}

	// This method finds the minimum value of an array iteratively.
	public int find_min_iterative (double[] arr) // FINAL RUNTIME: O(n)
	{
		// TODO: Fill in this iterative function.

		// Data Member.
		int min = 0; // O(1)

		// Loops through array.
		for (int i = 1; i < arr.length; i++) // O(n)
		{
			// Conditional for if a value is less than minimum.
			if (arr[i] < arr[min]) // O(n)
			{
				// Updates minimum value.
				min = i; // O(n)
			}
		}

		// Returns final min value.
		return min; // O(1)
	}


	// This method finds the minimum value of an array recursively. 
	public int find_min_recursive (double[] arr, int count, int min) // FINAL RUNTIME: O(n^2)
	{
		// TODO: Fill in this recursive function.

		// Base case.
		if (count == arr.length)
		{
			return min; // O(1)
		}

		// Conditional for if a value is less than current min.
		if (arr[count] < arr[min])
		{
			// Updates min and calls method again.
			min = count;
			return find_min_recursive(arr, count + 1, min); // O(n^2)
		}

		// Conditional for if a value is anything other than less than current min.
		else
		{
			// Calls method again. 
			return find_min_recursive(arr, count + 1, min); // O(n^2)
		}
	}

	// This method instantiates some of the variables that will be needed later in find_min_recursive.
	public int find_min_recursive () {
		// Data Members
		int min = 0; // O(1)
		int count = 1; // O(1)

		// Calls method to find minimum value recursively.
		return find_min_recursive(arr, count, min); // O(1)
	}


	/**
	 * print_min: determines the min iteratively and recursively.
	 * ... and prints them both.
	 */
	public void print_min() {
		System.out.println("Iteratively determined min at index " + find_min_iterative(arr));
		System.out.println("Recursively determined min at index " + find_min_recursive());
	}


	/**
	 * main for Practice 03: print the array and determine the min.
	 */
	public static void main(String [] args) {
		Practice03Test test = new Practice03Test(args);
		test.print_array();
		test.print_min();
	}

}
