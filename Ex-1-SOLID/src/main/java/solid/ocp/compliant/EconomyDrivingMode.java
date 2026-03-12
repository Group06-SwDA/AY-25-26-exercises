package solid.ocp.compliant;

public class EconomyDrivingMode implements DrivingMode {

    @Override
    public void apply(Vehicle vehicle) {
        vehicle.setPower(300);
        vehicle.setSuspensionHeight(25);
    }
}
