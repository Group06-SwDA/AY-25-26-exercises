package solid.ocp.compliant;

public class SportDrivingMode implements DrivingModeStrategy {

    @Override
    public void apply(Vehicle vehicle) {
        vehicle.setPower(500);
        vehicle.setSuspensionHeight(10);
    }
}