/**
 * 
 */
package duke.learn.chapter_05_interfaces;

/**
 * @author Kazi
 *
 */
public class InterfaceTest {

    public static void main(String[] args) {
	Contract roadcontract = new RoadContract();

	roadcontract.levelGround();
	roadcontract.layRoad();

	Contract highwaycontract = new HighwayContract();
	highwaycontract.levelGround();
	highwaycontract.layRoad();
    }

}

interface Contract {

    void levelGround();

    void layRoad();
}

abstract class BasicContractor implements Contract {

    @Override
    public void levelGround() {
	System.out.println("Levelling Ground");

    }
}

/**
 * final test
 * 
 * @author Kazi
 *
 */
class RoadContract extends BasicContractor {

    @Override
    public void levelGround() {
	System.out.println("Levelling ground for road");
    }

    @Override
    public void layRoad() {
	System.out.println("Laying road");
    }

}

class HighwayContract extends RoadContract {

    @Override
    public void layRoad() {
	System.out.println("Laying Road for highway");
    }

}