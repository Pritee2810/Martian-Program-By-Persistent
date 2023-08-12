package martian1_inheritance;

public class MountainBike extends Bicycle{    // inheritance child class

	public int seatHeight;
	
	public MountainBike(int startHeight, int startSpeed, int startGear) {
		super(startSpeed, startGear);
		this.seatHeight = startHeight;
	}
	
}
