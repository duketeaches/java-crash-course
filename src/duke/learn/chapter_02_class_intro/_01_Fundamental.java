/**
 * 
 */
package duke.learn.chapter_02_class_intro;

/**
 * @author Kazi
 *
 */
public class _01_Fundamental {

    /**
     * @param args
     */
    public static void main(String[] args) {

	Dog myDog = new Dog();
	myDog.name = "German Shephard";
	String treeData = myDog.toString();
	System.out.println(treeData);
    }

}

/**
 * This is a simple class
 * 
 * @author Kazi
 *
 */
class Dog {

    String name;

    @Override
    public String toString() {
	return "Tree [name=" + name + "]";
    }

}
