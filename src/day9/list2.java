package day9;
import java.util.*;
public class list2 {
	public static void main(String[] args) {
	    List<Object> l1 = new ArrayList<Object>();
	    l1.add(null);
	    l1.add(32);
	    l1.add(78);
	    l1.add(36);
	    l1.add(45);
	    l1.add(16);
	    l1.add("Rajesh");
	    l1.add(20);
	    l1.add(null);
	    l1.add(2,"hello");
	    System.out.println(l1);
	    List<Object> l2  = new ArrayList<Object>(l1);
	    l2.add("hi");
	    l2.add("namasthe");
	    System.out.println(l2);
	    List<Object> extra = Arrays.asList("Rajesh","Name");
	    l2.addAll(1,extra);
	    Iterator<Object> itr = l2.iterator();
	    System.out.println(l2);
	    System.out.println(l2.get(6));
	    System.out.println("Elements in the list using Iterator:");
	    while(itr.hasNext()) {
		    System.out.println(itr.next());

	    }


	}

}
