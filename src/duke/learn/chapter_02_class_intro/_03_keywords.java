package duke.learn.chapter_02_class_intro;

/**
 * 
 * @author Kazi
 *
 */
public class _03_keywords {

    int number = 2;

    public static void main(String[] args) {
	_03_keywords obj = new _03_keywords();
	// obj.doSomeWork();
	obj.testFinal();
    }

    /**
     * this keyword
     */
    void doSomeWork() {
	int number = 100;
	double power = Math.pow(number, 2);
	System.out.println(power);
	System.out.println(Math.pow(this.number, 2));
    }

    void testFinal() {
	int variable1 = 10;
	int variable2 = 20;
	final int constant1 = 5;

	variable1 = 30;
	variable2 = 40;
	// constant1 = 50;

	System.out.println(String.format("%d,%d,%d", variable1, variable2, constant1));
    }
}
