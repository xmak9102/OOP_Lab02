package sortarray;
import java.util.Arrays;

public class Sort_array {
	public static void main(String[] args) {
		int arr[] = {1789, 2035, 1899, 1456, 2014};
		Arrays.sort(arr);
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
		    total += arr[i];
		}
		System.out.println("Sorted: " + Arrays.toString(arr));
		System.out.println("Sum: " + total);
		System.out.println("Average: " + (double)total/arr.length);
	}
}
