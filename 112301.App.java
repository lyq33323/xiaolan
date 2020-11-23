package pak;

import java.util.Scanner;

public class Lo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while (true) {
			int user_num = scn.nextInt();
			if (user_num == 1) {
				System.out.println("R(" + (int) (Math.random() * 100) + ","
						+ (int) (Math.random() * 100) + ")");
			}
		}

	}

}
