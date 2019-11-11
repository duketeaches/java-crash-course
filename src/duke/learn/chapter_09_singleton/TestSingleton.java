/**
 * 
 */
package duke.learn.chapter_09_singleton;

/**
 * @author Kazi
 *
 */
public class TestSingleton {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
	// MySingleton singleton = MySingleton.getInstance();
	// MySingleton singleton2 = MySingleton.getInstance();
	MySingleton s3 = (MySingleton) BeanFactory.getBean(MySingleton.class);
	MySingleton s4 = (MySingleton) BeanFactory.getBean(MySingleton.class);
	System.out.println("");
    }

}
