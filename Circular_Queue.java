import java.util.*;
public class Circular_Queue {
	private int front = -1;
	private int rear = -1;
	private int[] queue = new int[6];
	private int size = queue.length;
	Scanner cin = new Scanner(System.in);
	public static void main(String args[]) {
		Circular_Queue cqueue = new Circular_Queue();
		cqueue.menu();
	}
	public void insert() {
		if((rear == size-1 && front == 0) || (rear+1==front)) {
			System.out.println("Queue is Full");
		}
		else {
			System.out.println("Enter the value to insert: ");
			int value = cin.nextInt();
			if(rear == -1) {
				front = 0;
				rear = 0;
			}
			else if(rear == size-1) {
				rear = 0;
			}
			else {
				rear++;
			}
			queue[rear] = value;
		}	
	}
	public void delete() {
		if(front == -1) {
			System.out.println("Queue is empty");
		}
		else {
			queue[front] = 0;
			if(front == rear) {
				front = -1;
				rear = -1;
			}
			else if(front == size-1) {
				front = 0;
			}
			else {
				front++;
			}
		}
	}
	public void display() {
		for(int i=0; i<queue.length; i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println("");
	}
	public void menu() {
		int option = 0;
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		while(option!=4) {
			System.out.println("Enter your option: ");
			option = cin.nextInt();
			if (option == 1) {
				insert();
			}
			else if(option == 2) {
				delete();
			}
			else if(option == 3) {
				display();
			}
			else if(option == 4) {
				System.exit(0);
				cin.close();
			}
			else {
				System.out.println("Invalid option..Please try again!");
			}
		}
	}
}
