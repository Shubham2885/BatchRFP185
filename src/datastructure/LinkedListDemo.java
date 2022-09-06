package datastructure;

import java.util.Scanner;

class Node {
	
	int data;
	Node nextNode;
	public Node(int data) {
		this.data = data;
		this.nextNode = null;
	}
}

public class LinkedListDemo {

	static Node startingNode;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ch = 1;
		
		do {
			System.out.println("1 Add New Data");
			System.out.println("2 Show List");
			System.out.println("3 check Empty");
			System.out.println("4 size");
			System.out.println("5 remove at last");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: System.out.println("Enter the data");
					int data = scanner.nextInt();
					add(data);
				break;

			case 2 : showList();
				break;
				
			case 3 : System.out.println("Check List is empty = "+isEmpty());
				break;
				
			case 4 : System.out.println("Size of List = "+size());
			break;
			
			case 5 : System.out.println("Removed data = "+removeAtLast());
			break;
			
			default:
				break;
			}
			System.out.println("Do you want to add the new node... press 1");
			ch = scanner.nextInt();
		}while(ch == 1);
	}
	
	//add method
	public static void add(int data) {
		Node newNode = new Node(data);
		
		if(startingNode == null) {
			startingNode = newNode;
		}else {
			Node temp = startingNode;
			while(temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = newNode;
		}
	}
	
	public static void showList() {
		Node temp = startingNode;
		
		while(temp != null) {
			System.out.print("["+temp.data+" | "+temp.nextNode+" ] ->");
			temp = temp.nextNode;
		}
		System.out.println();
	}
	
	public static int size() {
		int counter = 0;
		Node temp = startingNode;
		while(temp != null) {
			temp = temp.nextNode;
			counter ++;
		}
		return counter;
	}
	
	public static boolean isEmpty() {
		return startingNode == null;
	}
	
	public static int removeAtLast() {
		
		Node currentNode = startingNode;
		Node prevNode = startingNode;
		while(currentNode.nextNode != null) {
			prevNode = currentNode;
			currentNode = currentNode.nextNode;
		}
		prevNode.nextNode = null;
		
		return currentNode.data;
	}
}

//add at last
//add at any position
//add at first position

//is Empty
//size

//remove at last
// remove at any position
//remove at first

//search
