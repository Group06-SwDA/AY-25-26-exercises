package solid.lsp.compliant;

public class PlaneRef implements IFlyingVehicle {

	@Override
	public int changeGear(int n) {
		// do sopmething to change the gear of the plane
		System.out.println("Plane is changing gear to " + n);
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

	

}
