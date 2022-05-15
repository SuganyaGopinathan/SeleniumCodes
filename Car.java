package week1.day1;

public class Car {

	public void applyBreak(){
		System.out.println("The Brake is applied");
	}

	public void applyGear(){
		System.out.println("The Gear is applied");
	}

	public void switchonAC(){
		System.out.println("The AC is switched on");
	}

	public void applyAcclerate(){
		System.out.println("The Acceleration is done");
	}
	public static void main(String[] args) {
		
		System.out.println("All the methods is invoked");
		Car car=new Car();
		car.applyBreak();
		car.applyGear();
		car.switchonAC();
		car.applyAcclerate();

	}

}
