import java.util.*;
public class Queue_Implementation {
	private int front = 0;
	private int rear = -1;
	private int[] queue = new int[10];
	Scanner cin = new Scanner(System.in);
	public static void main(String args[]) {
		Queue_Implementation queue_imp = new Queue_Implementation();
		queue_imp.menu();
	}
	public void insert() {
		if(rear>=9) {
			System.out.println("Queue Overflow");
		}
		else {
			System.out.println("Enter value to insert: ");
			int value = cin.nextInt();
			rear++;
			queue[rear] = value;
		}
	}
	public void delete() {
		if(rear == -1) {
			System.out.println("Queue Empty");
		}
		else {
			int rearvalue = queue[rear];
			queue[rear]=0;
			rear--;
			queue[front]=0;
			for(int i=0;i<queue.length;i++) {
				if(i==rear) {
					break;
				}
				else {
					int j = i+1;
					int temp = queue[j];
					queue[i] = temp;
				}
			}
			queue[rear] = rearvalue;	
				
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
