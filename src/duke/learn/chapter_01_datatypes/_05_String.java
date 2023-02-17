/**
 * 
 */
package duke.learn.chapter_01_datatypes;

/**
 * @author Kazi
 *
 */
public class _05_String {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int first = 200;
	int second = 300;
	Integer third = 300;
	String s1 = "kazi"; // literal
	String s2 = "kazi";
	String s3 = new String("kazi"); // object
	String s4 = s3;
	System.out.println("s1 = " + s1);
	System.out.println("s2 = " + s2);
	System.out.println("s3 = " + s3);

	if (second == third)
	    System.out.println("integers are same");
	else
	    System.out.println("different integers");
	if (s3 == s4)
	    System.out.println("Same strngs");
	else
	    System.out.println("Diff strings");
    }

}
