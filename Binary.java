import java.util.Scanner;
import java.util.Arrays;
public class Binary {
    public static int binarySearch(int arr[], int SearchElement, int left, int right) {
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] == SearchElement)
                return middle;
            if (arr[middle] < SearchElement)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the size of Array");
        int ArraySize = scan.nextInt();
		System.out.println("Enter the array Elements : ");
        int arr[] = new int[ArraySize];
        for (int i = 0; i < ArraySize ; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the Element to search:");
        int SearchElement = scan.nextInt();
        scan.close();
        int ans = binarySearch(arr, SearchElement, 0, ArraySize - 1);
        if  (ans == -1)
            System.out.println("Not present in the array");
        else{
			System.out.println("Sorted array is "+Arrays.toString(arr));
            System.out.println("Element present at index of " + ans);
    	}
	}
}
