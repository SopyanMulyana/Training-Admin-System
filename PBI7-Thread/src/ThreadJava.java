//Method 1: By Extending Thread Class
public class ThreadJava extends Thread{
	
	public void run(){
		System.out.println("Thread status: Runnable");
	}
	
	public static void main(String[] args) {
		ThreadJava obj = new ThreadJava();
		obj.start();

	}

}

/**
* Method 2: By Implementing Runnable Interface

public class ThreadJava implements Runnable{

	public void run() {
		System.out.println("Thread status: Runnable");
	}
	
	public static void main(String args[]){
		ThreadJava obj1 = new ThreadJava();
		Thread obj2 = new Thread(obj1);
		obj2.start();
	}
	
}
**/