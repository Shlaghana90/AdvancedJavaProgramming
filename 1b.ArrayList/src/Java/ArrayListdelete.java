/*5.Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/


package Java;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListdelete {
public static void main(String []args) {
	ArrayList<String> array5 = new ArrayList<>();
	//adding elements
	//adding elements
array5.addAll(Arrays.asList("Red","Orange","green","violet","white"));
//removing last element
int last = array5.size();
String ele = array5.remove((last-1));
System.out.println("after removing last element: "+ele);
}
}
