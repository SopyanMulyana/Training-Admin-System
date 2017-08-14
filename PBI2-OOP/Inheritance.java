class Lecturer{
	String majors = "Computer Science";
	String subject = "Algorithm";
	
	void schedule(){
		System.out.println("Monday");
	}
}

//Inheritance
public class Inheritance extends Lecturer {

	String behaviour = "Killer";
	
	public static void main(String[] args) {
		Inheritance obj = new Inheritance();

		System.out.println("Majors: "+obj.majors);
		System.out.println("Subject: "+obj.subject);
		System.out.print("Day: ");
		obj.schedule();
		System.out.println("Behaviour: "+obj.behaviour);
	}

}


