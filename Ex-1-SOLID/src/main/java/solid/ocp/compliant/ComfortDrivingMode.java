package solid.ocp.compliant;

public class ComfortDrivingMode implements DrivingMode {

    @Override
    public void apply(Vehicle vehicle) {
        vehicle.setPower(400);
        vehicle.setSuspensionHeight(20);
    }
}