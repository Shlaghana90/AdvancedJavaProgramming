package GJava;
	import java.io.*;
	import java.util.ArrayList;
	import java.util.Arrays;
	public class  ArrayListRed {
		public static void main(String []args) {
			ArrayList<String> array1 = new ArrayList<>();
			//adding elements
			array1.addAll(Arrays.asList("Red","Orange","green","blue"));
			//searching red is there are not
			boolean element = array1.contains("Red");
			System.out.print("red is there or not ?"+element);
		}
	}

