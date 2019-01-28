
public class SelectionSort {

	public int[] selectionSort (int[] list) {
		int i, j, minValue,minIndex,temp=0;
		for(i=0;i<list.length;i++) {
			minValue = list[i];
			minIndex = i;
			for(j =i;j<list.length;j++) {
				if(list[j]< minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			if(minValue<list[i]) {
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
		return list;
	}
	
	
	public static void main(String a[]){
	     
	    int[] inputArr = {51,23,11,89,77,98,4,28,65,43};
	    SelectionSort mms = new SelectionSort();
	    mms.selectionSort(inputArr);
	    for(int i:inputArr){
	        System.out.print(i);
	        System.out.print(" ");
	    }
	}


}
