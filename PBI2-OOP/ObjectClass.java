//class
public class ObjectClass{
	
	String name;
	int age;
	
	//constructor
	ObjectClass(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		//object
		ObjectClass student1 = new ObjectClass("Daniel",21);
		ObjectClass student2 = new ObjectClass("Sopyan",22);
		
		System.out.println("Name: "+student1.name+", Age: "+student1.age);
		System.out.println("Name: "+student2.name+", Age: "+student2.age);

	}

}
