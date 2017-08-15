import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;


public class CollectionFramework {

	public static void main(String[] args) {
		//List, Set, and Map
		  List<String> a1 = new ArrayList<String>();
		  a1.add("Aku");
		  a1.add("Suka");
		  a1.add("Suka");
		  System.out.println(" ArrayList Elements");
		  System.out.print("\t" + a1);
		
		  // LinkedList
		  List<String> l1 = new LinkedList<String>();
		  l1.add("Aku");
		  l1.add("Suka");
		  l1.add("Suka");
		  System.out.println();
		  System.out.println(" LinkedList Elements");
		  System.out.print("\t" + l1);
		
		  // HashSet
		  Set<String> s1 = new HashSet<String>(); 
		  s1.add("Aku");
		  s1.add("Suka");
		  s1.add("Suka");
		  System.out.println();
		  System.out.println(" Set Elements");
		  System.out.print("\t" + s1);
		
		  // HashMap
		  Map<String, String> m1 = new HashMap<String, String>(); 
		  m1.put("Aku", "18");
		  m1.put("Suka", "31");
		  m1.put("Suka", "22");;
		  System.out.println();
		  System.out.println(" Map Elements");
		  System.out.print("\t" + m1);
		  
		  //Iterator
		  System.out.println();
		  System.out.println("list:");
		  Iterator<String> itr = a1.iterator();
		  while (itr.hasNext())
		  {
			  System.out.print(itr.next()+" ");
		  }

	}

}
