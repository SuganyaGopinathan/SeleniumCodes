package week1.day1;

public class TwoWheeler {

	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=5673000169266L;
	boolean isPunctured=false;
	String bikeName="Royal Enfield Classic 350";
	double runningKM=99999.8;
	
	public static void main(String[] args) {
		

		TwoWheeler tw=new TwoWheeler();
		System.out.println("The Number of wheels count = " +tw.noOfWheels);
		System.out.println("The Number of Mirror count = " +tw.noOfMirrors);
		System.out.println("The Chassis Number is " +tw.chassisNumber);
		System.out.println("Is the bike is punctured " +tw.isPunctured );
		System.out.println("The Bike Name is = " +tw.bikeName);
		System.out.println("The Running KM value is = " +tw.runningKM);
		
	}

}

