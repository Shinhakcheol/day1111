package Arrays;

public class ArrayTest06 {

	public static void main(String[] args) {
		int m = 4;
		int n = 4;
		int[][] arr = new int[m][n];
		int count = 1;
		/////////////////////////////////////////////
		// 데이터 입력
		int aa=1;
		int row = arr.length * 2 - 1;
		for (int i = 0; i < row; i++) {// 행
	
			if (i < m) {//i 0 1 2 3
				int x = 0;
				int y = i;
				for (int j = 0; j <= i; j++) { // 열
					arr[x++][y--] = count++;
				}
			} else {// i : 4 5 6
				//int x=i-(m-1);
				int x=aa++;
				int y=n-1;
				for(int j=i;j<row;j++) {
				
				arr[x++][y--]=count++;	
				}
			}
		}//for out

		// 1 2 4 7      
		// 3 5 8 11    
		// 6 9 12 14   
		// 10 13 15 16
		
		//arr[0][0]=1
		
		//arr[0][1]=2
		//arr[1][0]=3
		
		//arr[0][2]=4
		//arr[1][1]=5
		//arr[2][0]=6
		
		//arr[0][3]=7
		//arr[1][2]=8
		//arr[2][1]=9
		//arr[3][0]=10
		

		// 순차접근 데이터 출력
		////////////////////////////////////////////////////////////////
		for (int[] a : arr) {
			for (int x : a) {
				System.out.printf("%2d ", x); // d 10진법 o 8진법 x 16진법
			}
			System.out.println();
		}
		/////////////////////////////////////////////////////////////////////

	}

}
