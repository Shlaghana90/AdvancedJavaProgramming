/*4.Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/


package Java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Arraysublist {
public static void main(String []args) {
	ArrayList<String> array4 = new ArrayList<>();
	//adding elements
		array4.addAll(Arrays.asList("Red","Orange","green","violet","white"));
		//sublist
		List<String> sublist =  array4.subList(0,2);
		System.out.println("sublist of 1st and 2nd: "+sublist);
}
}
