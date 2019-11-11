package duke.learn.chapter_03_inheritance;

/**
 * 
 * @author Kazi
 *
 */
public class TestVehicle {

    public static void main(String[] args) {

	// RC390 myBike = new RC390();
	// myBike.clutchType = "Dry Plate";
	// myBike.colour = "Orange";
	// myBike.engineSize = "400cc";

	RC390 myBike = new RC390("Orange", "400cc", "Dry Plate", "RC 390");

	System.out.println(myBike);

    }

}
