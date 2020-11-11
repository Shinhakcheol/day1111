package Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int[] ar=new int[2];
		//콜렉션의 요소를 저장가능한 데이터타입 변수선언 : 콜션션
		for(int a:ar) {//순차적으로 알아서 접근해서 한개씩 변수저장해준다.
			System.out.println(a);
		}
		double[][] arr=new double[2][3];
		for(double[] x: arr) {
			
			for(double d:x) {
				System.out.print(d+"   ");
			}
			System.out.println();
		}
		//{arr[0], arr[1]}
		
		
	}

}
