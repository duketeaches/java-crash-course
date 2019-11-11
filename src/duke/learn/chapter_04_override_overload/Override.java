/**
 * 
 */
package duke.learn.chapter_04_override_overload;

/**
 * @author Kazi
 *
 */
public class Override {

    public static void main(String[] args) {

	Cat cat = new Cat();
	cat.makeSound();
	cat.makeParentSound();

	Animal mcat = new Cat();
	mcat.makeSound();

    }

}

class Animal {
    void makeSound() {
	System.out.println("Making a general sound");
    }
}

class Cat extends Animal {

    void makeSound() {
	System.out.println("Meow");
    }

    void makeParentSound() {
	super.makeSound();
    }
}