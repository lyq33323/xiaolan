package pak;

public class Find {
   void zore(int[][] array){
	   for (int i = 0; i < array.length; i++) {
			  for (int j = 0; j < array[i].length; j++) {
				 if(array[i][j]==0){
					 System.out.println(j+","+i);
					 return;
			     }	
			  }
			}
        }
   void left(int[][] array){
	   for (int i = 0; i < array.length; i++) {
			  for (int j = 0; j < array[i].length; j++) {
				 if(array[i][j]==10){
					 System.out.println(j+","+i);
					 return;
			     }	
			  }
			}
        }
   void right(int[][] array){
	   for (int i = 0; i < array.length; i++) {
			  for (int j = 0; j < array[i].length; j++) {
				 if(array[i][j]==12){
					 System.out.println(j+","+i);
					 return;
			     }	
			  }
			}
        }
   void up(int[][] array){
	   for (int i = 0; i < array.length; i++) {
			  for (int j = 0; j < array[i].length; j++) {
				 if(array[i][j]==5){
					 System.out.println(j+","+i);
					 return;
			     }	
			  }
			}
        }
   void down(int[][] array){
	   for (int i = 0; i < array.length; i++) {
			  for (int j = 0; j < array[i].length; j++) {
				 if(array[i][j]==11){
					 System.out.println(j+","+i);
					 return;
			     }	
			  }
			}
        }
   
   
}
