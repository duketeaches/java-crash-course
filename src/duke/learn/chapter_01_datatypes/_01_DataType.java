/**
 * 
 */
package duke.learn.chapter_01_datatypes;

/**
 * @author Kazi
 *
 */
@SuppressWarnings("unused")
public class _01_DataType {
    /**
     * <table class="w3-table-all notranslate">
     * <tbody>
     * <tr>
     * <th style="width:20%">Data Type</th>
     * <th style="width:17%">Size</th>
     * <th style="width:63%">Description</th>
     * </tr>
     * <tr>
     * <td>byte</td>
     * <td>1 byte</td>
     * <td>Stores whole numbers from -128 to 127</td>
     * </tr>
     * <tr>
     * <td>short</td>
     * <td>2 bytes</td>
     * <td>Stores whole numbers from -32,768 to 32,767</td>
     * </tr>
     * <tr>
     * <td>int</td>
     * <td>4 bytes</td>
     * <td>Stores whole numbers from -2,147,483,648 to 2,147,483,647</td>
     * </tr>
     * <tr>
     * <td>long</td>
     * <td>8 bytes</td>
     * <td>Stores whole numbers from -9,223,372,036,854,775,808 to
     * 9,223,372,036,854,775,807</td>
     * </tr>
     * <tr>
     * <td>float</td>
     * <td>4 bytes</td>
     * <td>Stores fractional numbers. Sufficient for storing 6 to 7 decimal
     * digits</td>
     * </tr>
     * <tr>
     * <td>double</td>
     * <td>8 bytes</td>
     * <td>Stores fractional numbers. Sufficient for storing 15 decimal digits</td>
     * </tr>
     * <tr>
     * <td>boolean</td>
     * <td>1 bit</td>
     * <td>Stores true or false values</td>
     * </tr>
     * <tr>
     * <td>char</td>
     * <td>2 bytes</td>
     * <td>Stores a single character/letter or ASCII values</td>
     * </tr>
     * 
     * </tbody>
     * </table>
     * 
     */
    public static void main(String[] args) {

	// datatype - variables
	int number = 2000000000; // 2.1 billion
	byte b = 127;
	short sh = 32000;
	long l = 2000000000888888888l; // 9 million billion
	float fl = 23.44f;
	double d = 999.88;
	char ch = 'a'; // 1 character
	String str = "some text"; // sequence of characters
	boolean bool = true; // 0 or 1

	System.out.println(Byte.MAX_VALUE);
	System.out.println(Short.MAX_VALUE);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Long.MAX_VALUE);
	System.out.println(Float.MAX_VALUE + " . " + Float.MAX_EXPONENT);
	System.out.println(Double.MAX_VALUE + " . " + Double.MAX_EXPONENT);
	// casting - lower to upper - automatic
	number = b;
	// b = (byte) number;
	System.out.println(b);
	// System.out.println(number);

	d = fl;
	System.out.println(d);
	// fl = (float) d;
	// System.out.println(fl);

    }

}
