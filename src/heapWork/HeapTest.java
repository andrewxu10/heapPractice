package heapWork;

import java.util.Arrays;

public class HeapTest {
	
	public static void main (String[] args) {
		Heap heap = new Heap();
//		heap.setData(1, 100);
//		heap.setData(2, 80);
//		heap.setData(3, 90);
//		heap.setData(4, 45);
//		heap.setData(5, 49);
//		heap.setData(6, 51);
//		heap.setData(7, 54);
//		heap.insert(200); //insert working
//		heap.printInorder(1);
		
//		heap.setData(1, 2);
//		heap.setData(2, 80);
//		heap.setData(3, 90);
//		heap.setData(4, 45);
//		heap.setData(5, 49);
//		heap.setData(6, 51);
//		heap.setData(7, 54);
//		heap.maxHeapify(1); //maxHeapify working
		
		heap.insert(100);
		heap.insert(243);
		heap.insert(29);
		heap.insert(83);
		heap.insert(180);
		heap.insert(650);
		System.out.println(Arrays.toString(heap.array));
		
		System.out.println(heap.extractMax()); //extractMax working
		System.out.println(Arrays.toString(heap.array));
		
	}

}
