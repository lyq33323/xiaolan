package pak;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入要判断的年数:");
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		if (m > 0) {
			if (m % 4 == 0 && m % 100 != 0 || m % 400 == 0) {
				System.out.print(m + "年是闰年");
			} else {
				System.out.print(m + "不是闰年");
			}
			
		}
		else {
			if (m % 4 == -1 && m % 100 != -1 || m % 400 == -1) {
				System.out.print(m + "年是闰年");
			} else {
				System.out.print(m + "不是闰年");
			}
		}
	}
}
