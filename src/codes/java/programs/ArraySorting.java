package codes.java.programs;

public class ArraySorting {

	public static void main(String[] args) {

		int tempVar;
		int[] arr = {4, 5, 2, 6, 1, 9, 7};

		System.out.println("Original Array: ");
		for(int r = 0; r<arr.length; r++){
			System.out.print(arr[r] + " ");
		}

		System.out.println();
		System.out.println("Array in Ascending Order: ");
		for(int r = 0; r<arr.length; r++){
			for(int c=r+1; c<arr.length; c++) {
				if(arr[r]>arr[c]){
					tempVar = arr[r];
					arr[r] = arr[c];
					arr[c] = tempVar;
				}
			}
		}

		for(int r=0; r<arr.length; r++) {
			System.out.print(arr[r] +"  ");
		}

	}

}
