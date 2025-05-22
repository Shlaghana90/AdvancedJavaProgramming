/*5.Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
package  Java;
import java.util.Collections;
import java.util.LinkedList;
public class Linkedswap {
public static void main(String []args) {
	LinkedList<String> l5 = new LinkedList<>();
	l5.add("Red");
	l5.add("green");
	l5.add("Blue");
	l5.add("violet");
	l5.add("Orange");
	l5.add("white");
	//swapping
	System.out.println("berfore swapping: "+l5);
	Collections.swap(l5, 0, 2);
	System.out.println("after swapping: "+l5);
}
}
