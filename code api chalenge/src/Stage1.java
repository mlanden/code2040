import java.util.Scanner;


public class Stage1 {

	public static String Reverse(String begin){
		if(begin.length() == 1)
			return begin;
		else 
			return begin.substring(begin.length() - 1) + Reverse(begin.substring(0,begin.length() - 1)); 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String word = sc.nextLine();
		System.out.print(Reverse(word));
	}

}
