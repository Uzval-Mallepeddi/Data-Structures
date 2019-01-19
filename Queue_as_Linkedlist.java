import java.util.*;
public class Queue_as_Linkedlist {
	static Scanner cin = new Scanner(System.in);
	public static class Node {
		int data;
		Node next;
	}
	public static class Queue_Linkedlist {
		Node front = null;
		Node rear = null;
		public void insert() {
			System.out.println("Enter the value to insert: ");
			int value = cin.nextInt();
			Node new_node = new Node();
			new_node.data = value;
			new_node.next = null;
			int length = getSize();
			if((front == null && rear == null) || (length == 1)) {
				front = new_node;
				rear = new_node;
			}
			else {
				Node allnodes = front;
				while(allnodes.next != null) {
					allnodes = allnodes.next;
				}
				allnodes.next = new_node;
				rear = new_node;
			}
		}
		public void delete() {
			int l = getSize();
			if((front == null && rear == null) || (l==1)) {
				System.out.println("Queue-list is empty");
			}
			else {
				Node firstnode = front;
				System.out.println("Value deleted from Queue-list is: '"+firstnode.data+"'");
				front = firstnode.next;
			}
		}
		public void display() {
			int len = getSize();
			if((front == null && rear == null) || (len == 1)) {
				System.out.println("Queue-list is empty");
			}
			else {
				Node allnodes = front;
				while(allnodes != null) {
					System.out.print(allnodes.data+" ");
					allnodes = allnodes.next;
				}
				System.out.println();
			}
		}
		public int getSize() {
			Node allnode = front;
			int size = 1;
			while(allnode!=null) {
				allnode = allnode.next;
				size++;
			}
			return size;
		}
		public void menu() {
			int option = 0;
			while(option!=4) {
				System.out.println("1.Insert");
				System.out.println("2.Delete");
				System.out.println("3.Display");
				System.out.println("4.Exit");
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
	public static void main(String args[]) {
		Queue_Linkedlist queue_list = new Queue_Linkedlist();
		queue_list.menu();
	}
}
