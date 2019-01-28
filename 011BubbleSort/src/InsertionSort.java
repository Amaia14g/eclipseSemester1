import java.util.ArrayList;

public class InsertionSort {

public ArrayList<Integer> insertionSort (ArrayList<Integer> list) {
	int i, j, key, temp;
	for (i = 1; i < list.size; i++) {
		key = list.get(i);
		j = i-1;
		while(j >= 0 && key < list.get(j)) { //swap
			temp = list.get(j);
			list.set(j, list.get(j+1));
			list.set(j+1, temp);
			j--;
			}
		}
		return list;
	}
}


/**public static void main(String a[]){
    
    int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
    InsertionSort mms = new InsertionSort();
    mms.insertionSort(inputArr);
    for(int i:inputArr){
        System.out.print(i);
        System.out.print(" ");
    }
}
}

**/


