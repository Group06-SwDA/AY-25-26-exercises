package solid.srp.compliant;

public class FuelPump {

    public void reFuel(Vehicle vehicle){
        int remainingFuel = vehicle.getRemainingFuel();
        int additionalFuel = vehicle.getMaxFuel() - remainingFuel;
        vehicle.setRemainingFuel(remainingFuel + additionalFuel);
    }

    public void reFuel( Vehicle vehicle, int newFuel){
        int remainingFuel = vehicle.getRemainingFuel();
        
        if(remainingFuel + newFuel > vehicle.getMaxFuel())
             vehicle.setRemainingFuel(vehicle.getMaxFuel());
       else 
            vehicle.setRemainingFuel(remainingFuel + newFuel);           
    }
}
