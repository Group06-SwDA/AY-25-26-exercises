package solid.lsp.violation;

public class Plane implements IVechicle {

	@Override
	public int changeGear(int n) {
		//do something to change the gear of the plane
		return n;
	}

	@Override
	public void accelerate() {
		//do something to accelerate the plane
		 System.out.println("Plane is accelerating");
	}

	@Override
	public void takeoff() {
		//do something to takeoff the plane
		 System.out.println("Plane is taking off");
		
	}

	@Override
	public void land() {
		//do something to land the plane
		 System.out.println("Plane is landing");
		
	}

	@Override
	public void switchPassengerAirBag(boolean on) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'switchPassengerAirBag'");
	}
	
	
}
