/**
 * 
 */
package duke.learn.chapter_09_singleton;

/**
 * @author Kazi
 *
 */
public class MySingleton {

    private static MySingleton object;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
	if (object == null) {
	    object = new MySingleton();
	}
	return object;
    }
}
