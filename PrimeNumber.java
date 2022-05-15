package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int input =13;
		boolean flag =true;

		for (int i=2;i<=input/2;i++){
			int rem=input%i;
			if (rem==0){
				flag=false;
				break;
			}
		}

		if (flag==true){
			System.out.println(input+ " is prime number ");
		}
		else{
			System.out.println(input+ " is not prime number ");
		}
	}

}
