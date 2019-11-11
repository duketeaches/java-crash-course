package duke.learn.chapter_04_override_overload;

/**
 * 
 * @author Kazi
 *
 */
public class Overload {

    public static void main(String[] args) {
	Human human = new Human();
	human.makeSound();
	human.makeSound("English");
    }

}

class Human extends Animal {

    void makeSound() {
	System.out.println("Speak");
    }

    void makeSound(String words) {
	System.out.println("Speaking " + words);
    }
}