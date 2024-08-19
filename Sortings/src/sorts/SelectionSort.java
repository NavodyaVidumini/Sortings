package sorts;

public class SelectionSort {
	


	    // Method to perform selection sort
	    public void sort(int arr[]) {
	        int n = arr.length;

	        // One by one move the boundary of the unsorted subarray
	        for (int i = 0; i < n - 1; i++) {
	            // Find the minimum element in the unsorted array
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap the found minimum element with the first element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    // Method to print the array
	    static void printArray(int arr[]) {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }

	    public static void main(String args[]) {
	        int arr[] = {64, 25, 12, 22, 11};

	        System.out.println("Given Array");
	        printArray(arr);

	        SelectionSort ob = new SelectionSort();
	        ob.sort(arr);

	        System.out.println("\nSorted array");
	        printArray(arr);
	    }
	}



