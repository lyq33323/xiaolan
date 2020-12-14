package pak;

import java.util.Scanner;

public class Two {


	public int fb(int a)
	{
		int result[] =  { 0, 1 };
		
		if (a < 2)
		{
			return result[a];
		}
		int f0 = 0;
		int f1 = 1;
		int f2 = 0;
		for (int i = 2; i <= a; i++)
		{
			f2 = f1 + f0;
			f0 = f1;
			f1 = f2;
		}
		return f2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Scanner scn =new Scanner(System.in);
   int a = scn.nextInt();
   if(a>40||a<1) {
	   System.out.println("请输入1到40之间的数！");
   }else {
	   Two Fb = new Two();
	   System.out.println(Fb.fb(a));
   }

    
		
  }

}
