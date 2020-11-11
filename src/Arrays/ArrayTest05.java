package Arrays;

public class ArrayTest05 {

	public static void main(String[] args) {
		int m = 4;
		int n = 4;
		int[][] arr = new int[m][n];
		int count = 1;
		/////////////////////////////////////////////
		// 데이터 입력
		int row = arr.length;

		for (int i = 0; i < row; i++) {

			int columns = arr[i].length;

			if (i % 2 == 0) {
				// i : 0,2
				// j증가패던
				for (int j = 0; j < columns; j++) {

					arr[j][i] = count;
					System.out.printf("%2d ", count++);
				}
			} else {
				// i :1,3
				// j감소패던

				for (int j = columns - 1; j >= 0; j--) {

					arr[j][i] = count;
					System.out.printf("%2d ", count++);
				}
			}

			System.out.println();
		}
		System.out.println();
		
		//  01 08 09 16
		//  02 07 10 15
		//  03 06 11 14
		//  04 05 12 13

		// 순차접근 데이터 출력
		////////////////////////////////////////////////////////////////
		for (int[] a : arr) {
			for (int x : a) {
				System.out.printf("%02d ", x); // d 10진법 o 8진법 x 16진법
			}
			System.out.println();
		}
		/////////////////////////////////////////////////////////////////////

	}

}
