
public class InsertionSortArray {
	
	public int[] insertionSort (int[] list1) {
		int i1, j1, key, temp1 = 0;
		for (i1 = 1; i1 < list1.length; i1++) {
			key = list1[i1];
			j1 = i1-1;
			for(j1 = 1; j1 < list1.length; j1++)
				if(list1[j1] > list1[j1 +1])
					temp1 = list1[j1];
					list1[j1]= list1[j1+1];
					list1[j1+1] = temp1;
					j1--;
			}
		return list1;
	}
    	int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
    	InsertionSort mms = new InsertionSort();
    	mms.insertionSort(inputArr);
    	for(int i:inputArr){
    		System.out.print(i);
    		System.out.print(" ");
    }
}