
public class TowDArray {
	public static void main(String[] args) {
		int[][] worldPopulation = {
				{3453,2436,8655,9867,4567},
				{4567,2436,8355,9867},
				{8655,4567,8655,9867,2436}
		};
		System.out.println("World Population is: "+ worldPopulation + "and length is : " + worldPopulation.length);
		System.out.println("World Population is[0]: "+ worldPopulation[0] + "and length is[0] : " + worldPopulation[0].length);
		System.out.println("World Population is[1]: "+ worldPopulation[1] + "and length is[1] : " + worldPopulation[1].length);
		System.out.println("World Population is[2]: "+ worldPopulation[2] + "and length is[2] : " + worldPopulation[2].length);
		
		//read single element
		System.out.println("world population[1][2]: " + worldPopulation[1][2]);
		
		//write / update data
		worldPopulation[1][2] = 7777;
		
		System.out.println();
		System.out.println("updated data");
		System.out.println("world population[1][2]: " + worldPopulation[1][2]);
		
		//read all
		for(int i=0; i<worldPopulation.length; i++) {
			for(int j=0; j<worldPopulation.length; j++) {
				System.out.print(worldPopulation[i][j] + " ");
			} 
			System.out.println();
		}
		
		int[][] arr = new int[3][5];
		//Three 1D array with 5 elements each
		System.out.println();
		for(int m=0; m<arr.length; m++) {
			for(int n=0; n<arr.length; n++) {
				System.out.print(arr[m][n] + " ");
			} 
			System.out.println();
		}
		//giving sizes, we need to put data later. initial value of elements will 0
		//giving data first, no need to give size
		
		//explore enhanced for loop for 2D array
	}
}
