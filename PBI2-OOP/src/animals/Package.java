package animals;

public class Package implements Animal{

	@Override
	public void sleep() {
		System.out.println("Sleep..");
	}

	@Override
	public void eat() {
		System.out.println("Eat..");
	}
	
	public static void main(String[] args) {
		Package obj = new Package();
		
		obj.sleep();
		obj.eat();
	}
}