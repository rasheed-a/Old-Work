public class Numbers {

	public static void main(String[] args) {
		Numbers n = new Numbers();
		Numbers p = new Numbers();
		n.fillSequence();
		n.printArray();
		System.out.println("Next Method: ");
		n.fillMultiple();
		n.printArray();
		System.out.println("Next Method: ");
		n.printLessThan(33);
		n.printArray();
		System.out.println("Next Method: ");
		n.equals(p);
		n.printArray();		
	}
	
	int[] numbers = new int[42];

	public void fillSequence() {
		for (int i=0;i<numbers.length;i++){
			numbers[i] = i+1;
		}
	}
	
	public void printArray() {
		for (int i=0;i<numbers.length;i++){
		System.out.print(numbers[i]+" ");
		}
	}
	
	public void fillMultiple() {
		int amnt = 1;
		int m = 3;
		for(int i=0; i<42; i++) {
			numbers[i] = amnt*m;
			amnt++;
		}
	}
	
	public void printLessThan(int x) {
		for(int i=0;i<x;i++) {
			if (numbers[i] < x) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
	}
	
	public boolean equals(Numbers other) {
		for(int i=0;i<42;i++) {
			if (other.numbers[i] != numbers[i]) {
				return false;
			}
		}
		return true;
			}
}
