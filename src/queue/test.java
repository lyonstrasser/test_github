package queue;

public class test {
	
	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(10);
		
		queue.queueEnqueue(5);
		
		queue.queueDequeue();
		
		queue.queueDisplay();
		
		queue.queueFront();
		
	}
	
	
}