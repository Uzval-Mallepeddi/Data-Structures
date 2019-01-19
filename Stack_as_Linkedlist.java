import java.util.*;

public class Stack_as_Linkedlist {
	static Scanner cin = new Scanner(System.in);
	public static class Node {
		int data;
		Node next;
	}
	public static class Stack_Linkedlist  {
		Node top;
		public void push() {
			System.out.println("Enter value to push: ");
			int value = cin.nextInt();
			Node new_node = new Node();
			if(top == null) {
				new_node.data = value;
				new_node.next = null;
				top = new_node;
			}
			else {
				new_node.data = value;
				new_node.next = top;
				top = new_node;
			}
		}
		public void pop() {
			if(top == null) {
				System.out.println("Stack-list is empty");
			}
			else {
				Node node = top;
				System.out.println("Value popped is: '"+node.data+"'");
				top = node.next;
			}
		}
		public void display() {
			Node allnodes = top;
			if(top == null) {
				System.out.println("Stack-list is empty");
			}
			else {
				System.out.print("Values in Stack-list: ");
				while(allnodes!=null) {
					System.out.print(allnodes.data +" ");
					allnodes = allnodes.next;
				}
				System.out.println();
			}
		}
		public void menu() {
			int option = 0;
			while(option!=4) {
				System.out.println("1.Push");
				System.out.println("2.Pop");
				System.out.println("3.Display");
				System.out.println("4.Exit");
				System.out.println("Enter your option: ");
				option = cin.nextInt();
				if (option == 1) {
					push();
				}
				else if(option == 2) {
					pop();
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
		Stack_Linkedlist stack_list = new Stack_Linkedlist();
		stack_list.menu();
	}
}
