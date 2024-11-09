public class 2DArray
{
	public static void main(String[] args) {
	    // Initialize Array
		int[][] array = new int[5][4];
		
		// Declaration of Arrays
		array[0][0] = 10; array[0][1] = 20; array[0][2] = 30; array[0][3] = 40;
		array[1][0] = 80; array[1][1] = 70; array[1][2] = 60; array[1][3] = 50;
		array[2][0] = 90; array[2][1] = 100; array[2][2] = 110; array[2][3] = 120;
		array[3][0] = 160; array[3][1] = 150; array[3][2] = 140; array[3][3] = 130;
		array[4][0] = 170; array[4][1] = 180; array[4][2] = 190; array[4][3] = 200;
		
		// Printing all Elements of Array
		for(int i = 0; i < array.length; i++){
		    for(int j = 0; j < array[i].length; j++){
		        System.out.print(array[i][j] + "\t");
		    }
		}
	}
}
