/**
 * 
 */
package duke.learn.chapter_07_thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author Kazi
 *
 */
public class ThreadTest {

    // TODO - implement all the other stuffs
    // :https://www.baeldung.com/java-thread-lifecycle
    // TODO - all other concepts
    public static void main(String[] args) throws InterruptedException, ExecutionException {
	ThreadTest test = new ThreadTest();
	test.usingThread();
	// test.usingRunnable();
    }

    synchronized static void doMoreWork() {
	System.out.println(Thread.currentThread().getId() + "  => " + "line 1");
	System.out.println(Thread.currentThread().getId() + "  => " + "line 2");
    }

    void usingThread() {
	// do some work
	System.out.println(Thread.currentThread().getId() + "  => " + "Doing work");
	Thread thread = new SimpleThread("first thread");
	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(12);
	executorService.submit(thread);
	executorService.submit(new SimpleThread("2nd work"));
	System.out.println(Thread.currentThread().getId() + "  => " + "Continuing work");
	executorService.shutdown();
    }

    void usingRunnable() {
	SimpleRunner runner = new SimpleRunner("First work");
	// runner.run();
	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(12);
	executorService.submit(runner);
	// executorService.shutdown();

	executorService.submit(() -> {
	    System.out.println("some runn");
	});
	executorService.shutdown();
    }
}

class SimpleThread extends Thread {

    private String message;

    @Override
    public void run() {
	System.out.println(this.getId() + "  => " + message);
	int i = 0;
	while (i <= 9999999) {
	    // ThreadTest.doMoreWork();
	    i++;
	    if (i % 500000 == 0) {
		System.out.println(this.getId() + "  => " + "thead work..." + message);
	    }
	}
    }

    /**
     * @param message
     */
    public SimpleThread(String message) {
	super();
	this.message = message;
    }
}

class SimpleRunner implements Runnable {

    private String message;

    /**
     * @param message
     */
    public SimpleRunner(String message) {
	super();
	this.message = message;
    }

    @Override
    public void run() {
	System.out.println(message);
	int i = 0;
	while (i <= 9999999) {
	    i++;
	    if (i % 500000 == 0) {
		System.out.println("thead work..." + message);
	    }
	}
    }
}