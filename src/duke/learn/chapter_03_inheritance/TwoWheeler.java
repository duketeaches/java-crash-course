/**
 * 
 */
package duke.learn.chapter_03_inheritance;

/**
 * @author Kazi
 *
 */
public class TwoWheeler extends Vehicle {

    String clutchType;

    /**
     * @param colour
     * @param engineSize
     * @param clutchType
     */
    public TwoWheeler(String colour, String engineSize, String clutchType) {
	super(colour, engineSize);
	this.clutchType = clutchType;
	System.out.println("Contructing TwoWheeler with parameters");
    }

    /**
     * 
     */
    public TwoWheeler() {
	System.out.println("Contructing Two Wheeler without parameters");
    }

    @Override
    public String toString() {
	return "TwoWheeler [clutchType=" + clutchType + ", colour=" + colour + ", engineSize=" + engineSize + "]";
    }

}
