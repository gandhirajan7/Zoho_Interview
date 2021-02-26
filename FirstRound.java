import java.util.Scanner;

public class PrintWordPattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		String[] input_arr = input.split(" ");
		int len = input_arr.length;
		char[] arr = new char[len];
		int index = 0;
		int mid = Math.floorDiv(len, 2);
		for (index = 0; index < len; index++) {
			arr[index] = input_arr[index].toCharArray()[0];
		}
		String printStr = new String("");
		for (index = 0; index < len; index++) {
			printStr += "  ";
		}
		for (index = mid; index < len; index++) {
			printStr = printStr.substring(2);
			printStr += arr[index] + " ";
			System.out.println(printStr);
		}
		for (index = 0; index < mid; index++) {
			printStr = printStr.substring(2);
			printStr += arr[index] + " ";
			System.out.println(printStr);
		}
	}
}
