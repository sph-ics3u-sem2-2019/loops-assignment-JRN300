import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a message");
	    String message=in.nextLine();
		System.out.println("Enter shift letter");
		String user=in.nextLine();
		char shift=(char)(user.charAt(0)-'A');  
		     

	}

}
