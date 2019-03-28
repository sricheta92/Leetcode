package com.heap;

public class BinaryMinHeap {

	int[] arr;
	int size;

	public BinaryMinHeap(int capacity){
		arr = new int[capacity];
		size = 0;
	}
	
	private int getRightChild(int i) {
		int right = 2*i+2;
		if(right>= size) {
			return -1;
		}
		return right;
	}

	private int getLeftChild(int i) {
		int left = 2*i+1;
		if(left>= size) {
			return -1;
		}
		return left;
	}

	
	/**
	 * O(log N)
	 * @param data
	 */
	void insert(int data) {
		
		arr[size++]= data;
		shiftup(size-1);
		
	}

	

	private void shiftup(int i) {
		int temp = arr[i];
		while(i>0 && temp< arr[(i-1)/2]){
			arr[i] = arr[(i-1)/2];
			i = (i-1)/2;
		}
		arr[i] = temp;
		
	}

	
	private void deleteMin() {
		System.out.println("Item deleted " + arr[0]);
		arr[0] = arr[size-1];
		size--;
		shiftDown(0);
			
	}

	private void shiftDown(int i) {
		int left = getLeftChild(i);
		int right =getRightChild(i);
		int min=i;
		if(left!=-1 && arr[left]< arr[i]) {
			min = left;
		}
		if(right!=-1 && arr[right]< arr[min]) {
			min = right;
		}
		if(min!=i) {
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			shiftDown(min);
		}
	}

	
	private void findMin() {
		if(arr.length >0) {
			System.out.println(arr[0]);
		}else {
			System.out.println("heap empty..");
		}
		
	}

	public static void main(String[] args) {
		BinaryMinHeap heap = new BinaryMinHeap(5);
		heap.insert(10);
		heap.insert(9);
		heap.insert(8);
		heap.insert(11);
		heap.insert(12);
		heap.findMin();
		heap.deleteMin();
	}

	
}
