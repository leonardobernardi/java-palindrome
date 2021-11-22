package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire una parola: ");
		String word = input.nextLine();
		
		int x = 0;
		int y = word.length() - 1;
		boolean palindrome = true;
		
		while (x < y && palindrome == true) {
			if(word.charAt(x) == word.charAt(y)){
				x++;
				y--;
			}
			else {
				palindrome = false;
			}
	
		}
		
		System.out.println("Lunghezza della parola: " + word.length());
		if(palindrome == true) {
			System.out.println("La parola inserita e' palindroma.");
		}else {
			System.out.println("La parola inserita non e' palindroma.");
		}
	
		input.close();
	}

}
