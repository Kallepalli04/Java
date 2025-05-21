package day9;
import java.util.*;
public class list {
	public static void main(String args[]) {
	List<Integer> i1 = new ArrayList<Integer>();
	i1.add(12);
	i1.add(45);
	i1.add(72);
    List<Integer> i2 = new ArrayList<Integer>(i1);
    i2.add(12);
    i2.add(45);
    i2.add(72);
    i2.add(null);
    System.out.println(i2);
	}

}
