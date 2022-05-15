package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range=6;
		int firstNum=0;
		int secNum=1;
		int sum;
		System.out.print(firstNum+" "+secNum);
		for(int i=1;i<=range;i++){
			sum = firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.print(" "+sum);


		}

	}

}
