/*3.Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/

package  Java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class collentionsort{
public static void main(String []args) {
	ArrayList<String> array3 = new ArrayList<>();
	//adding elements
	array3.addAll(Arrays.asList("Red","Orange","green","violet","white"));
	//sorting
	Collections.sort(array3);
	System.out.println("After sorting"+array3);
}
}
