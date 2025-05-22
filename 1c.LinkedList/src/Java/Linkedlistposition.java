/*4.Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/

package Java;
import java.util.LinkedList;
	public class Linkedlistposition{
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        System.out.println("Elements with positions:");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println("Index " + i + ": " + list.get(i));
	        }
	    }
	}