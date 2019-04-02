package caesar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a message");
		String user=in.nextLine();
		char shift=(char)(user.charAt(0)-'A');
		System.out.println("Enter a message");
		String name=in.nextLine();
		for (int x=0;x<name.length();x++) {
			char letter=name.charAt(x);
			if (letter>'A'||letter<='Z'){
				letter+=shift;

			}
			if (letter>'Z') {
				letter-=26;
			}
			System.out.print(letter);
		}

	}
}