package caesar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a shift");
		String user=in.nextLine().toUpperCase();
		char shift=(char)(user.charAt(0)-'A');
		System.out.println("Enter a message");
		String name=in.nextLine().toUpperCase();
		for (int x=0;x<name.length();x++) {
			char letter=name.charAt(x);
			if (letter>='A'&&letter<='Z'){
				letter+=shift;

				if (letter>'Z') {
					letter-=26;
				}
			}
			System.out.print(letter);
		}
	}
}
//	}else if (code==1) {
//		if (letter>='A'&& letter <+ 'Z' ) {
//			char letter1=(char)(letter + shift);
//			if (letter > 'Z') {
//				letter1 -=26;
//			}
//			System.out.println(letters);
//		}else {
//		}
//	}