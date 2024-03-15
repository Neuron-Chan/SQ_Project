public class NodeList{
	Node headNode;
	Node tailNode;
	
	public NodeList() {
		headNode = tailNode = null;
	}
	
	public void addAtBegin(int value) {
		
		Node newNode = new Node(value);
		//check if the list is empty
		if(headNode==null) {
			headNode = newNode;
			tailNode = newNode;
		}else {
			newNode.next = headNode;
			newNode.prev = newNode;
			headNode = newNode;
		}
	}
	
	public void addAtEnd(int value) {
		Node newNode = new Node(value);
		//check if the list is empty
		if(headNode==null) {
			headNode = newNode;
			tailNode = newNode;
		}else {
			newNode.prev = tailNode;
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	
	public String toString() {
		String txt="";
		Node current = this.headNode;
		while(current != null) {
			txt += current.data + " ";
			current = current.next;
		}
		txt +="\n";
		return txt;
	}
}