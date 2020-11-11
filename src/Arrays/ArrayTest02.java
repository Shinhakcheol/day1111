package Arrays;

public class ArrayTest02 {

	public static void main(String[] args) {
		int m=4;
		int n=4;
		int[][] arr=new int[m][n];
		int count=1;
		/////////////////////////////////////////////
		//데이터 입력
		int row = arr.length;
		
		for(int i=0;i<row;i++) {
			
			int columns=arr[i].length;
			
			for(int j=0; j<columns;j++) {
				
				arr[j][i]=count++;
			}
		}
		//1 5 9 13
		//2 6 10 14
		//3 7 11 15
		//4 8 12 16
		
		
		
		
		
		
		
		
		//순차접근 데이터 출력
		////////////////////////////////////////////////////////////////
		for(int[] a : arr) {
			for(int x :a) {
				System.out.printf("%2d ",x); //d 10진법 o 8진법 x 16진법
			}
			System.out.println();
		}
		/////////////////////////////////////////////////////////////////////

	}

}
