import java.util.*;
public class JavaFundamental {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// Data types and variable
		int age;
		String name;
		float ipk;
		// Exception Handling
		try{
		System.out.print("Input age: ");
		age = input.nextInt();
		System.out.print("Input name: ");
		input.nextLine();
		name = input.nextLine();
		System.out.print("Input IPK: ");
		ipk = input.nextFloat();
		
		
		//operator
		System.out.println("Age + IPK: "+(age+ipk));
		System.out.println("Age - IPK: "+(age-ipk));
		System.out.println("Age / IPK: "+(age/ipk));
		System.out.println("Age * IPK: "+(age*ipk));
		System.out.println("Age % IPK: "+(age%ipk));
		
		//condition and looping
		if (ipk>=2)
		{
			for (int i=0; i< 5; i++)
			{
				System.out.print((i*2)+" ");
			}
		}
		else
		{
			int i=5;
			while (i>0)
			{
				System.out.print((i*2)+" ");
			}
		}
		System.out.println();
		
		//Array Concept
		String satuan[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",};
		String angka = String.valueOf(ipk);
		System.out.print("Your IPK is: ");
		for (char ch: angka.toCharArray()) {  //Pengganti foreach di C#
			int index = Character.getNumericValue(ch);
			if (ch=='.')
			{
				System.out.print("Comma ");
			}
			else{
			System.out.print(satuan[index]+" ");
			}
		}
		System.out.println();
		//Java collection
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
		}
		catch(Exception e) 
		{
			System.out.print("Gagal");
		}
	}

}
