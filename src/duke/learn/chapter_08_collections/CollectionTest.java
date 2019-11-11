/**
 * 
 */
package duke.learn.chapter_08_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Kazi
 *
 */
public class CollectionTest {

    public static void main(String[] args) {
	CollectionTest test = new CollectionTest();
	// test.listTest();
	// test.testSet();
	test.testMap();
    }

    void listTest() {
	List<String> strList = new ArrayList<>();
	strList.add("str1");
	strList.add("kazi");
	strList.add("random guy");
	System.out.println(strList.size());
	System.out.println(strList);

	strList.remove("str1");
	System.out.println(strList);

	strList.add("str new");

	System.out.println(strList);

	List<String> newList = new ArrayList<>(strList);

	System.out.println(newList);

	for (String string : strList) {
	    System.out.println(string);
	    // test for concurrent modification exception
	    // if (string.equals("kazi")) {
	    // strList.remove(string);
	    // }
	}

	Iterator<String> myIterator = strList.iterator();
	while (myIterator.hasNext()) {
	    String string = myIterator.next();
	    if (string.equals("kazi")) {
		System.out.println("Removing " + string);
		myIterator.remove();
	    }

	}
	System.out.println(strList);
    }

    void testSet() {
	// Set<String> strSet = new HashSet<>();
	// Set<String> strSet = new LinkedHashSet<>();
	Set<String> strSet = new TreeSet<>();
	strSet.add("str4");
	strSet.add("str5");
	strSet.add("str6");
	strSet.add("str1");
	strSet.add("str2");
	strSet.add("str3");

	strSet.add("str1");
	strSet.add("str1");

	System.out.println(strSet.size());
	for (String string : strSet) {
	    System.out.println(string);
	}

	Iterator<String> myIterator = strSet.iterator();
	while (myIterator.hasNext()) {
	    String string = myIterator.next();
	    if (string.equals("kazi")) {
		System.out.println("Removing " + string);
		myIterator.remove();
	    }

	}
    }

    void testMap() {
	Map<String, String> myMap = new HashMap<>();
	// Map<String, String> myMap = new LinkedHashMap<>();
	// Map<String, String> myMap = new TreeMap<>();
	myMap.put("key6", "value6");
	myMap.put("key7", "value7");
	myMap.put("key8", "value8");
	myMap.put("key1", "value1");
	myMap.put("key2", "value2");
	myMap.put("key3", "value3");
	myMap.put("key4", "value4");
	myMap.put("key5", "value5");
	myMap.put("key5", "value5");

	myMap.put("key9", "value9");

	System.out.println(myMap.size());
	System.out.println(myMap);
	System.out.println(myMap.containsKey("key5"));

	// myMap.remove("key7");
	//
	// Iterator<Entry<String, String>> mapIterator = myMap.entrySet().iterator();
	// while (mapIterator.hasNext()) {
	// Entry<String, String> entry = mapIterator.next();
	// if (entry.getKey().equals("key5")) {
	// mapIterator.remove();
	// }
	// }
	// System.out.println(myMap);
    }

}
