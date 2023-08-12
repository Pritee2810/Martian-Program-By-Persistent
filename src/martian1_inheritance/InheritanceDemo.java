package martian1_inheritance;

public class InheritanceDemo {			//inheritance main method
	public static void main(String[] args) {	
		MountainBike mountainBike = new MountainBike(20,10,1);
		System.out.println("Gear is: " + mountainBike.gear);
		System.out.println("Seat height is: " + mountainBike.seatHeight);
		System.out.println("Bike speed is: " + mountainBike.speed);
		mountainBike.applyBreak(1);
		System.out.println("Bike speed after applying speed is: " + mountainBike.speed);
	}
}
