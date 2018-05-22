package multidimension.array;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("please enter string for palindro check");
		Scanner sc = new Scanner(System.in);
		
		String palindrom =sc.nextLine();
		Palindrome p = new Palindrome();
		p.isPalindrom(palindrom);
	}
	String reverse="";
	public boolean isPalindrom(String palindrom){
		if(palindrom.length()>0){
			for(int i =palindrom.length()-1;i>=0;i--){
				reverse=reverse+palindrom.charAt(i);
			}
			if(reverse.equals(palindrom)){
				System.out.println("yes");
				return true;
			}
			else
				System.out.println("no");
				return false;
		}
		else return false;
	}

}
