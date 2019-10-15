
public class LinearList {
	Node head;
	
	public LinearList() {
		head = null;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		Node temp = new Node();
		if (temp == null) {
			return true;
		}else {
			temp = null;
			return false;
		}
	}
	
	public void insert(Car data) {
		if (isFull()) {
			System.out.println("List is full! Unable toinsert!");
			//return false;
		} else {
			Node next = new Node();
			next.setData(data);
			if (isEmpty()) {
				head = next;
			} else {
				Node current = head;
				while (current.getNext() != null) {
					current = current.getNext();
				}
				current.setNext(next);
			}
			//return true;
		}
	}
	
	public Car retrieve(String key) {
		if (isEmpty()) {
			System.out.println("List is empty! Nothing to retrive!");
			return null;
		} else {
			if (head == null) {
				return null;
			}
			
			if (head.getData().equals(key)) {
				return head.getData();
			}
			
			return retrieve(key);
		}
	}
	
	public Car remove() {
		if (!isEmpty()) {
			Car data = 	head.getData();
			Node itemToDelete = head;
			head = head.getNext();
			itemToDelete = null;
			
			return data;
		}
		return null;
	}
	
	public void show() {
		if (isEmpty()) {
			System.out.println("The list is empty!");
		} else {
			Node current = head;
			while (current == null) {
				current.getData().show();
				current = current.getNext();
			}
		}
	}
	
	public void destroy() {
		if (isEmpty()) {
			System.out.println("List is empty!");
		} else {
			Node temp = null;
			while (head != null) {
				temp = head;
				head = head.getNext();
				temp = null;
			}
		}
	}
}
