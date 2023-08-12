package interface1;

public class InterfaceDemo {
	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20,10,1);
		
		System.out.println("Gear is: " + mountainBike.getGear());
		System.out.println("Height is: " + mountainBike.getSeatHeight());
		System.out.println("Speed is: " + mountainBike.getSpeed());
		
		mountainBike.applyBreak(1);  
			System.out.println("Speed is: " + mountainBike.getSpeed());
			
		mountainBike.speedUp(10);
			System.out.println("Speed is: " + mountainBike.getSpeed());
	}
}
