/**
 * 
 */
package duke.learn.chapter_03_inheritance;

/**
 * @author Kazi
 *
 */
public class RC390 extends TwoWheeler {

    String ktmCode = "RC 390";

    /**
     * @param colour
     * @param engineSize
     * @param clutchType
     * @param ktmCode
     */
    public RC390(String colour, String engineSize, String clutchType, String ktmCode) {
	super(colour, engineSize, clutchType);
	this.ktmCode = ktmCode;
	System.out.println("Contructing KTM with parameters");
    }

    /**
     * 
     */
    public RC390() {
	System.out.println("Contructing KTM without parameters");
    }

    @Override
    public String toString() {
	return "RC390 [ktmCode=" + ktmCode + ", clutchType=" + clutchType + ", colour=" + colour + ", engineSize="
		+ engineSize + "]";
    }

}
