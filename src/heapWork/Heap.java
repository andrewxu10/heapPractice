package heapWork;


public class Heap {
	public Integer[] array;
	int size;
	
	public Heap () { //initialization
		array = new Integer[100];
	}
	
	public boolean empty () { //empty?
		return (array[1] == null);
	}
	
//	public int size () { //broken
//		return array.length;
//	}
	
	public int extractMax() {
		int max = array[1];
		swap(size, 1);
		array[size] = null; //may or may not be necessary line (can just lower size, keep value there)
		size--;
		maxHeapify(1);
		return max;
	}
	
	public void maxHeapify(int index) { //heapify a value (move smaller values down from int index)
		int max, swapIndex;
		if(getData(left(index)) > getData(right(index))) { //find the largest child
			max = getData(left(index));
			swapIndex = left(index);
		} else {
			max = getData(right(index));
			swapIndex = right(index);
		}
		if(getData(index) < max) {
			swap(index, swapIndex);
			//check here if the sibling is now greater
			if(getData(left(swapIndex)) == null & getData(right(swapIndex)) == null) {
				return;
			}
			maxHeapify(swapIndex); 
		}
	}
	
	public void insert(int value) {
		size++;
		int i = size; //where the value will start on the array
		array[i] = value;
		while(parent(i) != 0 && i > 0 && getData(i) > getData(parent(i))) {
			System.out.println("swapping : " + i + "and : " + parent(i));
			swap(i, parent(i)); //larger values percolate up dawg
			i = parent(i);
		}
	}
	
	private void swap(int indexA, int indexB) {
		int temp = array[indexA];
		array[indexA] = array[indexB]; //set a to b's value
		array[indexB] = temp; //set b to temp(A)'s value
	}

	//calculate indices for..
	public static int left (int i ) { return (2*i); };
	public static int right (int i ) { return (2*i) + 1; };
	public static int parent (int i ) { return i / 2; };
	
	public Integer getData (int i) { //getter & setter
		if (i < 0 || i >= array.length) return null;
		return array[i];
	}
	public void setData (int i, int val) {
		if (i < 0 || i >= array.length) return;
		size++;
		array[i] = val;
	}
	
	public void printPreorder (int i) { 
        if (getData (i) == null) return; 
        System.out.println (getData (i)); //Root
        printPreorder (left (i)); //L
        printPreorder (right (i)); //R
    }
	
	public void printPostorder (int i) { 
        if (getData (i) == null) return;       
        printPostorder (left (i)); //L
        printPostorder (right (i)); //R
        System.out.println (getData (i)); //Root 
    } 
	
	public void printInorder (int i) {
		if (getData (i) == null) return;       
		printInorder (left (i)); //L
		System.out.println (getData (i)); //Root
		printInorder (right (i)); //R
	}

	
}
