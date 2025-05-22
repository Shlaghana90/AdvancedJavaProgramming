package list1;
import java.util.ArrayList;
import java.util.Arrays;
public class e5 {
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
