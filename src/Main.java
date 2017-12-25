
public class Main {

	public static void main(String[] args) {

		HashTable phoneBook = new HashTable();
		phoneBook.put("Andrew", 454);
		phoneBook.put("Thomas", 909);
		
		int phone1 = phoneBook.get("Andrew");
		int phone2 = phoneBook.get("Thomas");
		
		System.out.println( phone1 + " " + phone2 );
		
	}

}
