package duke.learn.chapter_02_class_intro;

public class _02_Contstructor {

    public static void main(String[] args) {
	Tree oakTree = new Tree(true, "Oak");
	System.out.println(oakTree);

	Tree orange = new Tree();
	orange.evergreen = true;
	orange.name = "Orange";
	System.out.println(orange);
    }
}

class Tree {
    boolean evergreen;
    String name;

    /**
     * @param evergreen
     * @param name
     */
    public Tree(boolean evergreen, String name) {
	this.evergreen = evergreen;
	this.name = name;
	System.out.println("Contructing Tree with parameters");
    }

    /**
     * 
     */
    public Tree() {
	System.out.println("Constructing without parameters");
    }

    @Override
    public String toString() {
	return "Tree [evergreen=" + evergreen + ", name=" + name + "]";
    }

}