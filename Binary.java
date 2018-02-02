import java.util.Scanner;
public class Binary {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a decimal number: ");
	int n = in.nextInt();
	convert(n);
	}
	public static void convert(int number) {
		String result = "";
		int convert1 = number;
		while(convert1 > 0) {
			int add = convert1 % 2;
			result = result + add;
			convert1 = convert1 / 2;
		}
		char[] finalprint = result.toCharArray();
		for(int i = finalprint.length - 1; i >= 0; i--) {
			System.out.print(finalprint[i]);
		}
	}
}