/*3.Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/

package Java;
import java.util.LinkedList;
public class InsertEnd {
public static void main(String []args) {
	LinkedList<String> l3  = new LinkedList<>();
	l3.add("Red");
	l3.add("green");
	l3.add("Blue");
	l3.add("violet");
	l3.add("Orange");
	l3.add("white");
	//adding last ele
	l3.offerLast("pink");
	System.out.println("After adding last: "+l3);
}
}
