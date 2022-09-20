package datastructure;

public class QueueDemo {
	
	static Node startingNode;

	public static void enqueue(int data) {
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
	
	public static int dequeue() {
		
		if(startingNode == null) {
			return 0;
		}
		int data = startingNode.data;
		startingNode = startingNode.nextNode;
		return data;
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
		
		enqueue(40);
		enqueue(60);
		enqueue(70);
		enqueue(80);
		
		showList();
		
		int val = dequeue();
		System.out.println("Deleted Node value = "+val);
		
		showList();
	}
	
}
