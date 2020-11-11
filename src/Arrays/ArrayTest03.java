package Arrays;

public class ArrayTest03 {

	public static void main(String[] args) {
		int m=4;
		int n=4;
		int[][] arr=new int[m][n];
		int count=1;
		/////////////////////////////////////////////
		//데이터 입력
		int row = arr.length;
		
		for(int i=row-1;i>=0;i--) {
			
			int columns=arr[i].length;
			
			for(int j=columns-1; j>=0;j--) {
				
				arr[j][i]=count;
				System.out.printf("%2d ",count++);
			}
			System.out.println();
		}
		System.out.println();
		//33
		//23
		//13
		//03
		
		//16 12 08 04
		//15 11 07 03
		//14 10 06 02
		//13 09 05 01
		

		
		
		
		//순차접근 데이터 출력
		////////////////////////////////////////////////////////////////
		for(int[] a : arr) {
			for(int x :a) {
				System.out.printf("%02d ",x); //d 10진법 o 8진법 x 16진법
			}
			System.out.println();
		}
		/////////////////////////////////////////////////////////////////////

	}

}
