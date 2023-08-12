package interface1;

class MountainBike implements Bicycle{    // inheritance child class

		private int seatHeight;
		private int gear;
		private int speed;
		
		public int getSeatHeight() {
			return seatHeight;
		}

		public void setSeatHeight(int seatHeight) {
			this.seatHeight = seatHeight;
		}

		public int getGear() {
			return gear;
		}

		public void setGear(int gear) {
			this.gear = gear;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		
		public MountainBike(int startHeight, int startSpeed, int startGear) {
			seatHeight = startHeight;
			gear = startGear;
			speed = startSpeed;
		}

		@Override    //represent we have overrided parent methods
		public void applyBreak(int decrement) {   //java force to implement methods/ define methods of parent interface
			speed = speed - decrement;
			
		}

		@Override
		public void speedUp(int increment) {
			speed = speed + increment;
			
		}

}


