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

	// RC390 myBike = new RC390("Orange", "400cc", "Dry Plate", "RC 390");
	//
	// System.out.println(myBike);

	A a = new B();
	a.m2();

	IB ib = new AI();
	ib.iM1();
	AI ai = new AI();
	ai.iM1();

    }

}

class A {
    public static void m1() {
	System.out.println("A");
    }

    void m2() {
	System.out.println("A m2");
    }
}

class B extends A {
    public static void m1() {
	System.out.println("B");
    }

    void m2() {
	System.out.println("B m2");
    }
}

interface IA {
    default void iM1() {
	System.out.println("IA IM1");
    }

    static void iS1() {
	System.out.println("IA IS1");
    }
}

interface IB extends IA {
    default void iM1() {
	System.out.println("IB IM1");
    }

    static void iS1() {
	System.out.println("IB IS1");
    }
}

class AI implements IB, IA {

}