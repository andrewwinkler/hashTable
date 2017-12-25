
public class LinkList {

	protected LinkListNode first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insert(String key, int data) {
		LinkListNode link = new LinkListNode(key, data);
		link.next = first;
		first = link;
	}
	
	public void printList() {
		LinkListNode temp = first;
		System.out.println("List: ");
		while( temp != null ) {
			temp.printNode();
			temp = temp.next;
		}
	}
	public Integer find(String key) {
		
		LinkListNode temp = first;
		while( temp != null) {
			
			if(temp.key.equals(key))
				return temp.phoneNumber;
			
			temp = temp.next;
		}
		return null;
	}
	
}
