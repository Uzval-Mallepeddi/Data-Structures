import java.util.*;
public class Stack_Implementation {
	private int top = -1;
	private int[] stack = new int[10];
	Scanner cin = new Scanner(System.in);
	public static void main(String args[]) {
		Stack_Implementation stack_imp = new Stack_Implementation();
		stack_imp.menu();
	}
	
	public void push() {
		if(top >= 9) {
			System.out.println("Stack Overflow");
		}
		else {
			System.out.println("Enter value to push: ");
			int value = cin.nextInt();
			top++;
			stack[top] = value;
		}
	}
	public void pop() {
		if(top<=-1) {
			System.out.println("Stack Underflow");
		}
		else {
			stack[top] = 0;
			top--;
		}
	}
	public void display() {
		boolean flag = false;
		for(int i=0; i<stack.length; i++) {
			if(i==top) {
				flag = true;
				System.out.print(stack[i]+"-->TOP"+" ");
			}else {
				if(stack[i] == 0) {
				}
				else {
					flag = true;
					System.out.print(stack[i]+" ");
				}
				}
			}
		if(flag == false) {
			System.out.println("Stack Empty !");
		}
			System.out.println("");
		}
		
	public void menu() {
		int option = 0;
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		while(option!=4) {
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
