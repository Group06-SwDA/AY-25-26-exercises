package solid.ocp.compliant;

public class EconomyDrivingMode implements DrivingModeStrategy {

    @Override
    public void apply(Vehicle vehicle) {
        vehicle.setPower(300);
        vehicle.setSuspensionHeight(25);
    }
}
