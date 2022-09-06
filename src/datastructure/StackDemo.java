package datastructure;

public class StackDemo {

	static Node startingNode;
	
	public static void push(int data) {
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
	
	public static int pop() {
		Node currentNode = startingNode;
		Node prevNode = startingNode;
		while(currentNode.nextNode != null) {
			prevNode = currentNode;
			currentNode = currentNode.nextNode;
		}
		prevNode.nextNode = null;
		
		return currentNode.data;
	}
	
	public static int peek() {
		
		return 0;
	}

	public static void showList() {
		Node temp = startingNode;
		
		while(temp != null) {
			System.out.print("["+temp.data+" | "+temp.nextNode+" ] ->");
			temp = temp.nextNode;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
		push(5);
		push(6);
		push(7);
		push(8);
		
		
		showList();
		
		pop();
		
		showList();
		
	}
}
