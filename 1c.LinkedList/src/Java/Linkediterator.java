/*1.Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/


package Java;
import java.util.Iterator;
import java.util.LinkedList;
public class Linkediterator {
public static void main(String []args) {
	LinkedList<String> l1 = new LinkedList<>();
	//adding elements
	l1.add("Red");
	l1.add("green");
	l1.add("Blue");
	l1.add("violet");
	l1.add("Orange");
	l1.add("white");
	//iterator
	Iterator<String> iterator = l1.listIterator(1);
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
