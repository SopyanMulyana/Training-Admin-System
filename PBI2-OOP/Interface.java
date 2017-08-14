//interface
interface Designer{
	String jobdesk= "Design a Software";
	public void task();
}

public class Interface implements Designer{

	@Override
	public void task(){
		System.out.println(jobdesk);
	}
	
	public static void main(String[] args) {
		Interface obj = new Interface();
		
		obj.task();
	}

}
