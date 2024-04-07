package queue;

public class ArrayQueue {
	
	private static int front;
	private static int rear;
	private static int capacity;
	private static int[] queue;
	
	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int[size];
	}
	
	/**
	 * The method checks if the capacity is full
	 * If the capacity is not full, it should move the rear +1
	 * @param item
	 */
	public void queueEnqueue(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll");
		} else {
			queue[rear] = item;
			rear ++;
		}
	}
	
	/**
	 * The method checks if the capacity if emtpy
	 * If the capacity is not full, it moves the rear -1
	 * @return
	 */
	public  int queueDequeue() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer!");
		} else {
			firstElement = queue[front];
			for(int i = 0; i < (rear-1); i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear --;
		}
		return firstElement;
	}
	
	/**
	 * This method gives out the whole queue if it's not empty
	 */
	public void queueDisplay() {
		if(front == rear) {
			System.out.println("Queue is empty!");
		} else {
			for(int i = front; i < rear; i++) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * This method gives out the  first element of the queue if it's not empty
	 * @return
	 */
	public int queueFront() {
		// TODO erstes Element ohne Löschen zurückgeben
		int firstElement = 0;
		if(front == rear) {
			System.out.println("Queue is empty!");
		} else {
			firstElement = queue[front];
		}
		return firstElement;
	}
	
	// HÜ: ArrayQueueTest - alle Methoden von ArrayQueue testen
	// JavaDoc-Kommentare
	// Kapitel 5 nochmals durcharbeiten
	
}