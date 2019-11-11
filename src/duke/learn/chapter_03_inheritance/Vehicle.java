/**
 * 
 */
package duke.learn.chapter_03_inheritance;

/**
 * @author Kazi
 *
 */
public class Vehicle {

    String colour;

    String engineSize;

    /**
     * @param colour
     * @param engineSize
     */
    public Vehicle(String colour, String engineSize) {
	System.out.println("Contructing Vehicle with parameters");
	this.colour = colour;
	this.engineSize = engineSize;
    }

    /**
     * 
     */
    public Vehicle() {
	System.out.println("Contructing Vehicle without parameters");
    }

    void blowHorn() {
	System.out.println("Honk!");
    }

    @Override
    public String toString() {
	return "Vehicle [colour=" + colour + ", engineSize=" + engineSize + "]";
    }

}
