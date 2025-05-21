package day9;
import java.util.*;
public class list1 {
	public static void main(String[] args) {
    List<Integer> i1 = new ArrayList<Integer>();
    i1.add(12);
    i1.add(32);
    i1.add(78);
    List<Integer> i2 = new ArrayList<Integer>();
    i2.add(56);
    i2.add(65);
    i2.add(97);
    i2.addAll(i1);
    System.out.println(i2);
	}

}
