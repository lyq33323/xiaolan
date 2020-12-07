package pak;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int array[][]={
		   {1,2,3,4,5,6},
		   {7,8,9,10,0,12},
		   {8,8,9,10,11,12},
		   {7,8,3,10,11,12},			
		   {88,66,92,102,151,999}
		   
    };
   
   for (int i = 0; i < array.length; i++) {
	  for (int j = 0; j < array[i].length; j++) {
		 System.out.print(array[i][j]+" ");
	   }
	   System.out.println();
      }
	}

}
