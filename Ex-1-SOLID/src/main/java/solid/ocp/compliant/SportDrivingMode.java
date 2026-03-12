package solid.ocp.compliant;

public class SportDrivingMode implements DrivingMode {

    @Override
    public void apply(Vehicle vehicle) {
        vehicle.setPower(500);
        vehicle.setSuspensionHeight(10);
    }
}