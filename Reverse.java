import java.util.Scanner;
import java.io.*;
class Reverse{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String s= in.nextLine();
		for (int i = s.length() -1; i >= 0; i--){
		System.out.print(s.charAt(i));	
		}
		
	}
}
