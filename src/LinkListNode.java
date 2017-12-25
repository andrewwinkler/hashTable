
public class LinkListNode {
	
	protected String key;
	protected int phoneNumber;
	protected LinkListNode next;
	
	// Constructor
	public LinkListNode(String key, int data) {
		phoneNumber = data;
		this.key = key;
	}
	
	// Print Data
	public void printNode() {
		System.out.println(phoneNumber);
	}
}
