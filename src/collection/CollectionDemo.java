package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Collection<String> strings;
		List<String> list = new ArrayList<String>();
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Shubham");
		list2.add("Rahul");
		list2.add("Mayur");
		list2.add("Abhi");
		
		
		list.add("Shubham");
		list.add("Rahul");
		list.add("Mayur");
		list.add("Abhi");
		list.addAll(list2);
		
		
		
		Set<String> set = new HashSet<String>();
		
		set.add("Shubham");
		set.add("Rahul");
		set.add("Mayur");
		set.add("Abhi");
		set.add("Shubham");
		set.add("Rahul");
		set.add("Mayur");
		set.add("Abhi");
		
		System.out.println("list = "+list);
		System.out.println("set = "+set);
		
		
	}
}
