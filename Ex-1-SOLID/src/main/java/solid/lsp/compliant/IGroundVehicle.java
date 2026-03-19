package solid.lsp.compliant;

import solid.lsp.violation.IVechicle;

public interface IGroundVehicle extends IVechicle{
    public void switchPassengerAirBag(boolean on);
}
