package selectionSort;

public class SelectionSortApp {

	public static void main(String args[]) {
		
		int maxSize = 100;
		ArraySelect arr = new ArraySelect(maxSize);
		
		arr.insert(56);
		arr.insert(12);
		arr.insert(78);
		arr.insert(37);
		arr.insert(178);
		arr.insert(65);
		arr.insert(18);
		arr.insert(126);
		arr.insert(9);
		
		arr.display();
		
		arr.selectionSort();
		
		arr.display();
	}
}
