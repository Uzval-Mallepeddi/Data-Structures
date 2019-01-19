import java.util.*;
public class Single_LinkedList {
	static Scanner cin = new Scanner(System.in);
	public static class Node {
		int data;
		Node next;
	}
	public static class Linkedlist {
		Node head;
		int size = 1;
		public void insert() {
			System.out.println("Enter the value to insert: ");
			int value = cin.nextInt();
			Node new_node = new Node();
			new_node.data = value;
			new_node.next = null;
			
			if (head == null) {
				head = new_node;
			}
			else {
				Node first_node = head;
				new_node.next = first_node;
				head = new_node;
			}
		}
		public int getSize() {
			int size = 1;
			Node first_node = head;
			while(first_node!=null) {
				first_node = first_node.next;
				size++;
			}
			return (size-1);
		}
		public void insertpos() {
			System.out.println("Enter the position to insert: ");
			int position = cin.nextInt();
			int listsize = getSize();
			if(position > listsize) {
				System.out.println("Invalid position");
			}
			else {
				Node firstnode = head;
				int itersize = 1;
				while(firstnode.next !=null) {
					firstnode = firstnode.next;
					itersize++;
					if(itersize == position) {
						System.out.println("Enter value to insert: ");
						int value = cin.nextInt();
						Node new_node = new Node();
						new_node.data = value;
						new_node.next = firstnode.next;
						firstnode.next = new_node;
						break;
					}
					else {
						//do-nothing
					}
				}
			}
		}
		public void insertlast() {
			System.out.println("Enter the value to insert: ");
			int value = cin.nextInt();
			Node new_node = new Node();
			new_node.data = value;
			new_node.next = null;
			
			if (head == null) {
				head = new_node;
			}
			else {
				Node first_node = head;
				while(first_node.next !=null) {
					first_node = first_node.next;
				}
				first_node.next = new_node;
			}	
		}
		
		public void delete() {
			if(head == null) {
				System.out.println("Linkedlist is empty");
			}
			else {
				System.out.println("Enter the position to delete: ");
				int del = cin.nextInt();
				int size = getSize();
				if(del == 1) {
					Node firstnode = head;
					head = firstnode.next;
					System.out.println("Item Deleted");
				}
				else if(del == size) {
					Node firstnode = head;
					Node pen_ultimate = null;
					while(firstnode.next != null) {
						pen_ultimate = firstnode;
						firstnode = firstnode.next;
					}
					pen_ultimate.next = null;
					System.out.println("Item Deleted");
				}
				
				else if(del > size) {
					System.out.println("Invalid Position");
				}
				else {
					Node firstnode = head;
					Node previous = null;
					int iterval = 1;
					while(iterval != del) {
						previous = firstnode;
						firstnode = firstnode.next;
						iterval++;
					}
					previous.next = firstnode.next;
				}
				System.out.println("Item Deleted");
			}
		}
		
		public void display() {
			Node first = head;
			if(first == null) {
				System.out.println("Linkedlist is empty");
			}
			else {
				while(first.next != null) {
					System.out.print(first.data+" ");
					first = first.next;
				}
				System.out.print(first.data);
			}
			System.out.println(" ");
		}
		public void menu() {
			int option = 0;
			
			while(option!=6) {
				System.out.println("1.Insert At Beginning");
				System.out.println("2.Insert After Position");
				System.out.println("3.Insert At Last");
				System.out.println("4.Delete");
				System.out.println("5.Display");
				System.out.println("6.Exit");
				System.out.println("Enter your option: ");
				option = cin.nextInt();
				if (option == 1) {
					insert();
				}
				else if(option == 2) {
					insertpos();
				}
				else if(option == 3) {
					insertlast();
				}
				else if(option == 4) {
					delete();
				}
				else if(option == 5) {
					display();
				}
				else if(option == 6) {
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
		Linkedlist list = new Linkedlist();
		list.menu();
	}
}

