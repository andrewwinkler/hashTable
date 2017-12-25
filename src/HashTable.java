
public class HashTable {

	LinkList[] hashList = new LinkList[100];
	
	public HashTable() {
		for( int i = 0; i < 100; i++)
			hashList[i] = new LinkList();
	}
	
	private int getIndex(String key) {
		return Math.abs(key.hashCode()) % 100;
	}
		
	
	public void put(String key, int value) {
		
		int index = getIndex(key);
		hashList[index].insert(key,value);
	}
	
	public int get(String key) {
		
		int index = getIndex(key);
		int keyFound = hashList[index].find(key);
		System.out.println(index);
		return keyFound;
	}
}
