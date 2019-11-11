/**
 * 
 */
package duke.learn.chapter_09_singleton;

/**
 * @author Kazi
 *
 */
public class BeanFactory {

    public static <T> T getBean(Class T) {

	if (T.getName().equals(MySingleton.class.getName())) {
	    return (T) MySingleton.getInstance();
	}
	return null;
    }
}
