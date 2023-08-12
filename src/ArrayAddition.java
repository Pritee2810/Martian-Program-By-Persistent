
public class ArrayAddition {
	public static void main(String[] args) {
		int[][] A = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
					};
		int[][] B = {
				{2,2,2},
				{2,2,2},
				{2,2,2}
					};

		System.out.println("Matrix A");
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matrix B");
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<B[i].length; j++) {
				System.out.print(B	[i][j] + " ");
			}
			System.out.println();
		}
		int[][] C = new int[3][3];
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<C[i].length; j++) {
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		System.out.println("Matrix C");
//		for(int i=0; i<C.length; i++) {
//			for(int j=0; j<C[i].length; j++) {
//				System.out.print(C[i][j] + " ");
//			}
//			System.out.println();
//		}
		for (int[] innerArray : C)
		{
		   for (int val : innerArray)
		   {
		       System.out.print(val + " ");
		   }
		   System.out.println();
		}
		
	}
}
