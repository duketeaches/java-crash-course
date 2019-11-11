/**
 * 
 */
package duke.learn.chapter_08_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Kazi
 *
 */
public class Comparing {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Comparing test = new Comparing();
	// test.testComparable();
	test.testComparator();

    }

    void testComparable() {
	List<Student> students = new ArrayList<>();
	students.add(new Student(10, "Student 10"));
	students.add(new Student(9, "Student 9"));
	students.add(new Student(8, "Student 8"));
	students.add(new Student(7, "Student 7"));
	students.add(new Student(6, "Student 6"));
	students.add(new Student(5, "Student 5"));
	students.add(new Student(4, "Student 4"));
	students.add(new Student(3, "Student 3"));
	students.add(new Student(2, "Student 2"));
	students.add(new Student(1, "Student 1"));

	Collections.sort(students);
	for (Student student : students) {
	    System.out.println(student);
	}
    }

    void testComparator() {
	List<NewStudent> students = new ArrayList<>();
	students.add(new NewStudent(10, "Student 10"));
	students.add(new NewStudent(9, "Student 9"));
	students.add(new NewStudent(8, "Student 8"));
	students.add(new NewStudent(7, "Student 7"));
	students.add(new NewStudent(6, "Student 6"));
	students.add(new NewStudent(5, "Student 5"));
	students.add(new NewStudent(4, "Student 4"));
	students.add(new NewStudent(3, "Student 3"));
	students.add(new NewStudent(2, "Student 2"));
	students.add(new NewStudent(1, "Student 1"));

	// Collections.sort(students);
	// for (Student student : students) {
	// System.out.println(student);
	// }
	Collections.sort(students, new StudentComparator());
	for (NewStudent student : students) {
	    System.out.println(student);
	}
    }

}

class Student implements Comparable<Student> {
    int rank;
    String name;

    /**
     * @param rank
     * @param name
     */
    public Student(int rank, String name) {
	super();
	this.rank = rank;
	this.name = name;
    }

    @Override
    public int compareTo(Student o) {
	return this.rank - o.rank;
    }

    @Override
    public String toString() {
	return "Student [rank=" + rank + ", name=" + name + "]";
    }

}

class NewStudent {
    int rank;
    String name;

    /**
     * @param rank
     * @param name
     */
    public NewStudent(int rank, String name) {
	super();
	this.rank = rank;
	this.name = name;
    }

    @Override
    public String toString() {
	return "NewStudent [rank=" + rank + ", name=" + name + "]";
    }

}

class StudentComparator implements Comparator<NewStudent> {

    @Override
    public int compare(NewStudent o1, NewStudent o2) {
	return o1.rank - o2.rank;
    }

}