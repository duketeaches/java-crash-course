package duke.learn.chapter_01_datatypes;

/**
 * 
 * @author Kazi
 *
 */
public class _04_Control {

    public static void main(String[] args) {
	// _if();
	// _switch();
	_while();
	// _do();
	// _for();
	// _forEach();
    }

    static void _if() {

	int a = 20;
	int b = 20;

	if (a < b) {
	    System.out.println("a < b");
	} else if (a > b) {
	    System.out.println("a > b");
	} else if (a == b) {
	    System.out.println("a == b");
	}

	int i = 5;
	int j = 2;
	if (i == j) {
	    System.out.println("i==j");
	} else {
	    System.out.println("i != j");
	}

	boolean flag = true;
	if (flag) {
	    System.out.println("Flag is set");

	} else {
	    System.out.println("Flag is not set");
	}

	boolean flag2 = false;
	if (!flag2) {
	    System.out.println("Flag 2 is not set");
	} else {
	    System.out.println("Flag 2 is set");
	}
    }

    static void _switch() {
	int i = 100;
	switch (i) {
	case 1:
	    System.out.println("value is 1");
	    break;
	case 10:
	    System.out.println("Value is 10");
	    break;
	default:
	    System.out.println("default case");

	}
    }

    static void _while() {
	int i = 1;
	while (i <= 10) {
	    // if (i == 6) {
	    // break;
	    // }
	    // if (i > 3 && i < 7) {
	    // i++;
	    // continue;
	    // }
	    // if (i == 7) {
	    // return;
	    // }
	    System.out.println(i);
	    i++;
	}
	System.out.println("While loop is complete");
    }

    static void _do() {
	int i = 1;
	do {
	    System.out.println(i);
	    i++;
	} while (i <= 10);
    }

    static void _for() {
	for (int i = 0; i < 10; i++) {
	    System.out.println(i);
	}
    }

    static void _forEach() {
	String[] strArr = new String[] { "string one", "string two", "string three" };
	for (String str : strArr) {
	    System.out.println(str);
	}
    }

}
