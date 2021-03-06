package Foundation;
import java.util.*;
public class BinarySearch {

	static Scanner s1 = new Scanner(System.in);
	
	public static int[] takeInput() {
		int size = s1.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s1.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s1.nextInt();
		System.out.print(binarySearch(arr, num));
	}
public static int binarySearch(int[] arr,int num) {
	 int start=0;
     int end=arr.length-1;
     int mid=(start+end)/2;
        
       while(start<=end){
       
           if(arr[mid]>num){
               end=mid-1;
               mid=(start+end)/2;
           }
           else if(arr[mid]<num){
               start=mid+1;
               mid=(start+end)/2;
           }else{
               return mid;
           }
       }
       
       return -1;
}
}
