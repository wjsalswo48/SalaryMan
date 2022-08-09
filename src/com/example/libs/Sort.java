package com.example.libs;

public class Sort {
	private Employee []array;
	private int count;
	public Sort(Employee[] array, int count) {
		this.array = array;
		this.count = count;
	}
	
	public void selectionSort() {
		for(int i = 0; i<this.count-1;i++) {
			for(int j = i+1; j<this.count; j++) {
				if(this.array[i].getEmpnum().compareTo(this.array[j].getEmpnum())>0){
					swap(i,j);
				}
			}
		}
	}
	
	private void swap(int front, int back) {
		Employee temp = this.array[front];
		this.array[front]=this.array[back];
		this.array[back]=temp;
	}
}
