package week1.day1;

public class Car {

	public void driveCar() {
		// TODO Auto-generated method stub
		System.out.println("Car started, ready to drive: Speed is 20 km inside city");
	}
	public void applyBrake() {
		// TODO Auto-generated method stub
		System.out.println("Brake Applied: Car stopped moving !!");
	}
	public void soundHorn() {
		// TODO Auto-generated method stub
		System.out.println("Horn pressed, to alert people!!!");
	}
	public void isPuncture() {
		// TODO Auto-generated method stub
		System.out.println("the wheel is punctured, call mechanic to fix the puncture :(");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car var = new Car();
		boolean puncture = true;
		boolean alert = true;
		System.out.println("***Welcome to Car assignment***");
		var.driveCar();
		if (alert)
		{
			var.soundHorn();
			var.applyBrake();
		}
		else if (puncture)
			var.isPuncture();
		else
			var.driveCar();
	}

}
