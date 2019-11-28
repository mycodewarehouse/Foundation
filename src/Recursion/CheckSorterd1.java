package Recursion;

public class CheckSorterd1 {

	
	
	public static boolean checkSorted(int input[]) {
		
		if(input.length<=1) {
			return true;
		}
		
		
		int smallInput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallInput[i-1]=input[i];
		}
		
		
		boolean smallAns=checkSorted(smallInput);
		if(!smallAns) {
			return false;
		}
		
		if(input[0]<=input[1]) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int input[] = {23,2,3,4,6,7,8,9};
	
			System.out.println(checkSorted(input));
	}

}
