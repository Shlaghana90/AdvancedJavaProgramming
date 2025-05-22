package GJava;
import java.util.Iterator;
import java.util.LinkedList;
public class Lr2 {
public static void main(String []args) {
	LinkedList<String> l2 = new LinkedList<>();
	l2.add("Red");
	l2.add("green");
	l2.add("Blue");
	l2.add("violet");
	l2.add("Orange");
	l2.add("white");
	//iterating reverse

	Iterator<String> reverse = l2.descendingIterator();
	while(reverse.hasNext()) {
		System.out.println(reverse.next());
	}
}
}
