package pak;

import java.util.Scanner;

public class App implements R {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int array2d[][] = new int[10][10];
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		int value = scanner.nextInt();
		array2d[row][column] = value;
		for (int rowrow = 0; rowrow < array2d.length; rowrow++) {
			for (int columnn = 0; columnn < array2d.length; columnn++) {
				System.out.print(array2d[rowrow][columnn] + " ");
			}
			System.out.println();
		}
	}
}
