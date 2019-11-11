/**
 * 
 */
package duke.learn.chapter_06_exceptions;

/**
 * @author Kazi
 *
 */
public class ExceptionHandling {

    public static void main(String[] args) {

	Integer i = 4;
	try {
	    i.intValue();
	    System.out.println(4 / 0);
	} catch (NullPointerException | ArithmeticException e) {
	    e.printStackTrace();
	}
	System.out.println("printing i : " + i);

	String string = "test string";
	System.out.println(string);

    }

}

/**
 * Throw and throws
 * 
 * @author Kazi
 *
 */
class Labour {

    public static void main(String[] args) {
	Labour labour = new Labour();
	try {
	    labour.doWork(4);
	    labour.doWork(13);
	    // return;
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    System.out.println("labour finished his work");
	}

    }

    void doWork(int hours) throws Exception {
	if (hours > 10) {
	    throw new TooManyHoursException("Too many hours");
	}
	System.out.println("Doing work for " + hours + " hours");
    }
}

class TooManyHoursException extends Exception {

    /**
     * 
     */
    public TooManyHoursException() {
	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public TooManyHoursException(String message, Throwable cause, boolean enableSuppression,
	    boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public TooManyHoursException(String message, Throwable cause) {
	super(message, cause);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param message
     */
    public TooManyHoursException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public TooManyHoursException(Throwable cause) {
	super(cause);
	// TODO Auto-generated constructor stub
    }

}