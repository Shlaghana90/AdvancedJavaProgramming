package  GJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Ar3 {
public static void main(String []args) {
	ArrayList<String> array3 = new ArrayList<>();
	//adding elements
	array3.addAll(Arrays.asList("Red","Orange","green","violet","white"));
	//sorting
	Collections.sort(array3);
	System.out.println("After sorting"+array3);
}
}
