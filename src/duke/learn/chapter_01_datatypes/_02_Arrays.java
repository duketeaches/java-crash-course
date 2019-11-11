/**
 * 
 */
package duke.learn.chapter_01_datatypes;

/**
 * @author Kazi
 *
 */
@SuppressWarnings("unused")
public class _02_Arrays {

    public static void main(String[] args) {
	// _02_Arrays
	int[] intArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	String[] strArr = new String[] { "string one", "string two", "string three" };
	System.out.println(intArr.length);
	System.out.println(strArr.length);

	printArray(intArr);
	printArray(strArr);

	intArr[0] = 100;
	printArray(intArr);
	intArr[11] = 33;
    }

    private static void printArray(Object[] arr) {
	System.out.println();
	for (Object object : arr) {
	    System.out.print(object + ", ");
	}
    }

    private static void printArray(int[] arr) {
	System.out.println();
	for (int object : arr) {
	    System.out.print(object + ", ");
	}
    }

    private static void printArray(long[] arr) {
	System.out.println();
	for (long object : arr) {
	    System.out.print(object + ", ");
	}
    }

    private static void printArray(float[] arr) {
	System.out.println();
	for (float object : arr) {
	    System.out.print(object + ", ");
	}
    }

    private static void printArray(double[] arr) {
	System.out.println();
	for (double object : arr) {
	    System.out.print(object + ", ");
	}
    }
}
