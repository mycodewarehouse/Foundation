package Recursion;
import java.util.*;
public class PrintTheNumbers {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		print(n);
	}
	public static void print(int n){
	
		if(n >0){
			
			print(n-1);
			System.out.print(n+" ");
		}else {
			System.out.println("");

		}
			}
}
