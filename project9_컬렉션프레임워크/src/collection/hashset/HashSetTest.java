package collection.hashset;
import java.util.HashSet;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
		set.add("aaa");
		
		System.out.println(set);
	}

}
