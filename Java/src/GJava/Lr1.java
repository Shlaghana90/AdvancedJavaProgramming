package GJava;
import java.util.Iterator;
import java.util.LinkedList;
public class Lr1 {
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
