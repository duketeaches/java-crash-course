/**
 * 
 */
package duke.learn.chapter_01_datatypes;

/**
 * @author Kazi
 *
 */
public class _03_Operators {

    public static void main(String[] args) {
	// arithmetic();
	ternary();
    }

    public static void arithmetic() {
	int a = 5;
	int b = 2;

	System.out.println(a + b);
	System.out.println(a * b);
	System.out.println(a - b);
	System.out.println((double) a / (double) b);
	System.out.println(a % b);
    }

    public static void bitwise() {

    }

    public static void relational() {

    }

    public static void logical() {

    }

    public static void ternary() {
	int i = 10, j = 20;
	int k = (i > j) ? (i) : (j);
	System.out.println(k);
    }

    public static void precedence() {

    }
}
