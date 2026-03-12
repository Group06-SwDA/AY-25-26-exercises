package solid.ocp.compliant;

public class ComfortDrivingMode implements DrivingModeStrategy {

    @Override
    public void apply(Vehicle vehicle) {
        vehicle.setPower(400);
        vehicle.setSuspensionHeight(20);
    }
}