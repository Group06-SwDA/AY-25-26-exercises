package solid.ocp.compliant;


public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(DrivingModeStrategy mode){
        mode.apply(vehicle);
    }
}
